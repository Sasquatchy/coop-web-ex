<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
	${sent == 1?"매시지가 성공적으로 보내졌습니다":"매시지 전송이 실패하였습니다." }
	<script type="text/javascript">

	setTimeout(() => {self.location="/msg/list";}, 1000);
</script>
</h1>
</body>
</html>