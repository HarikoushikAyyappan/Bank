<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Banking</title>
</head>
<body>
<div align="center">
    <h2>Welcome to the Bank</h2>
     <form method="get"  action="/Bank/customers">
            </br>CustomerList    <input type="submit"  value="CustomerList"/></form>
          <form method="get"  action="/Bank/customerLogin">
                 </br>User Login    <input type="submit"  value="Login"/></form>
          <form method="get"  action="/Bank/officerLogin">
             </br>Admin login   <input type="submit"  value="Login"/></form>
             <form method="get"  action="/Bank/newCustomer">
                     </br>CustomerRegistration   <input type="submit"  value="Register"/></form>
             <form method="get"  action="/Bank/officerLogin">
                     </br>Admin login   <input type="submit"  value="Login"/></form>
                      <form method="get"  action="/Bank/get">
                      <input type="text"  name="accountId"/>
                             </br>getById    <input type="submit"  value="get"/></form>
</div>
</body>
</html>
