<%-- 
    Document   : user
    Created on : May 6, 2015, 3:04:31 PM
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
            String type = request.getParameter("type");
        %>
        
        <h1>Hello World!</h1>
        <h3>Type: <%= type %></h3>
    </body>
</html>
