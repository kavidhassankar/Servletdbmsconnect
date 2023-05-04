<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action=" CustomerOrder" method="post">
		<h1 align="center">CUSTOMER ORDER</h1>

		<table align="center">

			<tr>
				<td>customer_id:</td>
				<td><input type="text" name="customer_id" id="customer_id" /></td>
			</tr>


			<tr>
				<td>order_no:</td>
				<td><input type="text" name="order_no" id="order_no" /></td>
			</tr>

			<tr>
				<td>order_date:</td>
				<td><input type="date" name="order_date" id="order_date" /></td>
			</tr>

			<tr>
				<td>no_of_items:</td>
				<td><input type="text" name="no_of_items" id="no_of_items" /></td>
			</tr>

			<tr>
				<td>order_sub_total:</td>
				<td><input type="text" name="order_sub_total"
					id="order_sub_total" /></td>
			</tr>

			<tr>
				<td>order_discount:</td>
				<td><input type="text" name="order_discount"
					id="order_discount" /></td>
			</tr>

			<tr>
				<td>payment_type:</td>
				<td><input type="text" name="payment_type" id="payment_type" /></td>
			</tr>

			<tr>
				<td>delivery_date:</td>
				<td><input type="date" name="delivery_date" id="delivery_date" /></td>
			</tr>

			<tr>
				<td>cus_status:</td>
				<td><input type="text" name="cus_status" id="cus_status" /></td>
			</tr>

			<tr>
				<td>created_date:</td>
				<td><input type="date" name="created_date" id="created_date" /></td>
			</tr>

			<tr>
				<td>created_by:</td>
				<td><input type="text" name="created_by" id="created_by" /></td>
			</tr>
			<tr>
				<td>modified_date:</td>
				<td><input type="date" name="modified_date" id="modified_date" /></td>
			</tr>
			<tr>
				<td>modified_by:</td>
				<td><input type="text" name="modified_by" id="modified_by" /></td>
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