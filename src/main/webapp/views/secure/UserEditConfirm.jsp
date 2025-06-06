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

	<form action="<%=request.getContextPath() %>/userEdit" method="post">
		<p>名前（性）: ${user.lastName}</p>
		<p>名前（名）: ${user.firstName}</p>
		<p>メールアドレス : ${user.mailAddress}</p>
		<input type = "submit" value="登録">
		<a href = "<%=request.getContextPath() %>/views/secure/user-edit.jsp"><button type = "button">戻る</button></a>
	</form>
</body>
</html>