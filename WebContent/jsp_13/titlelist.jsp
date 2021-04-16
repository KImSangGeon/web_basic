<%@page import="web_basic_jsp_13.erp.Title"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    List<Title> list = (List<Title>)request.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
<link rel = "stylesheet" href = "css/insert.css">
	<style>
	nav{
	width: 100%;
	height: 60px;
	background-color: #0080c0;
}
nav ul{
	list-style-type: none;
}
nav ul li{
	display: inline-block;
	margin: 20px;
	width: 100px;
}
nav ul li a{
	color: black;
	text-decoration: none;
}
</style>
	
</head>
<body>
		
<nav>
				<ul>
					<li><a href = "TitleServlet">직책 목록</a></li>
					<li><a href = "insertTitle.jsp">직책 추가</a></li>
					<li><a href = "titledelete2.jsp">직책 삭제</a></li>
					<li><a href = "modifytitle.jsp">직책 수정</a></li>
				</ul>		
		</nav>
<%
	if(list.size()>0){
		for(Title t : list){
%>
	<%=t.gettNo() %><%= t.gettName() %><br>
<%			
		}
	}else{
%>
 	데이터가 없음.
<%
	}
%>


</body>
</html>