<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>新規会員登録</h1>
	<form action="<%= request.getContextPath() %>/UserAddConfirm" method="post"> 
		<p>ユーザーID: <input type = "text" name = "id" pattern="[A-Za-z0-9]+" required>半角英数字</p>
		<p>パスワード: <input type = "password" name = "password" pattern="[A-Za-z0-9]+" required>半角英数字</p>
		<p>名前（性）: <input type = "text" name = "lastName" required></p>
		<p>名前（名）: <input type = "text" name = "firstName" required></p>
		<p>住所 : <input type = "text" name = "address" required></p>
		<p>メールアドレス: <input type = "email" name = "email" required></p>
		
		<input type = "submit" value = "確認">
		<button type = "reset">リセット</button>
	</form>
	<p>
		<a href="<%= request.getContextPath() %>/views/login-in.jsp">ログインページへ</a>
	</p>
</body>
</html>