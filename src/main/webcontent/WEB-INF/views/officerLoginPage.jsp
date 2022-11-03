<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Officer Login</title>
</head>
<body>
    <div align="center">
        <h2>Officer Login</h2>
            <form method="get" action="/Bank/officerPage">
                <input type="text" name="officerId" /> &nbsp;
                 <input type="text" name="password" /> &nbsp;
                <input type="submit" value="login" />
            </table>
        </form>
        <a href="http://localhost:8080/Bank">Home</a>
    </div>
</body>
</html>