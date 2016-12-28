<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' type='text/css' href='stylesheet.css'/>
<link rel='stylesheet' type='text/css' href='http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css'/>
<script type='text/javascript' src='script.js'></script>
<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>
</head>
<body>
	
	<a href="home/create">WELCOME !!! </a>
	<div id="header">
			<h2><br/>Select a Destination</h2>
		</div>
        <div class="left">
            <p>Departing: <input type="text" id="departing"></p>
        </div>
        <div class="right">
            <p>Returning: <input type="text" id="returning"></p>
        </div><br/>
        <div id="main">
        	<p>Destination: <select id="dropdown">
				<option value="newyork">New York</option>
				<option value="london">London</option>
				<option value="beijing">Beijing</option>
				<option value="moscow">Moscow</option>
			</select></p>
			<button>Submit</button>
        </div>
</body>
</html>