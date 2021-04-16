<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>numberFormat formatDate</title>
</head>
<body>
		<c:set var = "price" value= "10000"/>
		
		<!-- 천단위 구분기호  -->
		<fmt:formatNumber value = "${price }" type = "number" var ="numberType"/>
		<br>
	    통화 :	<fmt:formatNumber value = "${price }" type = "currency" currencySymbol="원"/>
		<br>
		 퍼센트 : <fmt:formatNumber value = "${price }" type = "percent" groupingUsed="false"/>
		<br>
		 숫자 :  ${numberType }<br>
		 
		 <!-- #  : 필요없으면 표기 하지마라  \  : 머니 표기  -->
		패턴1 :  <fmt:formatNumber value = "${price }" pattern="00000000.00"/><br>
		패턴2 :  <fmt:formatNumber value = "${price }" pattern="#.00"/><br>
		패턴3 :  <fmt:formatNumber value = "${price }" pattern="#,###.00"/><br>
		패턴4 :  <fmt:formatNumber value = "${price }" pattern="\#,###.00 원"/><br>
		
		
		<h3>문자를 숫자로 변경</h3>
		
		<c:set var = "strPrice" value = "100000"/>
		<fmt:parseNumber value = "${strPrice }"/><br>
		<fmt:parseNumber value = "100,000" pattern="#,###.00"/><br>
		
		<h3>날짜</h3>
		<c:set var ="now" value ="<%= new Date() %>"/>
		${now }<br>
		<fmt:formatDate value="${now }" type = "date" dateStyle="full"/><br>
		<fmt:formatDate value="${now }" type = "date" dateStyle="short"/><br>
		<fmt:formatDate value="${now }" type = "time"/><br>
		<fmt:formatDate value="${now }" type = "both" dateStyle="full" timeStyle="full"/><br>
		<fmt:formatDate value="${now }" pattern="z a h: mm"/><br>
			<c:set var ="now" value ="<%= new Date() %>"/>
		<fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 a h: mm"/><br>
		
		
		
		

</body>
</html>