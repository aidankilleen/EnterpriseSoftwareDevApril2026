console.log("script.js");

document.getElementById("message").innerHTML = "Message goes here";

let url = "/api/users";

function getData() {

    let tbody = document.querySelector("#tblUsers tbody");

    fetch(url)
        .then(response=>response.json())
        .then(users => {
            users.forEach(user => {
                tbody.innerHTML += `<tr>
                                        <td>${user.id}</td>
                                        <td>${user.name}</td>
                                        <td>${user.email}</td>
                                        <td>${user.active}</td>
                                    </tr>`;
            })


        })
        .catch(err=>alert(err));
}