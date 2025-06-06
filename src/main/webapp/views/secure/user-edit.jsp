<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>会員情報編集画面</h1>
	<form action = "<%=request.getContextPath() %>/userEditConfirm" method = "post">
		<p>名前(性): <input type = "text" name = "lastName" value = "${user.lastName}"></p>
		<p>名前(名): <input type = "text" name = "firstName" value = "${user.firstName}"></p>
		<p>メールアドレス: <input type = "email" name = "email" value = "${user.mailAddress}"></p>
		<p><input type = "submit" value = "確認"></p>
	</form>
	
	<p><a href = "<%=request.getContextPath() %>/views/secure/user-menu.jsp">メニュー画面へ戻る</a></p>
</body>
</html>