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
<c:forEach items="${emplist }" var="empVO">
<H3> 사번 :  ${empVO.employee_id} 이름 : ${empVO.last_name}, ${empVO.first_name}</H3>

</c:forEach>

</body>
</html>