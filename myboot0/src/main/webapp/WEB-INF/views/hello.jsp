<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="/jquery-3.2.1.min.js"> </script>
    <script type="text/javascript">
$(document).ready(function(){
	$("#ajaxbtn").on('click', function(){
		$.ajax({
			url: '/helloajax',
			type:'get',
			success:function(serverdata){ //ArrayList<String> 데이터를 json 객체 변경
				for(var i=0 ; i< serverdata.length; i++){
					$("#result").append("<h3>" + serverdata[i] + "</h3>");
				}//for end
			}//suc end

			
		});//ajax end
	});//on end

	
	
});
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 전달받은 모델 : ${insa }</h1>
<c:forEach items="${list }" var="subject">
<h1> ${subject}</h1>
</c:forEach>

<button id="ajaxbtn"> ajax로 요청한 결과를 출력합니다.</button>
<div id="result"> </div>
<img src="/images/corgi.jfif">
<img src="/upload/kkk8.gif">

</body>
</html>