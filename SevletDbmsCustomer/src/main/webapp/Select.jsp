<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.ebrainsql.Dto.CusHomeActive"%>
<%@ page import="java.util.List"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>User form</h2>
	
		<table border="1">
			<tr>
				<th>id</th>
				<th>cus_name</th>
				<th>email</th>
				<th>contact_person_name</th>
				<th>cus_status</th>
				<th>customer_id</th>
				<th>address_type</th>
				<th>address_line1</th>
		
				
			</tr>

			<%
			List<CusHomeActive> ttf = (List<CusHomeActive>) request.getAttribute("key");
			if (null != ttf && ttf.size() > 0) {
				for (CusHomeActive customer : ttf) {
			%>
			<tr>
			<td><%=customer.getId()%></td>
			<td><%=customer.getName()%></td>
			<td><%=customer.getEmail()%></td>
			<td><%=customer.getContactPersonName()%></td>
			<td><%=customer.getStatus()%></td>
			<td><%=customer.getCustomerId()%></td>
			<td><%=customer.getAddressType()%></td>
			<td><%=customer.getAddressLine1() %></td>
		
			</tr>
			<%
			}
			} else {
			%>
			<tr>
				<td colspan="12">No Record Found</td>
				<%
				}
				%>
				<button onclick="submit">submit</button>
		
		</table>
		

</body>
</html>