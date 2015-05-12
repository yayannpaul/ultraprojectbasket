<%-- 
    Document   : profile
    Created on : May 6, 2015, 4:04:00 PM
    Author     : PaulRyan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <a href="user.jsp">Home</a>
        <a href="profile.jsp">Profile</a>
        
        <h1>Hello World!</h1>
        
        <h3>You are <%= session.getAttribute("username") %></h3>
    </body>
</html>
