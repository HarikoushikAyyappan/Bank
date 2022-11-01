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
    <h2>AvailableBalance</h2>
    <form:form action="/Shop/store" method="post" modelAttribute="account">
    <table border="1" cellpadding="5">
                  <tr>
                      <th>AccountId</th>
                      <th>WithdrawalAmount</th>
                      <th>AvailableBalance</th>
                  </tr>
                    <tr>
                    <td>${account.accountId}
                        <form:hidden path="accountId"/>
                        <td>${account.withdrawalAmount}
                       <form:hidden path="withdrawalAmount"/>
                    <td>${account.availableBalance}
                                            <form:hidden path="availableBalance"/>
                    </td>
                </tr>
              </table>
              </form:form>
               <a href="http://localhost:8080/Bank">Home</a>
    </div>
    </body>
</html>