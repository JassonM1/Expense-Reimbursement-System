const url = "http://localhost:8080/"

const loginForm = document.getElementById("login-form");
const loginButton = document.getElementById("login-form-submit");
const loginErrorMsg = document.getElementById("login-error-msg");



function login() {
    const username = document.getElementById("username-field").value;
    const password = document.getElementById("password-field").value;
	alert("Hi")
    if (username === "user" && password === "password") {
        alert("You have successfully logged in.");
        location.reload();
    } else {
        loginErrorMsg.style.opacity = 1;
    }
   }