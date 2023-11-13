<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Giriş Yap</title>
	<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap-theme.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/elegant-icons-style.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/style-responsive.css" rel="stylesheet" />
    <script src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
    $(document).ready(function() {
        
    });
    
    function submitFacebookForm(){
    	$("#facebookForm").submit();
    }
    
    function submitTwitterForm(){
    	$("#twitterForm").submit();
    }
    
    function submitGoogleForm(){
    	$("#googleForm").submit();
    }
    
    function submitLinkedInForm(){
    	$("#linkedinForm").submit();
    }
    </script>
</head>
  <body class="login-img3-body">
    <div class="container">
      <form class="login-form" action="${pageContext.request.contextPath}/Login" method="get">
        <div style="margin-left:20%;">
        	<img alt="Login With Facebook" width="50" height="50" onclick="submitFacebookForm()"
        	style="cursor: pointer;" src="${pageContext.request.contextPath}/img/facebookLogin.png">
        
        	<img alt="Login With Facebook" width="50" height="50" onclick="submitTwitterForm()"
        	style="cursor: pointer;" src="${pageContext.request.contextPath}/img/twitterLogin.png">
        
        	<img alt="Login With Facebook" width="50" height="50" onclick="submitGoogleForm()"
        	style="cursor: pointer;" src="${pageContext.request.contextPath}/img/googleLogin.png">
        
        	<img alt="Login With Facebook" width="50" height="50" onclick="submitLinkedInForm()"
        	style="cursor: pointer;" src="${pageContext.request.contextPath}/img/linkedinLogin.png">
        </div>
        
        <div class="login-wrap">
            <p class="login-img"><i class="icon_lock_alt"></i></p>
            <div class="input-group">
              <span class="input-group-addon"><i class="icon_profile"></i></span>
              <input type="text" class="form-control" name="username" placeholder="Username" autofocus>
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="password" name="password" class="form-control" placeholder="Password">
            </div>
            
            <button class="btn btn-primary btn-lg btn-block" type="submit">Giriş Yap</button>
            <button class="btn btn-info btn-lg btn-block" type="submit">Kayıt Ol</button>
        </div>
      </form>
    </div>

	<form id="facebookForm" action="${pageContext.request.contextPath}/FacebookLogin" method="POST">
	</form>
	
	<form id="twitterForm" action="${pageContext.request.contextPath}/TwitterLogin" method="POST">
	</form>
	
	<form id="googleForm" action="${pageContext.request.contextPath}/GoogleLogin" method="POST">
	</form>
	
	<form id="linkedinForm" action="${pageContext.request.contextPath}/LinkedInLogin" method="POST">
	</form>
  </body>
</html>