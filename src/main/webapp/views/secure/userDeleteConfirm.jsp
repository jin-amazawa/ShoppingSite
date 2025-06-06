<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>削除してよろしいですか？</h2>
	<p>${lastName}さん</p>
	<form action = "<%=request.getContextPath() %>/userDelete" method = "post">
		<button type = "submit">はい</button>
	</form>
	<a href = "<%=request.getContextPath() %>/views/secure/user-menu.jsp"><button>キャンセル</button></a>
</body>
</html>