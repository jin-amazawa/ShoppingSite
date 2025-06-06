<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>登録する内容はよろしいですか？</h1>
	<form action = "<%=request.getContextPath() %>/addUser" method = "post">
		<p>ユーザーID: ${user.ID}</p>
		<p>パスワード: ${user.password}</p>
		<p>名前（性）: ${user.lastName}</p>
		<p>名前（名）: ${user.firstName}</p>
		<p>住所 : ${user.address}</p>
		<p>メールアドレス : ${user.mailAddress}</p>
		<input type = "submit" value = "登録">
	</form>


	<a href = "<%=request.getContextPath() %>/views/register.jsp"><button>もどる</button></a>
</body>
</html>