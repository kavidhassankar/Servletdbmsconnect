<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="OrderItem" method="get">
		<h1 align="center">CUSTOMER ORDER IDEMS</h1>

		<table align="center">



			<tr>
				<td>order_id:</td>
				<td><input type="text" name="order_id" id="order_id" /></td>
			</tr>

			<tr>
				<td>item_name:</td>
				<td><input type="text" name="item_name" id="item_name" /></td>
			</tr>

			<tr>
				<td>item_sku:</td>
				<td><input type="text" name="item_sku" id="item_sku" /></td>
			</tr>

			<tr>
				<td>item_rate:</td>
				<td><input type="text" name="item_rate" id="item_rate" /></td>
			</tr>

			<tr>
				<td>ordered_qty:</td>
				<td><input type="text" name="ordered_qty" id="ordered_qty" /></td>
			</tr>

			<tr>
				<td>order_total:</td>
				<td><input type="text" name="order_total" id="order_total" /></td>
			</tr>

			<tr>
				<td><input type="button" value="Return to Home"
					onclick="window.location.href='Home.jsp'" /></td>
			</tr>
		
			<tr>
				<td><input type="submit" value="Insert Data" /></td>

			</tr>

		</table>
	</form>
</body>
</html>