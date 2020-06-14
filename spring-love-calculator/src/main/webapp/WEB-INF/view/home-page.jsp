<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<style type="text/css">
	.error {
		color: red;
		position: fixed;
		text-align: left;
		margin-left: 30px;
	}
</style>

<script type="text/javascript">
	
	function validateUserName() {
		var userName = document.getElementById('yn').value;
		if (userName.length < 3 || userName.length > 15) {
			alert("Your name should have char between 3-15");
			return false;
		} else {
			return true;
		}
	}
	
</script>

</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr />

	<!-- A spring mvc html form  -->
	<form:form action="process-homepage" method="get" modelAttribute="userInfo" onsubmit="return validateUserName()">
		<div align="center">
			<p>
				<label for="yn">Your Name : </label>
				<form:input id="yn" path="userName" />
				<form:errors path="userName" cssClass="error" />
			</p>
			<p>
				<label for="cn">Crush Name : </label>
				<form:input id="cn" path="crushName" />
				<form:errors path="crushName" cssClass="error" />
			</p>
			<p>
				<form:checkbox path="termAndCondition" id="check" />
				<label>I am agreeing that is for fun</label>
				<form:errors path="termAndCondition" cssClass="error" />
			</p>
			<input type="submit" value="Calculate" />
		</div>
	</form:form>

	<!-- A simple html form  -->
	<%-- <form action="process-homepage" method="get">
		<div align="center">
			<p>
				<label for="yn">Your Name : </label> <input type="text" id="yn"
					name="userName" />
			</p>
			<p>
				<label for="cn">Crush Name : </label> <input type="text" id="cn"
					name="crushName" />
			</p>
			<input type="submit" value="Calculate" />
		</div>
	</form> --%>
</body>
</html>