import { Link } from "react-router-dom";

const MainNavigation = () => {

    return (
      <nav>
        <Link to="/">Home</Link> |
        <Link to="/about">About</Link> | 
        <Link to="/contact">Contact Us</Link> | 
        <Link to="/effect">Effect Investigation</Link>
      </nav>
    )
}

export default MainNavigation;