<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="a" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link href="style.css" rel="StyleSheet">
</head>
<body>
<img src="black_texture_texture_background_01_hd_pictures_169906_zpsb7a29003.jpg" width="1200px"  height="150px" style="margin-left: 70px; margin-right: 30px;">
<div id="col1">
<a:form method="get" action="Login">
<h1>LOGIN INFO</h1>
<a:textfield name="uname" label="USER NAME:"></a:textfield>
<a:password name="password" label="PASSWORD:"></a:password>
<a:submit value="LOGIN"/>
</a:form>
</div>
</body>
</html>