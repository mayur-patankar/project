import { useEffect, useRef, useState } from "react";
import "./App.css";

import { io } from "socket.io-client";

function App() {
  const socket = useRef();

  useEffect(() => {
    socket.current = io("ws://localhost:9248");

    socket.current.on("connnection", () => {
      console.log("connected to server");
    });

    socket.current.on("message", (data) => {
      console.log(data);
    });
  }, []);

  const handleClick = () => {
    console.log(message, "printing before emiting");
    socket.current.emit("message", message);
  };

  const [message, setMessage] = useState("");
  const getMessage = (e) => {
    setMessage(e.target.value);
  };

  const [username, setUser] =useState("");
  const getUser = (e) => {
    setUser(e.target.value);
  };

  const handleUser = () => {
    socket.current.emit("user", username);
  };

  return (
    <div className="App">
      <p>Socket.io CLIENT</p>
      <input type="text" value={username} placeholder="username" onChange={getUser}/>
      <input type="button" value="click" onClick={handleUser}/>
      <input type="text" value={message} placeholder="your message goes here" onChange={getMessage}/>
      <input type="button" value="SEND" onClick={handleClick}/>
    </div>
  );
}

export default App;