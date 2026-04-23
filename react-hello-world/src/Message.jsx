import './Message.css';

function Message({message}) {

    const {title, text} = message;
    //console.log("props:");
    //console.log(message);
    //const title = "";
    //const text = "";
  return (
    <div className = "message">
      <h2>{ title }</h2>
      <p>{ text }</p>

      <hr/>
      <div>{ JSON.stringify(message) }</div>
    </div>
  )
}

export default Message
