import { useState } from "react";
import { Navigate, useNavigate } from "react-router-dom";
import { socket } from "./socketConfig";

function Home() {
    const [username, setUser] = useState("");
    const getUser = (e) => {
        setUser(e.target.value);
    };

    let navigate = useNavigate();

    const handleClick = () => {
        socket.emit("user", username);
        navigate("/chat");
    };

    return (
        <div>
            <h1>home</h1>
            <input type="text" value={username} onChange={getUser}/>
            <input type="button" value="click" onClick={handleClick}/>
        </div>
    );
}

export default Home;