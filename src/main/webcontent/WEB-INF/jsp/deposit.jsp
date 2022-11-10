<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deposit</title>
</head>
<body>
    <div align="center">
        <h2>Deposit</h2>
        <form method="post"action ="/Bank/retain" >
           </br>EnterAccountId  <input type="text" name="accountId" /> &nbsp;
           </br>EnterAmount  <input type="text" name="deposit" /> &nbsp;
            <input type="submit" value="retain" />
        </form>
       </div>
    </body>
   </html>