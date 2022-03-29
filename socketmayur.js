const http = require("http");;
const express = require("express");
const SSocket = require("socket.io");
const app = express();
const cors = require("cors");
app.use(cors());
const server = http.createServer(app);
const io = SSocket(server, {
    transports: ["polling"],
    cors: {
      origin: "*",
    }
});
app.use(function (req, res, next) {

  // Website you wish to allow to connect
  res.setHeader('Access-Control-Allow-Origin', '*');

  // Request methods you wish to allow
  res.setHeader('Access-Control-Allow-Methods', 'GET, POST, OPTIONS, PUT, PATCH, DELETE');

  // Request headers you wish to allow
  res.setHeader('Access-Control-Allow-Headers', 'X-Requested-With,content-type');

  // Set to true if you need the website to include cookies in the requests sent
  // to the API (e.g. in case you use sessions)
  res.setHeader('Access-Control-Allow-Credentials', true);

  // Pass to next layer of middleware
  next();
});
const port = 9248;


var suser=[];

io.on("connection", socket => {
    console.log("a new client is connected");
    
    socket.on("user", (user) => {
        console.log(user, "user from emit");
      console.log(`message from ${socket.id} : `);
      const data = {
          username : user,
          sockid : socket.id,
      };
      suser.push(data);
      console.log(suser);
    });

    let mess;
    let to;
    let from;

    socket.on("message", (message) => {
      const arr = message.split("//");
      from = arr[0];
      mess = arr[1];
      to = arr[2];
        console.log(message, "from emit");
      //console.log(`message from ${socket.id} : ${message.message}`);
      console.log(mess, "printing mess after converting");

      for(var i = 0; i<suser.length; i++)
    {
      console.log("inside for");
      let something = suser[i];
      let name = something.username;
      if(name===to)
      {
        console.log("inside if");
        sock = something.sockid;
        io.to(sock).emit("message", mess);
        console.log("emited", mess);
      }
    }

    });


});

server.listen(port, () => {
    console.log(`App running on port ${port}...`);
  });
  