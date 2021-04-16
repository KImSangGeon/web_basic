<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
		HttpServletRequest  httpRequest = (HttpServletRequest) pageContext.getRequest();
%>
		request 와 pageContext.geRequest() 동일여부:
		<%= request == httpRequest %>
		
<%
		pageContext.include("pageContextTest3.jsp");
%>
<h2>pageContext의 forward 메서드로 포워딩된 페이지</h2>

pageContext.getOut() 메서드를 사용한 데이터 출력
<%
		pageContext.getOut().println("안녕하세요.");
%>

</body>
</html>