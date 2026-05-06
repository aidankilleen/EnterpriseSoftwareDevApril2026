import { Link, Outlet } from 'react-router-dom'
import './App.css'

function App() {


  return (
    <>
      <h2>Single Page Application Investigation</h2>

      <nav>
        <Link to="/">Home</Link> |
        <Link to="/about">About</Link> | 
        <Link to="/contact">Contact Us</Link> | 
        <Link to="/effect">Effect Investigation</Link>
        
      </nav>
      <main>
        <Outlet/>
      </main>

    </>
  )
}

export default App
