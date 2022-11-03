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
<title>Loan List</title>
</head>
<body>
<div align="center">
    <h2>Loan List</h2>
    <table border="1" cellpadding="5">
                  <tr>
                      <th>LoanId</th>
                      <th>LoanAmount</th>
                      <th>AccountId</th>
                  </tr>
                  <c:forEach items="${loanList}" var="loan">
                  <tr>
                      <td>${loan.loanId}</td>
                      <td>${loan.loanAmount}</td>
                      <td>${loan.accountId}</td>
                      <td>
                         <a href="http://localhost:8080/Bank/approve/${loan.accountId}/">Approve</a>
                             &nbsp;&nbsp;&nbsp;
           </td>
                  </tr>
                  </c:forEach>
              </table>
               <a href="http://localhost:8080/Bank">Home</a>
    </div>
    </body>
</html>