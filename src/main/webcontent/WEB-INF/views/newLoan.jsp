<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Person</title>
</head>
<body>
    <div align="center">
        <h2>New Loan</h2>
        <form:form action="/Bank/loanApplication" method="post" modelAttribute="loan">
            <table border="0" cellpadding="5">
                <tr>
                    <td>Id: </td>
                    <td><form:input path="loanId" /></td>
                </tr>

                <tr>
                    <td>LoanAmount: </td>
                    <td><form:input path="loanAmount" /></td>
                </tr>
                <tr>
                    <td>AccountId: </td>
                    <td><form:input path="acntId" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>
            </table>
        </form:form>
        <a href="http://localhost:8080/Bank">Home</a>
    </div>
</body>
</html>