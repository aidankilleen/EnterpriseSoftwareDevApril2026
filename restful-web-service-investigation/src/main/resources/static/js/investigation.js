

let message = "sdfws";
message = "asadfasd";


// a lot of js is used for DOM Manipulation
// i.e. changing the content of the page:
let content = document.getElementById("content");
content.innerHTML = "<h2>Content goes here</h2>";
// This is a comment

/*
this is a multiline comment
*/

// variables - use "let" to declare a variable
let name = "Aidan";
//var surname = "Killeen"; // don't use "var" it is obsolete
const firstname = "Aidan";  // const is a constant

// strings in js
name = "Aidan";
name = 'Aidan';  // single quotes and double quotes are interchangable

// create templated string using ``
message = "Welcome " + name;
message = `Welcome ${ name }`;

// js actually doesn't care if you declare your variables or not
let html = "<h1>html</h1>"
// but I strongly recommend that we declare our variables
// before using them


message = "Press the \"red\" button";

// or use single quotes if you want " in your string
message = 'Press the "red" button';

// use double quotes if you want to put ' in your string
name = "O'Sullivan";

// use `` if we want to create a string with substituted variables

function onClick() {
    alert("the button was clicked");
}

text = "Press Me"
html = `<button class="btn btn-success" onclick="onClick()">${text}</button>`;

content.innerHTML += html;

console.log("write a message to the console");


// a list or array is done using []

let buttons = ["primary", "secondary", "success", "danger", "warning", "info", "light", "dark"];

for (let i = 0; i < buttons.length; i++) {

    content.innerHTML += `<button class="btn btn-${buttons[i]}">
                                ${buttons[i]}
                              </button>`;
}


// javascript object
// JSON - JavaScript Object Notation

o = {
    "id": 1,
    "name":"Alice",
    "email": "alice@gmail.com",
    "active": true
};

console.log(o.id);
console.log(o.name);

console.log(o);

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
    }];

// working with arrays of objects like this is really common

// get the tbody tag from the html
//let tbody = document.getElementById("tblUsers");
let tbody = document.querySelector("#tblUsers tbody");

for (let i=0; i<users.length; i++) {
    console.log(users[i]);

    tbody.innerHTML += `<tr>
                                <td>${users[i].id}</td>
                                <td>${users[i].name}</td>
                                <td>${users[i].email}</td>
                                <td>${users[i].active ? "Active" : "Inactive"}</td>
                            </tr>`;
}

ptag = document.createElement("p");
//ptag.nodeValue = ;
ptag.innerHTML = "some text in a paragraph";

content.appendChild(ptag);


// in JavaScript we will encounter "arrow functions"
// in java we call these "lambda functions / lambda expressions"
console.log("Lambda / Arrow functions");
let numbers = [1, 4, 3, 2, 8, 10, 9, 7];

function showValue(v) {
    console.log(v);
}

numbers.forEach(showValue);

console.log("==================================");

// normally in javaScript we declare the function as a parameter
//
numbers.forEach((v) => {
    console.log(v);
});

console.log("==================================");

odd_numbers = numbers.filter((v) => {
    // this function needs to return true or false
    if (v % 2 == 1) {
        return true;
    } else {
        return false;
    }
});

console.log(numbers);
console.log(odd_numbers);

odd_numbers.forEach((v) => {
    console.log(v);
});


numbers.forEach((v) => {
    h3 = document.createElement("h3")
    h3.innerHTML = `Value ${v}`
    content.appendChild(h3);
})




//alert(message);
