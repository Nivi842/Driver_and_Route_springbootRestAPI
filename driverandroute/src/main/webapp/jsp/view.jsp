<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<!-- //cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css
 --><link href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css">


<script type="text/javascript">

$(document).ready(function () {
    $('#drvtab').DataTable({
        pagingType: 'full_numbers',
    });
});
</script>
</head>
<body>
<h3>View driver</h3>
<a href="/">Adddriver</a>
<table id="drvtab" class="table">
<thead class="thead-dark">
<tr>
<th>
root_no
</th>
<th>
driver_name
</th>
<th>
license_no
</th>
<th>
mobile_no
</th>
<th>
route
</th>
<th>Edit</th>
<th>Delete</th>
</tr>
</thead>
<tbody>
<c:forEach items="${drivers}" var="drv">
<tr>
<td>${drv.root_no}</td>

<td>${drv.driver_name}</td>
<td>${drv.license_no}</td>
<td>${drv.mobile_no}</td>
<td>${drv.route}</td>
<td><a href="editDrv?did=${drv.root_no}">Edit</a></td>
     <td><a href="deleteDrv?did=${drv.root_no}">Delete</a></td>

</tr>

</c:forEach>

</tbody>

</table>

</body>
</html>