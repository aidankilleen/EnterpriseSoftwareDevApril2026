import { useEffect, useState } from "react";

const EffectInvestigationPage = () => {


    const [count, setCount] = useState(0);
    const [users, setUsers] = useState([]);
    const [reset, setReset] = useState(false);
    const [loading, setLoading] = useState(true);

    // effects get run when any of the dependencies are modified
    // often used for time-comsuming calculations
    // also often used for startup or initialisation
    // if there are no dependencies then the code is only run once

    const url = "https://api.acodingtutor.com/users?_delay=5000";

    useEffect(() => {
        console.log("Effect function run...");
        fetch(url)
            .then(response => response.json())
            .then(data => {
                setUsers(data);
                setLoading(false);
            })

    }, []);

    useEffect(() => {
        console.log("starting timer");
        
        const id = setInterval(()=> {
            console.log(`tick: ${count}`);
            setCount(count => count + 1);
        }, 1000);

        // if you return a function from your useEffect() then 
        // react will call this when the component is reset
        return () => {
            console.log("cleanup function");
            setCount(0);
            clearInterval(id);
        }
    }, [reset]);

    if (loading) {
        return (<div>Loading...</div>)
    }
    return (
        <>
            <h3>Effect Investigation</h3>
            Counter:{count}
            <button onClick={()=>setCount(count+1)}>+</button>
            <button onClick={()=>setReset(reset => !reset)}>Reset</button>

            { JSON.stringify(users) }

        </>
    )
}
export default EffectInvestigationPage;