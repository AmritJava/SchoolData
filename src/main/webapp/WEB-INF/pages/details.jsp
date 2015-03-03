<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>School Details</title>
</head>
<body>
	<center>

		<div style="color: teal; font-size: 30px">School Details</div>
<br />
			<table width="400px" height="150px">
				<tr>
					<td>Name</td>
					<td>${schoolObject.name}</td>
				</tr>
				<tr>
					<td>Code</td>
					<td>${schoolObject.code}</td>
				</tr>
				<tr>
					<td>Address</td>
					<td>${schoolObject.address}</td>
				</tr>
				<tr>
					<td>Email Domain</td>
					<td>${schoolObject.emailDomain}</td>
				</tr>
				<tr align="right">
					<td colspan="2"><a style="margin-right: 5px;" href="edit?id=${schoolObject.id}">Edit</a>
                    <a href="delete?id=${schoolObject.id}">Delete</a></td>
					</td>
				</tr>
			</table>
<br />
<a style="margin-right: 5px;" href="list">Click Here to back Home page</a>
		<a href="form">Click Here to add new School Info</a>
	</center>
</body>
</html>
