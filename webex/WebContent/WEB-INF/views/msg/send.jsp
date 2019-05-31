<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>메시지 보내기</h1>
<form action="/msg/send" method="post">
	<ul>
		<li>whom<input type="text" name="whom"></li>
		<li>sender<input type="text" name="sender"></li>
		<li>msg<input type="text" name="msg"></li>
	</ul>
	<button>보내기</button>
</form>
</body>
</html>