<%-- 
    Document   : user
    Created on : May 6, 2015, 3:36:00 PM
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
        <% 
            String name = request.getParameter("username");
        %>
        
        <h1>Hello World!</h1>
        
        <h3>You are <%= name %></h3>
    </body>
</html>
