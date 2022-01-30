import { Navigate, useNavigate } from "react-router-dom"
import { Login } from "./Login";
import { Register } from "./Register";

export function Home()
{
    let navi = useNavigate();
    const Loginh = () => {
        // ....
        console.log("inside Login")
        navi("/login");
      };

    const Registerh = () => {
        navi("/register");
    };
    return (
        <div>
            <h1>hi</h1>
            <input type="button" value="Login here .." onClick={Loginh}/>
            <input type="button" value="Register here .." onClick={Registerh}/>
        </div>
    );
}