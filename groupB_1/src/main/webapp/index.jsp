<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
        .f-container {
            margin: 10px;
            display: grid;
            grid-template-columns: 1fr 1fr;
            grid-gap: 1em;
            text-align: center;
        }

        label {
            text-align: right;
        }

        form {

            margin: auto;
            margin-top: 15%;
            width: 30%;
            padding: 20px;
            text-align: center;
            box-shadow: 0 0 8px 5px #AAA;
        }

        .btn {
            width: 70%;
        }
    </style>
</head>
<body>
<form name="userreg" action="Register" method="post">
	<div class="f-container">
		<label>Enter id: </label>
		<input type="text" name="uid" id="uid">
	</div>
	<div class="f-container">
		<label>Enter name: </label>
		<input type="text" name="uname" id="uname">
	</div>
	<div class="f-container">
		<label>Enter password: </label>
		<input type="text" name="upwd" id="upwd">
	</div>
	<div class="f-container">
		<label>Enter contact no: </label>
		<input type="text" name="contact" id="contact">
	</div>
	<div class="f-container">
		<label>Enter mail id: </label>
		<input type="text" name="email" id="email">
	</div>
	<div class="f-container">
		<label>Select gender: </label>
		<input type="radio" name="gender" id="male" value="male">Male
		<input type="radio" name="gender" id="female" value="female">Female
	</div>
	<div class="f-container">
		<input type="submit" value="ok">
		<input type="reset" value="reset">
	</div>
</form>
</body>
</html>