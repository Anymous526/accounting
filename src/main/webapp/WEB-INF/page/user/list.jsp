<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UserList</title>
<style type="text/css">

 td{
 	text-align: center;
 }

</style>
</head>
<body>

	<table border="1" align="center">
		<tr>
			<td>ID</td>
			<td>姓名</td>
			<td>姓别</td>
			<td>生日</td>
		</tr>

		<c:forEach items="${user}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.sex}</td>
				<td>${item.birthday}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>