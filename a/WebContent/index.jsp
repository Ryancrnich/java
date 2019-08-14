<%@ page language="java" 
contentType="text/html; 
charset=ISO-8859-1"

  %>
<!DOCTYPE html>
<html>
 	<script> src="js.js" </script>	
<head >
<div>
<link rel="stylesheet" href="style.css">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<meta charset="ISO-8859-1">
<title>M3 Productions</title>
<br>
<br>

<div>
</head>
<body >
	<title>M3 Productions</title>

	
		<div class="container">
			<h2 class="text-center" id="title">M3 Productions</h2>
			 <p class="text-center">
				<small id="passwordHelpInline" class="text-muted">Facebook<a href="http://www.Facebook.com"> here</a> PS. Check out our youtube channel: <a href="https://wwww.youtube.com/"> here.</a></small>
			</p>
 			<hr>
			<div class="row">
				<div class="col-md-5">
 					<form role="form" method="post" action="signUp">
						<fieldset>							
							<p class="text-uppercase pull-center"> SIGN UP.</p>	
 							<div class="form-group">
								<input type="text" name="username" required = "required" "id="username" class="form-control input-lg" placeholder="username">
							</div>

							<div class="form-group">
								<input type="email" name="email" id="email" required = "required" class="form-control input-lg" placeholder="Email Address">
							</div>
							<div class="form-group">
								<input type="password" name="password" required = "required"  id="password" class="form-control input-lg" placeholder="Password">
							</div>
								<div class="form-group">
								<input type="password" name="password2" required = "required" id="password2" class="form-control input-lg" placeholder="Password2">
							</div>
							<div class="form-check">
								<label class="form-check-label">
								  <input type="checkbox" required = "required" class="form-check-input">
								  By Clicking register you're agree to our policy & terms
								</label>
							  </div>
 							<div>
 									  <input type="submit" class="btn btn-lg btn-primary   value="Register">
 							</div>
						</fieldset>
					</form>
				</div>
				
				<div class="col-md-2">
					<!-------null------>
				</div>
	
				<div class="col-md-5">
 				 		<form form role="form" method="post" action="signIn">
						<fieldset>							
							<p class="text-uppercase"> Login using your account: </p>	
 								
							<div class="form-group">
								<input type="text" name="username" required = "required"  id="username" class="form-control input-lg" placeholder="username">
							</div>
							<div class="form-group">
								<input type="password" name="password" required = "required"  id="password" class="form-control input-lg" placeholder="Password">
							</div>
							<div>
								<input type="submit" class="btn btn-md" value="Sign In">
							</div>
								 
 						</fieldset>
				</form>	
				</div>
			</div>
		</div>
		<p class="text-center">
			<small id="passwordHelpInline" class="text-muted">Facebook<a href="http://www.Facebook.com"> here</a> PS. Check out our youtube channel: <a href="https://wwww.youtube.com/"> here.</a></small>
		</p>
	</div>	</div>
	
</body>
<footer>
</footer>
</div>
</html>