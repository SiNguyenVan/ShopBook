<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!doctype html>
<html>
    <head>
        <title>Official Signup Form Flat Responsive widget Template :: w3layouts</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Official Signup Form Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- fonts -->
        <link href="//fonts.googleapis.com/css?family=Raleway:100,200,300,400,500,600,700,800,900" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Monoton" rel="stylesheet">
        <!-- /fonts -->
        <!-- css -->
        <link href="css2/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css2/style.css" rel='stylesheet' type='text/css' media="all" />
        <!-- /css -->
    </head>
    <body>
        <style>
            body {
                background-image: url('img/background.jpg');
                background-repeat: no-repeat;
                background-size: cover;
                background-position: center;
            }

        </style>
        <h1 class="w3ls">REGISTER</h1>
        <div class="content-w3ls">
            <div class="content-agile1">
                <h2 class="agileits1">SiBook</h2>
                <p class="agileits2">I hate books; they only teach us to talk about things we know nothing about. </p>
            </div>
            <div class="content-agile2">
                <form action="Register" method="post">


                    <div class="form-control w3layouts"> 
                        <input type="text" id="firstname" name="firstname" placeholder="First Name" title="Please enter your First Name" required="">
                    </div>
                    <div class="form-control w3layouts"> 
                        <input type="text" id="firstname" name="lastname" placeholder="Last Name" title="Please enter your Last Name" required="">
                    </div>

                    <div class="form-control w3layouts">	
                        <input type="email" id="email" name="email" placeholder="mail@example.com" title="Please enter a valid email" required="">
                    </div>
                    <div class="form-control w3layouts"> 
                        <input type="number" id="firstname" name="phone" minlength="10"  maxlength="10" placeholder="Phone (10 numbers)" title="Please enter your Phone" required="Invalid">
                    </div>
                    <div class="form-control w3layouts"> 
                        <input type="date" id="firstname" name="dob" placeholder="Date" title="Please enter your Date of Birth" required="">
                    </div>
                    <div class="form-control w3layouts"> 
                        <input type="number" id="firstname" name="cccd"  minlength="12" maxlength="12"  placeholder="CCCD(12 numbers)" title="Please enter your CCCD" required="">
                        <div class="form-control w3layouts"> 
                            <input type="text" id="firstname" name="address" placeholder="Address" title="Please enter your Address" required="">
                        </div>
                    </div>
                    <div class="form-control w3layouts"> 
                        <input type="text" id="firstname" name="username" placeholder="UserName" title="Please enter your UserName" required="">
                    </div>

                    <div class="form-control agileinfo">	
                        <input type="password" class="lock" name="password" placeholder="Password" id="password1" required="">
                    </div>	

                    <div class="form-control agileinfo">	
                        <input type="password" class="lock" name="confirm-password" placeholder="Confirm Password" id="password2" required="">
                    </div>	

                     

                    <input type="submit" class="register" value="Register">
                    
                    <h3>Have an account ? <a href="Login">Login now</a></h3>
                     <%
        String msg=(String) request.getAttribute("Register");
        if(msg!=null) {
        %>
        <h1 class="agileits2" style="color:white"><%=msg%></h1>
        <%
            }
        %>
                    
                </form>
                <script type="text/javascript">
                    window.onload = function () {
                        document.getElementById("password1").onchange = validatePassword;
                        document.getElementById("password2").onchange = validatePassword;
                    }
                    function validatePassword() {
                        var pass2 = document.getElementById("password2").value;
                        var pass1 = document.getElementById("password1").value;
                        if (pass1 != pass2)
                            document.getElementById("password2").setCustomValidity("Passwords Don't Match");
                        else
                            document.getElementById("password2").setCustomValidity('');
                        //empty string means no validation error
                    }
                </script>
                <p class="wthree w3l"></p>
                <ul class="social-agileinfo wthree2">
                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="#"><i class="fa fa-youtube"></i></a></li>
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
       
        <p class="copyright w3l">© 2024 SiDepTrai Official Signup All Rights Reserved | Design by <a href="https://w3layouts.com/" target="_blank"><3>3</a></p>
    </body>
</html>