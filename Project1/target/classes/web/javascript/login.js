const url = "http://localhost:8080/"

async function loginFunction(username, password){
	let username1 = {
		user:username,
		password:password 
	};
	let response = await fetch(url + 'login', {
		method:'POST',
		headers:{'Content-Type':'application/json'}, 
		body:JSON.stringify(username1)} );
		let result = await response.text();
		console.log(result.user);
		if(result.User === null){alert("Resubmit")}
		else {
			if(result.Title == "manager"){
				alert("This works you are a manager");
			}
				
			else {
				alert("Bobby go away");
				} 
		}
		
		
		//if (result){ if()
		//window.location.href="/index.html";
			//}
		//else (alert("Resubmit your username and password")
} //this ends async function

function getInputFunction(){
    let username = document.getElementById("username-field").value;
    let password = document.getElementById("password-field").value;
	console.log("thisisworking" + username + ""+ password)
	loginFunction(username, password)
}