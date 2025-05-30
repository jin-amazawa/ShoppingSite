<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<p>ようこそ、${firstName}さん！</p>
	<p><input type = "submit" value = "修正"></p> 
	<p><input type = "submit" value = "削除"></p>
	<p><a href = "<%= request.getContextPath() %>/logout">ログアウト</a></p> 
	<p><a href = "<%= request.getContextPath() %>/views/register.jsp">とりあえず新規登録ページへ</a></p>
</body>
</html>