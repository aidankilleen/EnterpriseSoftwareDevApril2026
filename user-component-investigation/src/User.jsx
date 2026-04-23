import { useState } from "react";

function User ({user, setUser}) {

    const [editing, setEditing] = useState(false);
    return (
        <div>
            <button onClick={evt => setEditing(!editing)}>Edit</button>
            { editing ? <h1>Editing</h1> : <h1>Not Editing</h1> }


            <table>
                <tbody>
                    <tr>
                        <td>Id</td><td>{user.id}</td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td>{ 
                            editing 
                            ? 
                            <input 
                                value={user.name} 
                                onChange={evt=>setUser({...user, name: evt.target.value})}/> 
                            : 
                            user.name }</td>
                    </tr>
                    <tr>
                        <td>Email</td><td>{user.email}</td>
                    </tr>
                    <tr>
                        <td>Active</td><td>{user.active ? "Active" : "Inactive"}</td>
                    </tr>
                </tbody>
            </table>



        </div>
    )
}

export default User;
