<html>
<head>
<meta charset="ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">


<link rel="stylesheet" type="text/css" href="index.css">
<title>Canadian Rookies</title>

</head>
<body>

<div class ="fullpage" align="center">


<div id="image" align="center" >
<img src="images\city-c.jpeg" height="400" width="100%"/>

</div>
<div class=navbar id=topnavbar>

  <a href="#home">Home</a>
  <a href="#places">Places to visit</a>
 <div class="listdropdown">
  <button class="listbtn">Immigration CheckList</button>
  <div class="dropdown-content1">
    <a href="#ohip">OHIP</a>
    <a href="#drivinglicense">Driving License and SIN</a>
    <a href="#community">Finding your community places</a>
  </div>
</div>

  <a href="#business">Business/Jobs</a>
  <a href="#feedback">Feedback</a>
  <a href="#aboutus">About Us</a>
  <a href="#contactus">Contact Us</a>
  
   <a href="#signin">SignIn/Register</a>
 </div>



  	<div  class =provinces>
  	<h1>Canada Provinces</h1>
		<div class="container"> <a href="ontario"><img src="ontario.jpg" height="100" width="100"  alt="Avatar" class="image"/></a><div class="overlay">
    <div class="text">Ontario</div>
  </div>
</div>
<div class="container"> <a href="manitoba"><img src="manitoba.jpg" height="100" width="100"  alt="Avatar" class="image"/></a><div class="overlay">
    <div class="text">Manitoba</div>
  </div>
</div>
<div class="container"> <a href="british"><img src="british.jpg" height="100" width="100"  alt="Avatar" class="image"/></a><div class="overlay">
    <div class="text">British Columbia</div>
  </div>
</div>
<div class="container"> <a href="alberta"><img src=alerta.jpg height="100" width="100"  alt="Avatar" class="image"/></a><div class="overlay">
    <div class="text">Alberta</div>
  </div>
</div>
<div class="container"> <a href="northwestteritory"><img src=nothwest.jpg height="100" width="100"  alt="Avatar" class="image"/></a><div class="overlay">
    <div class="text">Northwest</div>
  </div>
</div>
<div class="container"> <a href="pei"><img src=pei.jpg height="100" width="100"  alt="Avatar" class="image"/></a><div class="overlay">
    <div class="text">PrinceEdward Islands</div>
  </div>
</div>
<div class="container"> <a href="quebec"><img src=quebec.jpg height="100" width="100"  alt="Avatar" class="image"/></a><div class="overlay">
    <div class="text">Quebec</div>
  </div>
</div>
<div class="container"> <a href="saskatchewan"><img src=saskatchwan.jpg height="100" width="100"  alt="Avatar" class="image"/></a><div class="overlay">
    <div class="text">Saskatchewan</div>
  </div>
  
</div>


		
	 </div>
	 <div id="signin"><button onclick="signin()" id="signin" title="SignIn">Sign IN</button> OR 
	 <button onclick="signin()" id="register" title="Register">Register</button></div>
	 
	 <button onclick="topFunction()" id="myBtn" title="Go to top">Go to Top</button>
	 <script>
// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        document.getElementById("myBtn").style.display = "block";
    } else {
        document.getElementById("myBtn").style.display = "none";
    }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}
</script>
<div id= weather class=weatherwidget>
<a class="weatherwidget-io" href="https://forecast7.com/en/43d65n79d38/toronto/" data-label_1="TORONTO" data-label_2="WEATHER" data-theme="pure" >TORONTO WEATHER</a>
<script>
!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src='https://weatherwidget.io/js/widget.min.js';fjs.parentNode.insertBefore(js,fjs);}}(document,'script','weatherwidget-io-js');
</script>
</div>

<div></div>

</div>
</body>
</html>