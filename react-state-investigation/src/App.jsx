import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'

function App() {

  const[count, setCount] = useState(0);
  const[name, setName] = useState("Aidan");
  const[county, setCounty] = useState("Cork");
  const[angle, setAngle] = useState(0);
  const[darkMode, setDarkMode] = useState(false);

  // note: you can have an object as a state variable
  const[user, setUser] = useState({
    id:1, 
    name:"Alice", 
    email:"alice@gmail.com", 
    active:false
  });

  console.log("App() is called every time the component is rerendered")
  // let count = 0;

  const onClickPlus = () => {
    console.log(`onClickPlus called : ${count}`);
    setCount(count + 1);
  }

  const onChangeName = (evt) => {
    console.log(`onChangeName called`);
    console.log(evt);
    setName(evt.target.value);
  }
  const styles = {
    border:`${angle}px solid black`,
    transform: `rotate(${angle}deg)`
  }

  const onChangeUserName = evt => {

    // you can't modify a state variable directly
    // user.name = evt.target.value;


    /*
    setUser({
      id: user.id, 
      name: evt.target.value, 
      email: user.email, 
      active: user.active
    });
    */

        //let updatedUser = user; // this does not copy the user object
    //let updatedUser = {...user};
    //updatedUser.name = evt.target.value;
    //setUser(updatedUser);

    // do this as a single operation
    setUser({...user, name:evt.target.value});

  }
  return (
    <div className={darkMode ? "dark" : "light"}>
    <h1>State Investigation</h1>

    <table>
      <tr>
        <td>Id</td><td>{user.id}</td>
      </tr>
      <tr>
        <td>Name</td>
        <td>{user.name}</td>
        <td><input value={user.name} onChange={onChangeUserName}/></td>
      </tr>      
      <tr>
        <td>Email</td><td>{user.email}</td>
        <td>
          <input 
          value={user.email} 
          onChange={evt => setUser({...user, email:evt.target.value})}/></td>
      </tr>      
      <tr>
        <td>Active</td>
        <td>{user.active ? "Active" : "Inactive"}</td>
        <td>
          <input 
            type="checkbox" 
            checked={user.active} 
            onChange={evt => setUser({...user, active: evt.target.checked})}/>
        </td>
      </tr>      
    </table>

    <hr />




    Dark Mode:{darkMode ? "Dark" : "Light"}
    <input 
      type="checkbox" 
      checked={darkMode} 
      onChange={evt => setDarkMode(evt.target.checked)}/><br/>

    <input type="range" value={angle} onChange={evt => setAngle(evt.target.value)}/>

    <div className="box" style={styles}>
      Angle:{angle}
    </div>





    <input value={county} onChange={evt => setCounty(evt.target.value)}/><br/>
    { county }

    <input value={name} onChange={onChangeName}/> <br/>
    { name } 

    <br/>
    { count }

    <hr/>
    <button onClick={onClickPlus}>+</button>


    </div>
  )
}

export default App
