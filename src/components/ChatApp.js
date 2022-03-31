import { useEffect, useState } from "react";
import { socket } from "./socketConfig";

function ChatApp() {
    
    const [message, setMessage] = useState("");
    const handleMessage = (e) => {
        setMessage(e.target.value);
    };
    useEffect(() => {
        socket.on("message", (data) => {
            console.log(data);
        });
    }, []);
    const handleSend = () => {
        socket.emit("message", message);
    };
    return (
        <div>
            <h1>ChatApp</h1>
            <input type="text" value={message} onChange={handleMessage}/>
            <input type="button" value="Send" onClick={handleSend}/>
        </div>
    );
}

export default ChatApp;