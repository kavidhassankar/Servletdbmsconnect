<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.ebrainsql.Dto.OrderHalf"%>
<%@ page import="java.util.List"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>USER ORDER ITEM</h2>

	<table border="1">
		<tr>
			<th>id</th>
			<th>order_id</th>
			<th>item_name</th>
			<th>no_of_items</th>
			<th>item_sku</th>
			<th>item_rate</th>
			<th>order_no</th>
			<th>payment_type</th>
			<th>order_date</th>
			<th>delivery_date</th>
			


		</tr>

		<%
		List<OrderHalf> ttf = (List<OrderHalf>) request.getAttribute("key");
		if (null != ttf && ttf.size() > 0) {
			for (OrderHalf customer : ttf) {
		%>
		<tr>
			<td><%=customer.getId()%></td>
			<td><%=customer.getOrderid()%></td>
			<td><%=customer.getItemname()%></td>
			<td><%=customer.getNoofitems()%></td>
			<td><%=customer.getItem_sku()%></td>
			<td><%=customer.getItemrate()%></td>
			<td><%=customer.getOrder_no()%></td>
			<td><%=customer.getPayment_type()%></td>
			<td><%=customer.getOrder_date()%></td>
			<td><%=customer.getDeliverydate()%></td>

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