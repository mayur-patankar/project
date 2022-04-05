import { useState } from "react";
import { Navigate } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import { Nav, Container, NavDropdown, Navbar, Row, Col } from "react-bootstrap";
import "./register.css";
import axios from "axios";

function Register () {
    const navigate = useNavigate();
    const [fname, setfname] = useState("");
    const handleFname = (e) => {
        setfname(e.target.value);
    }

    const [lname, setLname] = useState("");
    const handleLname = (e) => {
        setLname(e.target.value);
    }

    const [email, setEmail] = useState("");
    const handleEmail = (e) => {
        setEmail(e.target.value);
    }

    const [mobile, setMobile] = useState("");
    const handleMobile = (e) => {
        setMobile(e.target.value);
    }

    const [pass, setPass] = useState("");
    const handlePass = (e) => {
        setPass(e.target.value);
    }

    const [checkPass, setcPass] = useState("");
    const CheckPass = (e) => {
        setcPass(e.target.value);
        
    }

    let [role, setRole] = useState("");
    const getRole = (e) => {
        setRole(e.target.value);
        console.log(role);
    }

    const handleSubmit = async () => {
        if(checkPass.localeCompare(pass)!=0)
        {
            alert("check your pass");
        }
        else
        {
            const data = {
                fname : fname,
                lname : lname,
                email : email,
                mobile : mobile,
                password : pass,
                role : role,
            };
            console.log(data);
            const url = "http://localhost:8080/register"
            const ret = await axios.post(url,data);
            navigate("/login");
        }
        
    }

    return(
        <div>
            <h1>Register</h1>
            <Navbar bg="light" expand="lg">
            <Container>
            <Navbar.Brand href="#home">ClickOnix</Navbar.Brand>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />
            <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
                <Nav.Link href="#home">Home</Nav.Link>
                <Nav.Link href="/login">Login</Nav.Link>
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
            <Container>
                <Row>
                    <Col></Col>
                    <Col>
                    <br/>
                        <input className="ip" placeholder="first name" type="text" onChange={handleFname} value={fname}/>
                        <br/>
                        <input className="ip" placeholder="last name" type="text" onChange={handleLname} value={lname}/>
                        <br/>
                        <input className="ip" placeholder="your email" type="text" onChange={handleEmail} value={email}/>
                        <br/>
                        <input className="ip" placeholder="your mobile" type="text" onChange={handleMobile} value={mobile}/>
                        <br/>
                        <input className="ip" placeholder="Your password" type="password" onChange={handlePass} value={pass}/>
                        <br/>
                        <input className="ip" placeholder="Re-enter your password" type="password" onChange={CheckPass} value={checkPass}/>
                        <br/>
                        <input classname="rd" type="radio" value="Customer" onClick={getRole}/>Customer
                        <input classname="rd" type="radio" value="Buyer" onClick={getRole}/>Buyer
                        <br/>
                        <input  type="button" value="Submit" onClick={handleSubmit}/>
                    </Col>
                    <Col></Col>
                </Row>
            </Container>
        </div>
    );
}

export default Register;