function openNav() {
	document.getElementById("sideNav").style.width = "250px";
}

function closeNav() {
	document.getElementById("sideNav").style.width = "0";
}

function display() {
	document.getElementById("exForm").innerHTML ="Thank you " + document.exForm.firstname.value +
	" " + document.exForm.lastname.value + " you have select " + document.exForm.BigFeburaryGames.value + 
	" for your free monthly game." + " A confirmation email will be sent to " + document.exForm.email.value + ".";
}
