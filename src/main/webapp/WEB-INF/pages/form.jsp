<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>School Add Form</title>
<script type="text/javascript">
function validateForm() {
	
    var name = document.forms["regForm"]["name"].value;
    var code = document.forms["regForm"]["code"].value;
    var address = document.forms["regForm"]["address"].value;
    var emailDomain = document.forms["regForm"]["emailDomain"].value;
    
    if (name == null || name == "") {
        alert("Name must be filled out");
        return false;
    }
    
    if (code == null || code == "") {
        alert("Code must be filled out");
        return false;
    }
    
    if (address == null || address == "") {
        alert("Address must be filled out");
        return false;
    }
    
    if (emailDomain == null || emailDomain == "") {
        alert("Email Domain must be filled out");
        return false;
    }
    
}
</script>
</head>
<body>
	<center>

		<div style="color: teal; font-size: 30px">Add School Info Form</div>
<br />
        <form:form name="regForm" id="registerForm" modelAttribute="schoolInfo" method="post"
			action="register" onsubmit="return validateForm()">
			<table width="400px" height="150px">
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input name="name" path="name" /></td>
				</tr>
				<tr>
					<td><form:label path="code">Code</form:label></td>
					<td><form:input name="code" path="code" /></td>
				</tr>
				<tr>
					<td><form:label path="address">Address</form:label></td>
					<td><form:input name="address" path="address" /></td>
				</tr>
				<tr>
					<td><form:label path="emailDomain">Email Domain</form:label></td>
					<td><form:input name="emailDomain" path="emailDomain" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register" />
					</td>
				</tr>
			</table>
		</form:form>
<br />

		<a href="list">Click Here to see School List</a>
	</center>
</body>
</html>
