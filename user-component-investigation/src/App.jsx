import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import User from './User';

function App() {

  const [user, setUser] = useState({
    id: 1, 
    name: "Alice", 
    email: "alice@gmail.com", 
    active: true
  });

  return (
    <>
    <h1>User Component Investigation</h1>
      <User user={user} setUser={setUser}/>
    <hr/>
    { JSON.stringify(user) }
    </>
  )
}

export default App
