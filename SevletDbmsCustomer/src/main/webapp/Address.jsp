<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Address here</title>
</head>
<body>
<form action="CustomerAddressControll" method ="post">
	<h1 align="center">CUSTOMER ADDRESS </h1>
	<table align="center">
		<tr>
			<td>ID:</td>
			<td><input type="text" name="id" id="id" /></td>
		</tr>
		<tr>
			<td>customer_id:</td>
			<td><input type="text" name="customer_id" id="customer_id" /></td>
		</tr>

		<tr>
			<td>address_type:</td>
			<td><input type="text" name="address_type" id="address_type" /></td>
		</tr>

		<tr>
			<td>address_line1:</td>
			<td><input type="text" name="address_line1" id="address_line1" /></td>
		</tr>

		<tr>
			<td>address_line2:</td>
			<td><input type="text" name="address_line2" id="address_line2" /></td>
		</tr>

		<tr>
			<td>city:</td>
			<td><input type="text" name="city" id="city" /></td>
		</tr>

		<tr>
			<td>state:</td>
			<td><input type="text" name="state" id="state" /></td>
		</tr>

		<tr>
			<td>country:</td>
			<td><input type="text" name="country" id="country" /></td>
		</tr>

		<tr>
			<td>postal_code:</td>
			<td><input type="text" name="postal_code" id="postal_code" /></td>
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