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
                      <th>AccountType</th>
                      <th>AccountDeposit</th>
                      <th>MaturityAmount</th>
                      <th>RateOfInterest</th>
                      <th>WithdrawalAmount</th>
                      <th>AvailableBalance</th>
                      <th>CustomerId</th>
                  </tr>
                  <c:forEach items="${accountDetails}" var="account">
                  <tr>
                      <td>${account.accountId}</td>
                      <td>${account.accountType}</td>
                      <td>${account.accountDeposit}</td>
                      <td>${account.maturityAmount}</td>
                      <td>${account.rateOfInterest}</td>
                      <td>${account.withdrawalAmount}</td>
                      <td>${account.availableBalance}</td>
                      <td>${account.custId}</td>
                      <td><form method="post"  action="/Bank/credit?availableBalance=${account.availableBalance}">
                                             </br>EnterAmount  <input type="text" name="amount" /> &nbsp;
                                             </br>Enter AccountId <input type="text" name="accountId" /> &nbsp;
                                             </br>Enter LoanId <input type="text" name="uniqueId" /> &nbsp;
                                              <input type="submit"  value="get"/></form>
                                           </td>
                  </tr>
                  </c:forEach>
              </table>
               <a href="http://localhost:8080/Bank">Home</a>
    </div>
    </body>
</html>