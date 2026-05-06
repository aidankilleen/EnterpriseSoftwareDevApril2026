import { useEffect, useState } from "react";

const EffectInvestigationPage = () => {


    const [count, setCount] = useState(0);
    const [users, setUsers] = useState([]);

    // effects get run when any of the dependencies are modified
    // often used for time-comsuming calculations
    // also often used for startup or initialisation
    // if there are no dependencies then the code is only run once

    const url = "https://api.acodingtutor.com/users";

    useEffect(() => {

        console.log("Effect function run...");

        fetch(url)
            .then(response => response.json())
            .then(data => {
                setUsers(data);
            })

    }, []);


    return (
        <>
            <h3>Effect Investigation</h3>
            Counter:{count}
            <button onClick={()=>setCount(count+1)}>+</button>

            { JSON.stringify(users)}

        </>
    )
}
export default EffectInvestigationPage;