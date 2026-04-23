import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import Message from './Message.jsx';

// rules of JSX
// JSX looks like html but it actually isn't - it is html with JS
// JSX must return a single parent / root tag
// you can use <> </> a fragment to satisfy the requirement 
// of a single root but it doesn't create a dom element
// use {} to put in js - simplest is just evaluate a variable


// React component is a custom html tag
// but in reality it is a function that returns JSX
function App() {

  const m = {
    title: "My Message 1", 
    text: "This is my message 1", 
    colour: "red", 
    spacing: "5px"
  }

  //const {tt:title} = m;

  //console.log(tt);



  // destructuring - extracting things from an object (or an array)
  // ... - spread operator - takes the remaining items from the object (or array)
  const {title, text, ...rest} = m;

  console.log(`title = ${title}`);
  console.log(`text = ${text}`);
  console.log(rest);

  // same thing works with arrays
  const numbers = [1, 2, 3, 4, 5];

  const [n1, n2, ...others] = numbers;
  console.log(`n1=${n1}`);
  console.log(`n2=${n2}`);
  console.log(`others=${others}`);

  const numbersCopy = [...numbers];
  console.log(numbersCopy);

  const messages = [
    {title:"M1", text:"This is M1"},
    {title:"M2", text:"This is M2"},
    {title:"M3", text:"This is M3"},
    {title:"M4", text:"This is M4"}
  ]
  
  return (
    <>
      { messages.map(message => (
        <Message title={message.title} text={message.text}/>
      ))
      }
    </>
  )
}

export default App
