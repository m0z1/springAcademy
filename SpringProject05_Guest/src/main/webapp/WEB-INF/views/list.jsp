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
<h2>Guest List(${count })</h2>
<c:forEach items="${guest }" var="guest">
<br/>
	이름 : ${guest.name }<br/>
	내용 : ${guest.content }<br/>
	등급  : ${guest.grade }<br/>
</c:forEach>

<br/><br/>
</body>
</html>