import { Navigate } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import { Nav, Container, NavDropdown, Navbar, Row, Col } from "react-bootstrap";
import { useState, useEffect } from "react";
import axios from "axios";

function Order() {

    useEffect( () => {
        async function checkOrder() {
            const order = JSON.parse(window.sessionStorage.getItem("order"));
            const user = JSON.parse(window.sessionStorage.getItem("user"));
            const data = {
                id : user.custid
            };
            const url = "http://localhost:8080/getPaymentByUser";
            await axios.post(url, data);
        }
        //Runs on every render
        checkOrder();
    }, []);

    return (
        <div>
            <h1>Order /order</h1>
            <Navbar bg="light" expand="lg">
                <Container>
                <Navbar.Brand href="/">ClickOnix</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
                <Navbar.Collapse id="basic-navbar-nav">
                <Nav className="me-auto">
                    <Nav.Link href="/cart">Cart</Nav.Link>
                    <Nav.Link href="/messenger">Chat</Nav.Link>
                </Nav>
                </Navbar.Collapse>
                </Container>
            </Navbar>

        </div>
    );
}

export default Order;