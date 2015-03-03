<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Schools</title>
</head>
<body>
	<center>

		<div style="color: teal; font-size: 30px">List of Schools</div>
<br />
		<c:if test="${!empty schoolList}">
			<table border="1" bgcolor="black" width="600px">
				<tr
					style="background-color: teal; color: white; text-align: center;"
					height="40px">
					
					<td colspan="2" align="left">Name</td>
					
				</tr>
				<c:forEach items="${schoolList}" var="user">
					<tr
						style="background-color: white; color: black; text-align: left;"
						height="30px">
						
						<td><c:out value="${user.name}" />
						</td>
						
						<td><a href="details?id=${user.id}">View Details</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
<br />

		<a href="form">Click Here to add new School Info</a>
	</center>
</body>
</html>
