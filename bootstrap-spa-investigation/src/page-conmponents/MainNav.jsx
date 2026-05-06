import { Container, Nav, Navbar } from "react-bootstrap";
import { Link } from "react-router-dom";

const MainNav = () => {

    return (
        <Navbar bg="dark" variant="dark" expand="lg">

                <Navbar.Brand as={Link} to="/">
                MyApp
                </Navbar.Brand>

                <Navbar.Toggle aria-controls="basic-navbar-nav" />

                <Navbar.Collapse id="basic-navbar-nav">
                <Nav className="me-auto">
                    <Nav.Link as={Link} to="/">
                    Home
                    </Nav.Link>

                    <Nav.Link as={Link} to="/about">
                    About
                    </Nav.Link>

                    <Nav.Link as={Link} to="/contact">
                    Contact
                    </Nav.Link>

                    <Nav.Link as={Link} to="/users">
                    Users
                    </Nav.Link>
                </Nav>
                </Navbar.Collapse>

        </Navbar>
    )
}

export default MainNav;