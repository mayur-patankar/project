import { Navigate } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import { Nav, Container, NavDropdown, Navbar, Row, Col } from "react-bootstrap";
import { useState } from "react";
import axios from "axios";
import "./login.css";
import UserProfile from "./User";
import "./config/socketconfig"
import { socket } from "./config/socketconfig";

function Login () {
    const navigate = useNavigate("");
    const [email, setEmail] = useState("");
    const handleEmail = (e) => {
        setEmail(e.target.value);
    }

    const [pass, setPass] = useState("");
    const handlePass = (e) => {
        setPass(e.target.value);
    }

    const handleLogin = async () => {
        const data = {
            email : email,
            password : pass
        };
        const url = "http://localhost:8080/login";
        const result = await axios.post(url, data);
        const l = result.data.length;
        if(l!==1)
        {
            alert("check login credentials");
        }
        else
        {
            var list = result.data;
            var user = list[0];
            UserProfile.setUser(user);
            socket.emit("user", user.email);
            navigate("/myProds");
        }
        
    }
    return(
        <div>
            <h1>login</h1>
            <Navbar bg="light" expand="lg">
            <Container>
            <Navbar.Brand href="#home">ClickOnix</Navbar.Brand>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />
            <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
                <Nav.Link href="#home">Home</Nav.Link>
                <Nav.Link href="/register">Register</Nav.Link>
                    <NavDropdown title="Dropdown" id="basic-nav-dropdown">
                        <NavDropdown.Item href="#action/3.1">Action</NavDropdown.Item>
                        <NavDropdown.Item href="#action/3.2">Another action</NavDropdown.Item>
                        <NavDropdown.Item href="#action/3.3">Something</NavDropdown.Item>
                            <NavDropdown.Divider />
                        <NavDropdown.Item href="#action/3.4">Separated link</NavDropdown.Item>
                </NavDropdown>
            </Nav>
            </Navbar.Collapse>
            </Container>
            </Navbar>
            <div>
                <Container>
                    <Row>
                        <Col></Col>
                        <Col>
                            <input className="ip" type="text" placeholder="Enter email address .. " value={email} onChange={handleEmail}/>
                            <br/>
                            <input className="ip" type="text" placeholder="Enter your password .. " value={pass} onChange={handlePass}/>
                            <br/>
                            <input className="btn" type="button" value="Login" onClick={handleLogin}/>
                        </Col>
                        <Col></Col>
                    </Row>
                </Container>
            </div>
        </div>
    );
}

export default Login;