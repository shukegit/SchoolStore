<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>

<meta charset="utf-8" />



<link type="text/css" rel="stylesheet"
	href="../resources/css/login/login.css" />



</head>
<body>

	<div id="wrapper">
		<div id="wrappertop"></div>

		<div id="wrappermiddle">

			<h2>Login</h2>

			<div id="username_input">

				<div id="username_inputleft"></div>

				<div id="username_inputmiddle">
					<form>
						<input type="text" name="link" id="url"
							value="E-mail Address" onclick="this.value = ''"> <img
							id="url_user" src="../resources/img/login/mailicon.png" alt="">
					</form>
				</div>

				<div id="username_inputright"></div>

			</div>

			<div id="password_input">

				<div id="password_inputleft"></div>

				<div id="password_inputmiddle">
					<form>
						<input type="password" name="link" id="url" value="Password"
							onclick="this.value = ''"> <img id="url_password"
							src="../resources/img/login/passicon.png" alt="">
					</form>
				</div>

				<div id="password_inputright"></div>

			</div>

			<div id="submit">
				<form>
					<input type="submit" src="" id="submit1" value="Sign In"/> <input
						type="image" src="../resources/img/login/submit.png" id="submit2"
						value="Sign In"/>
				</form>
			</div>


			<div id="links_left">

				<a href="#">Forgot your Password?</a>

			</div>

			<div id="links_right">
				<a href="#">Not a Member Yet?</a>
			</div>

		</div>

		<div id="wrapperbottom"></div>

		<div id="powered">
			<p>
				Powered by <a href="http://www.premiumfreebies.eu">Premiumfreebies
					Control Panel</a>
			</p>
		</div>
	</div>
	<script type="text/javascript"
		src="<%=basePath%>resources/Jquery/jquery-3.2.1.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>resources/Jquery/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="../resources/js/login/login.js"
		charset="utf-8"></script>
</body>
</html>