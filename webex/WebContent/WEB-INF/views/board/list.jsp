<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<ul>
<c:forEach items="${list}" var="board">
  <li>${board.bno} <c:out value="${board.title}"></c:out></li>
</c:forEach>
</ul>





</body>
</html>