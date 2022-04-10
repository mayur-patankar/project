import { Navigate } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import { Nav, Container, NavDropdown, Navbar, Row, Col, Carousel } from "react-bootstrap";

import "./home.css";

function Home () {
    return(
        <div>
            <h1>home</h1>
            <Navbar bg="light" expand="lg">
            <Container>
            <Navbar.Brand href="/">ClickOnix</Navbar.Brand>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />
            <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
                <Nav.Link href="/login">Login</Nav.Link>
                <Nav.Link href="/register">Register</Nav.Link>
            </Nav>
            </Navbar.Collapse>
            </Container>
            </Navbar>
            <Container fluid>
                  <Carousel>
                        <Carousel.Item><img className="d-block w-100" src="https://images-eu.ssl-images-amazon.com/images/G/31/img17/AmazonPay/Diwali17/GW/Friday1/ART_wave1_HDFC_750x375_3.jpg" alt="First slide" />
                            <Carousel.Caption>
                                <h3>First slide label</h3>
                                <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                            </Carousel.Caption>
                        </Carousel.Item>
                        <Carousel.Item><img className="d-block w-100" src="https://akm-img-a-in.tosshub.com/indiatoday/images/story/201901/OnePlus_Twitter_ad.jpeg?awLM5c5QMFqD_PO.p3bNiPtQveb6fLSZ" alt="Second slide" />
                            <Carousel.Caption>
                                <h3>Second slide label</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                            </Carousel.Caption>
                        </Carousel.Item>
                        <Carousel.Item><img className="d-block w-100" src="http://commercial-song.net/wp-content/uploads/2020/08/dell_xps_13_commercial.jpg" alt="Third slide" />
                            <Carousel.Caption>
                                <h3>Third slide label</h3>
                                <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                            </Carousel.Caption>
                        </Carousel.Item>
                    </Carousel>
            </Container>
        </div>
        
    );
}

export default Home;