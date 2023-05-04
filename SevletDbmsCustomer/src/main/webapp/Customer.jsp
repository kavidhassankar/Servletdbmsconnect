<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="CustomerDetail" method="post">

		<h1 align="center">CUSTOMER DETAILS</h1>

		<table align="center">
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id" id="id" /></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
				<td>Code:</td>
				<td><input type="text" name="code" id="code"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" id="email" /></td>
			</tr>

			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone" id="phone" /></td>
			</tr>
			<tr>
				<td>contact_person_name :</td>
				<td><input type="text" name="contactpersonname"
					id="contactpersonname" /></td>
			</tr>
			<tr>
				<td>contact_person_phone:</td>
				<td><input type="text" name="contactpersonphone"
					id="contactpersonphone" /></td>
			</tr>
			<tr>
				<td>cus_status:</td>
				<td><input type="text" name="cusstatus" id="cusstatus" /></td>
			</tr>
			<tr>
				<td>created_date:</td>
				<td><input type="date" name="createddate" id="createddate" /></td>
			</tr>
			<tr>
				<td>created_by:</td>
				<td><input type="text" name="createdby" id="createdby" /></td>
			</tr>
			<tr>
				<td>modified_date:</td>
				<td><input type="date" name="modifieddate" id="modified_date" /></td>
			</tr>

			<tr>
				<td>modified_by:</td>
				<td><input type="text" name="modifiedby" id="modified_by" /></td>
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