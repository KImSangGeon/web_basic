<%@page import="web_basic.erp.ds.jndiDS"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
    <c:set var ="con" value = "${jndiDS.getConnection() }"/> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 베이스 연동 테스트</title>
</head>
<body>
		<c:out value="${con }"></c:out>
		<fieldset>
				<legend>ERP</legend>
				<ul>
					<li><a href = "TitleServlet">직책관리</a></li>
					<li><a href = "DeptServlet">부서관리</a></li>
					<li><a href = "EmpServlet">직원관리</a></li>
				</ul>
				
		</fieldset>

</body>
</html>