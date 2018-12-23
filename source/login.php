<?php include('loginserver.php'); ?>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Welcome to TOEIC TEST WEBSITE</title>
  <!--CSS -->
  <link rel="stylesheet" href="css/login-style.css">
  <!-- Custrom boostrap script  ... -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
  <script src="js/all.js"></script>
  <!-- Scripts -->
  <script src="js/bootstrap.min.js"></script>
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  
</head>

<script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

<body style="background: url(img/background.jpg);">
  <div class="container">
    <h1 id="title">Welcome to TOEIC TEST WEBSITE</h1>
    <br><br>
    <div class="row">
      <div class="col-md-5 mx-auto">
        <div id="first">
          <div class="myform form ">
            <div class="logo mb-3">
              <div class="col-md-12 text-center">
                <h1>Login</h1>
              </div>
            </div>
            <form action="login.php" method="post" name="login">
              <div class="form-group">
                <label for="exampleInputEmail1">Email address</label>
                <input type="email" name="email" class="form-control" id="email" aria-describedby="emailHelp"
                  placeholder="Enter email">
              </div>
              <div class="form-group">
                <label for="exampleInputEmail1">Password</label>
                <input type="password" name="password" id="password" class="form-control" aria-describedby="emailHelp"
                  placeholder="Enter Password">
              </div>
              <div class="col-md-12 text-center ">
                <button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm" name="login_user">Login</button>
              </div>
              <div class="col-md-12 ">
                <div class="login-or">
                  <hr class="hr-or">
                  <span class="span-or">or</span>
                </div>
              </div>
              <div class="form-group">
                <p class="text-center">Don't have account? <a href="#" id="signup">Sign up here</a></p>
              </div>
            </form>

          </div>
        </div>
        <div id="second">
          <div class="myform form ">
            <div class="logo mb-3">
              <div class="col-md-12 text-center">
                <h1>Signup</h1>
              </div>
            </div>
            <form method="post" action="login.php" name="registration">
              <div class="form-group">
                <label for="exampleInputEmail1">First Name</label>
                <input type="text" name="firstname" class="form-control" id="firstname" aria-describedby="emailHelp"
                  placeholder="Enter Firstname">
              </div>
              <div class="form-group">
                <label for="exampleInputEmail1">Last Name</label>
                <input type="text" name="lastname" class="form-control" id="lastname" aria-describedby="emailHelp"
                  placeholder="Enter Lastname">
              </div>
              <div class="form-group">
                <label for="exampleInputEmail1">Email address</label>
                <input type="email" name="email" class="form-control" id="email" aria-describedby="emailHelp"
                  placeholder="Enter email">
              </div>
              <div class="form-group">
                <label for="exampleInputEmail1">Password</label>
                <input type="password" name="password" id="password" class="form-control" aria-describedby="emailHelp"
                  placeholder="Enter Password">
              </div>
              <div class="col-md-12 text-center mb-3">
                <button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm" name="reg_user">Get Started For Free</button>
              </div>
              <div class="col-md-12 ">
                <div class="form-group">
                  <p class="text-center"><a href="#" id="signin">Already have an account?</a></p>
                </div>
              </div>
          </div>
          </form>
        </div>
      </div>
    </div>
  </div>
  
</body>
<script>
    $("#signup").click(function() {
      $("#first").fadeOut("fast", function() {
        $("#second").fadeIn("fast");
      });
    });

    $("#signin").click(function() {
      $("#second").fadeOut("fast", function() {
        $("#first").fadeIn("fast");
      });
    });
</script>

</html>
