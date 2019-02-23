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

var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function currentSlide(n) {
	showDivs(slideIndex = n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  if (n > x.length) {slideIndex = 1}
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
  }
  x[slideIndex-1].style.display = "block";
}