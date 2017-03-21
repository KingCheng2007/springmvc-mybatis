<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.listtable td{
	vertical-align: middle;
	text-align: center;
}
.ttab td{
border:solid 1px #b5d6e6;
}
</style>
</head>
<body>
	<table class="ttab" cellspacing="1">
		<tr>
			<td>序列</td>
			<td>用户名</td>
			<td>密码</td>
			<td>年纪</td>
			<td>性别</td>
		</tr>
		<c:forEach var="u" items="${list}"  >
			<tr>
				<td>${u.id}</td>
				<td>${u.username}</td>
				<td>${u.password}</td>
				<td>${u.age}</td>
				<td><c:if test="${u.sex==0}">女</c:if><c:if test="${u.sex==1}">男</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>