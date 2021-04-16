<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "css/insert.css">
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
		<h2>직책 관리 삭제 폼</h2>
			<form action="titledelete" method = "post">
			<fieldset>
			<label for = "titleNo">직책번호 : </label>
			<input type="text" name ="titleNo" id = "titleNo" autofocus required/><br>
			
			
			<input type = "submit" value = "삭제">		
			<input type = "submit" value = "취소">	
			</fieldset>
			</form>
</body>
</html>