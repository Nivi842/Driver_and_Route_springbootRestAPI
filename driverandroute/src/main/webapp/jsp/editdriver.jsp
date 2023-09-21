<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="update" modelAttribute="drv">
<form:hidden path="root_no"/>


driver_name  : <form:input path="driver_name"/><br><br>

license_no     : <form:input path="license_no"/> <br><br>

mobile_no    : <form:input path="mobile_no"/> <br><br>

route     : <form:input path="route"/> <br><br>


<input type="submit" value="editdriver">



</form:form>
<a href="viewAll">ViewAlldrivers </a>


</body>
</html>