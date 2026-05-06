import { useEffect, useState } from "react";
import { Button, Form, Modal, Spinner } from "react-bootstrap";

const UsersPage = () => {

    const [users, setUsers] = useState([]);
    const [loading, setLoading] = useState(true);
    const [showDialog, setShowDialog] = useState(false);
    const [adding, setAdding] = useState(false);

    const [newUser, setNewUser] = useState({
        name:  "", 
        email: "", 
        active: false
    });

    const url = "https://api.acodingtutor.com/users?_delay=1000";
    useEffect(() => {
        fetch(url)
            .then(response => response.json())
            .then(data => {
                setUsers(data);
                setLoading(false);
            })

    }, []);

    const onHideDialog = () => {
        setShowDialog(false);
    }

    const onSave = () => {

        setAdding(true);

        fetch(url, {
            method: "POST", 
            headers: {
                "Content-Type": "application/json"
            }, 
            body: JSON.stringify(newUser)
        })
        .then(response => response.json())
        .then(addedUser => {
            //
            setUsers(current => [...current, addedUser]);
            setShowDialog(false);
            setAdding(false);
        });
    }

    if (loading) {
        return (
            <Spinner/>
        )
    }
    return (
        <>
        <h2>Users</h2>

        <Button variant="success" onClick={()=>setShowDialog(true)}>Add User</Button>
    

        <table className="table">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Active</th>
                </tr>
            </thead>
            <tbody>
                { 
                    users.map(user => (
                        <tr key={user.id}>
                            <td>{user.id}</td>
                            <td>{user.name}</td>
                            <td>{user.email}</td>
                            <td>{user.active ? 'Active' : 'Inactive'}</td>
                        </tr>)) 
                }
            </tbody>
        </table>

        { JSON.stringify(newUser)}
        <Modal show={showDialog} onHide={ onHideDialog }>
            <Modal.Header closeButton></Modal.Header>
            <Modal.Body>
                <Form>
                    <Form.Group>
                        <Form.Label>Name</Form.Label>
                        <Form.Control
                            value={newUser.name}
                            onChange={evt => {
                                setNewUser(current => ({
                                    ...current, 
                                    name: evt.target.value
                                }))
                            }}
                        />
                    </Form.Group>
                    <Form.Group>
                        <Form.Label>Email</Form.Label>
                        <Form.Control
                            value={newUser.email}
                            onChange={evt => {
                                setNewUser(current => ({
                                    ...current, 
                                    email: evt.target.value
                                }))
                            }}
                        />
                    </Form.Group>
                    <Form.Group>
                        <Form.Label>Active</Form.Label>
                        <Form.Check
                            checked={newUser.active}
                            onChange={evt => {
                                setNewUser(current => ({
                                    ...current, 
                                    active: evt.target.checked
                                }))
                            }}
                        />
                    </Form.Group>
                </Form>
            </Modal.Body>
            <Modal.Footer>
                <Button 
                    variant="secondary"
                    onClick={() => setShowDialog(false)}    
                >Cancel</Button>
                <Button
                    onClick={onSave}
                    disabled={adding}
                >Save</Button>
            </Modal.Footer>
        </Modal>
        </>
    )
}

export default UsersPage;