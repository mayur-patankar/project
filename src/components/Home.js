import { Navigate } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import { Nav, Container, NavDropdown, Navbar, Row, Col } from "react-bootstrap";

import "./home.css";

function Home () {
    return(
        <div>
            <h1>home</h1>
            <Navbar bg="light" expand="lg">
            <Container>
            <Navbar.Brand href="#home">ClickOnix</Navbar.Brand>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />
            <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
                <Nav.Link href="#home">Home</Nav.Link>
                <Nav.Link href="/login">Login</Nav.Link>
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
            <Container fluid>
                <Row>
                    <Col>
                        1
                        <Row>3</Row>
                    </Col>
                    <Col>2</Col>
                </Row>
            </Container>
        </div>
        
    );
}

export default Home;