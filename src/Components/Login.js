import { useEffect, useState } from "react";
import axios from "axios";
import { Navigate, useNavigate } from "react-router-dom"

export function Login()
{
    let navi = useNavigate();
            
    const [mail, setMail] = useState("");
    const mailhandler = (e) =>{
        setMail(e.target.value);
    }
    const [pass, setPass] = useState("");
    const passhandler = (e) =>{
        setPass(e.target.value);
    } 
    
    var result = useState(null);

    const logusin = async () => {
        let url = "http://localhost:8080/getLoginDetails";
        const data = {
            email : mail,
            password : pass,
        }
        console.log(data);
        result = await axios.post(url, data);
        console.log(result.data);
        const user = result.data;
        console.log(user.role);
        if(user.role=="bidder")
        {
            sessionStorage.setItem("user",user);
            navi("/bidder");
        }
        else if(user.role=="seller")
        {
            sessionStorage.setItem("user",user);
            navi("/seller");
        }
        else if(user.role=="admin")
        {
            sessionStorage.setItem("user",user);
            navi("/admin");
        }
        else
        {
            alert("check email or password");
        }
    }

    return (
        <div>
            <h1>login</h1>
            <input type="text" value={mail} onChange={mailhandler}  placeholder="Email address"/>
            <input type="text" value={pass} onChange={passhandler}  placeholder="password here"/>
            <input type="button" value="Submit" onClick={logusin}/>
        </div>
    );
}