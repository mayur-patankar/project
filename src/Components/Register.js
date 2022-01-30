import { useState } from "react";
import axios from "axios";

export function Register()
{
    const [username, setUsername] = useState("");
    const onchangename = (e) =>{
        setUsername(e.target.value)
    }
    const [email, setEmail] = useState("");
    const onchangemail = (e) =>{
        setEmail(e.target.value)
    }
    const [mobile, setMobile] = useState("");
    const onchangemobile = (e) =>{
        setMobile(e.target.value)
    }
    const [password, setPassword] = useState("");
    const onchangepass = (e) =>{
        setPassword(e.target.value)
    }

    const [role, setRole] = useState("");
    const rolesetter = (e) => {
        setRole(e.target.value);
    }

    const [bidder, setBidder] = useState("bidder");
    const [seller, setSeller] = useState("seller");

    const addUser = async () => {
        const url = "http://localhost:8080/postUser";
        const data = {
            u_name : username,
            u_mail : email,
            u_no : mobile,
            u_pass : password,
            role : role,
        }
        console.log(data);
        await axios.post(url, data);
    }

    return(
        <div>
            <input type="text" value={username} onChange={onchangename} placeholder="user name"/>
            <input type="text" placeholder="user email" value={email} onChange={onchangemail}/>
            <input type="text" placeholder="user mobile no" value={mobile} onChange={onchangemobile}/>
            <input type="text" placeholder="user password" value={password} onChange={onchangepass}/>
            <input type="radio" value={bidder} onClick={rolesetter}/>bidder
            <input type="radio" value={seller} onClick={rolesetter}/>seller
            <input type="button" value="Submit" onClick={addUser}/>
        </div>
    );
}