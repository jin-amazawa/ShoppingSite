<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>新規登録ページです</p>
	<form action = "" method = "post">
	<input type = "submit" value = "新規会員登録">
	</form>
	<p><a href = "<%= request.getContextPath() %>/views/login-in.jsp">ログインページへ</a></p>
</body>
</html>