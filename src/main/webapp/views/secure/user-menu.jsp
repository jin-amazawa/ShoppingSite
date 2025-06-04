<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/static/js/confirm.js"></script>
</head>
<body>
	<p>ようこそ、${user.lastName}さん！</p>
	<a href="user-edit.jsp"><button type="button">修正</button></a>
	<form action="<%=request.getContextPath() %>/userDeleteConfirm" method="post">
		<button type="submit">削除</button>
	</form>
	<p>
		<a href="<%= request.getContextPath() %>/logout">ログアウト</a>
	</p>
</body>
</html>