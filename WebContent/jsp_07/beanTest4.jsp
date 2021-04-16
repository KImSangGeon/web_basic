<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 	<jsp:useBean id="std" class ="web_basic_jsp_07.Student" scope = "page"/>
 	<jsp:setProperty name="std" property= "*"/>
 <%
 	request.setCharacterEncoding("UTF-8"); 
 %>	
 	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<h1>자바빈 속성 값 출력</h1>
			<b>번호 : </b><%=std.getStdNo() %><br>
			<b>성명 : </b><%=std.getStdName()%><br>
			<b>국어 : </b><%=std.getKor() %><br>
			<b>영어 : </b><%=std.getEng() %><br>
			<b>수학 : </b><%=std.getMath() %><br>
			<b>총점 : </b><%=std.getTotal() %><br>
			<b>평균 : </b><%=std.getAvg() %><br>
			<hr>
			<b>번호 : </b><jsp:getProperty property="stdNo" name="std"/><br>
			<b>성명 : </b><jsp:getProperty property="stdName" name="std"/><br>
			<b>국어 : </b><jsp:getProperty property="kor" name="std"/><br>
			<b>영어 : </b><jsp:getProperty property="eng" name="std"/><br>
			<b>수학 : </b><jsp:getProperty property="math" name="std"/><br>
			<b>총점 : </b><jsp:getProperty property="total" name="std"/><br>
			<b>평균 : </b><jsp:getProperty property="avg" name="std"/><br> 
</body>
</html>