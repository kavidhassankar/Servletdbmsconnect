
<%@page import="com.ebrainsql.Dto.Customer"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>CUSTOMER UPDATE</h2>


	<table border="1">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>code</th>
			<th>email</th>
			<th>phone</th>
			<th>contact_person_name</th>
			<th>contact_person_phone</th>
			<th>status</th>
			<th>created_date</th>
			<th>created_by</th>
			<th>modified_date</th>
			<th>modified_by</th>
		</tr>

		<%
		List<Customer> ttf = (List<Customer>) request.getAttribute("key");
		if (null != ttf && ttf.size() > 0) {
			for (Customer customer : ttf) {
		%>
		<tr>
			<td><%=customer.getId()%></td>
			<td><%=customer.getName()%></td>
			<td><%=customer.getCode()%></td>
			<td><%=customer.getEmail()%></td>
			<td><%=customer.getPhone()%></td>
			<td><%=customer.getContactpersonname()%></td>
			<td><%=customer.getContactpersonphone()%></td>
			<td><%=customer.getCusstatus()%></td>
			<td><%=customer.getDate()%></td>
			<td><%=customer.getCreatedby()%></td>
			<td><%=customer.getDate2()%></td>
			<td><%=customer.getModifiedby()%></td>
		</tr>
		<%
		}
		} else {
		%>
		<tr>
			<td colspan="12">No Record Found</td>
			<%}%>
			<button onclick="submit">submit</button>
	</table>
</body>
</html>