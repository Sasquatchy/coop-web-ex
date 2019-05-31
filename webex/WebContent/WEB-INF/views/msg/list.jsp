<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list of messages</title>
</head>
<body>
<h1>Message Box for ${list[0].whom}</h1>
<h2><a href='/msg/send?page=${pageManager.current}'>메시지 보내기</a></h2>
<ul>
<c:forEach items="${list}" var="msg">
  <li>${msg.mno} <c:out value="${msg.sender}"></c:out> <c:out value="${msg.msg}"></c:out> <c:out value="${msg.regdate}"></c:out></li>
</c:forEach>
</ul>

<style>
.paging { display: flex;}
.paging li {
	margin: 0.5em;
	background-color: skyblue;
	width: 3em;
	align-content: center;
	text-align: center;
	border-radius: 0.5em;
	font-weight: bold;
	border: 0px;
}


.paging li.now {
	background-color:red;
}
</style>

<ul class='paging'>
  <c:if test="${pageManager.prev}">
  <li><a href='/msg/list?page=${pageManager.start -1}'>이전</a></li>  
  </c:if>
  <c:forEach begin="${pageManager.start}" end="${pageManager.end}" var="step">
  <li class='${pageManager.current == step?"now":""}'>
    <a href='/msg/list?page=${step}'>
    ${step}
    </a>
    </li>
  </c:forEach>
  <c:if test="${pageManager.next}">
  <li><a href='/msg/list?page=${pageManager.end + 1 }'> 다음</a> </li>  
  </c:if>
</ul>



</body>
</html>