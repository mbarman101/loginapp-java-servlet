<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login Page</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<form method="post" action="LoginServlet">


			<div id="login-box">

				<H2>Login Page</H2>
				<div id="login-box-name" style="margin-top: 20px;">User Id:</div>
				<div id="login-box-field" style="margin-top: 20px;">
					<input name="userId" class="form-login" title="Username" value=""
						size="30" maxlength="50" />
				</div>
				<div id="login-box-name">Password:</div>
				<div id="login-box-field">
					<input name="password" type="password" class="form-login"
						title="Password" value="" size="30" maxlength="48" />
				</div>
				<span class="login-box-options"> New user register <a
					href="register.jsp"> Here</a>
				</span>
				<br/> 
				<input style="float: right;" type="submit"
					value="Login"/>
			</div>

	</form>

</body>
</html>
