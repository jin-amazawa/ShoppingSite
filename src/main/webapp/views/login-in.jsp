<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/static/css/login.css?v=<%= System.currentTimeMillis() %>">
</head>
<body>

	<form action="<%= request.getContextPath() %>/login" method="post">
		<label for="id">ID</label>
		<input type="text" id="id" name="id" required><br> 
		<label for="password">パスワード</label>
		<input type="password" id="password" name="password" required><br>
		<button type="submit">ログイン</button>
	</form> 
	
	<p>アカウントをお持ちでない方は 
	<a href="${pageContext.request.contextPath}/views/register.jsp">新規登録はこちら</a>
	</p>

</body>
</html>