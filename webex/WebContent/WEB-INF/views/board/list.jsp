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

<ul class='paging'>
  <c:if test="${pm.prev}">
  <li><a href='/board/list?page=${pm.start -1}'>이전</a></li>  
  </c:if>
  
  <c:forEach begin="${pm.start}" end="${pm.end}" var="step">
  <li class='${pm.current == step?"now":""}'>
    <a href='/board/list?page=${step}'>
    ${step}
    </a>
    </li>
  </c:forEach>
  
  <c:if test="${pm.next}">
  <li><a href='/board/list?page=${pm.end + 1 }'> 다음</a> </li>  
  </c:if>
</ul>



</body>
</html>