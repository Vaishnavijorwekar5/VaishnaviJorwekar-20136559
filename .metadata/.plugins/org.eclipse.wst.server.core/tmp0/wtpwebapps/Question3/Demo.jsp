<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

     <% 
        int N =1;
     
       int p =  Integer.parseInt(request.getParameter("p"));
       int r =  Integer.parseInt(request.getParameter("r"));
       int t =  Integer.parseInt(request.getParameter("t"));
     %>
     
     <%
    int E = p * r * (1+r)/((1+r));
      %>
      
      <h1 style = "color:red">The Calculation of  :<%= E %></h1>
      
      
</body>
</html>