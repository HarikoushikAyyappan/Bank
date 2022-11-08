<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person List</title>
</head>
<body>
<div align="center">
    <h2>Person List</h2>
    <table border="1" cellpadding="5">
                  <tr>
                      <th>Id</th>
                      <th>Amount</th>
                      <th>CustomerId</th>
                      <th>CustomerName</th>

                  </tr>

                  <tr>
                  <td><c:out value="${accountPractice.accountId}" /></td>
                  <td><c:out value="${accountPractice.amount}" /></td>
                  <td><c:out value="${accountPractice.customerPractice.customerId}" /></td>
                  <td><c:out value="${accountPractice.customerPractice.name}" /></td>
                  </tr>
              </table>
              <a href="http://localhost:8080/Bank">Home</a>
    </div>
    </body>
    </html>