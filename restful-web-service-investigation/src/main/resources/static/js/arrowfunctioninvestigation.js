// investigate arrow functions further

let names = ["alice", "bob", "carol", "dan"];

// forEach -> calls the arrow function for each element
// filter -> calls the arrow function for each element and if the arrow function
// returns true the element is added to the result
// map -> calls the arrows function for each element and creates a new list
// with the values returned from the arrow function

let titles = names.map((name)=>{

    return name[0].toUpperCase() + name.slice(1);
});

console.log(titles);

// with arrow functions we can shorted the code as follows:
// if there is only one parameter to the function you can leave out ()
// if the arrow function is just one line:
// leave out the {}
// leave out the return
// leave out the ;

// this code does exactly the same as above
titles = names.map(name => name[0].toUpperCase() + name.slice(1));

console.log(names);
console.log(titles);

let users = [
    {
        "name": "Alice",
        "email": "alice@gmail.com",
        "active": false,
        "id": 5
    },
    {
        "name": "Bob",
        "email": "bob@gmail.com",
        "active": true,
        "id": 10
    },
    {
        "name": "Carol",
        "email": "carol@gmail.com",
        "active": true,
        "id": 61
    },
    {
        "name": "Eve",
        "email": "eve@gmail.com",
        "active": true,
        "id": 999
    },
    {
        "name": "Fred",
        "email": "fred@gmail.com",
        "active": true,
        "id": 1000
    },
    {
        "name": "New User",
        "email": "new.user@gmail.com",
        "active": false,
        "id": 1001
    },
    {
        "name": "New User",
        "email": "new.user@gmail.com",
        "active": false,
        "id": 1002
    },
    {
        "name": "New User",
        "email": "new.user@gmail.com",
        "active": false,
        "id": 1003
    },
    {
        "name": "CHANGED",
        "email": "changed.user@gmail.com",
        "id": 1004
    }
];

let testUser =     {
    "name": null,
    "email": "changed.user@gmail.com",
    "id": 1004
}

console.log(testUser.email);    // access a property using .
console.log(testUser["email"]); // access a property using ["propname"]

if ("active" in testUser) {
    console.log("no active property");
    console.log(testUser["active"]);
} else {
    console.log("active property");
    console.log(testUser["active"]);
}

// in js "undefined" is "false-y"
// "" is false-y
// 0 is false-y
// non empty string is truthy
// non zero number is truthy





console.log("------------------------------");
let activeUsers = users.filter(user => user.active);

let trs = activeUsers.map(user => {
    return `<tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.active ? "Active" : "Inactive"}</td>
            </tr>`;
})

let tbody = document.querySelector("#tblUsers tbody");
trs.forEach(html => {
    tbody.innerHTML += html;
})

console.log(trs);


//note you can chain these operations together

users.filter(user => !user.active)
    .map(user => `<tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.email}</td><td>${user.active ? "Active" : "Inactive"}</td>
                  </tr>`)
    .forEach(html => tbody.innerHTML += html );


