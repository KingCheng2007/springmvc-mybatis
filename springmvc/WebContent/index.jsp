<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 标题 -->
<title>JCM - 自学系统</title>
<!-- 页面小标题 -->
<!-- href 中的地址对应的是资源 ，/表示不带webPath ，直接写资源表示带资源 -->
<link rel="shortcut icon" href="resources/img/JCM-sys.ico"  type="image/x-icon">
<script src="resources/js/jquery-1.7.2.js" type="text/javascript"></script>
</head>
<body>
	<form name="loginForm">
		<table>
			<tr>
				<td align="right">用户名</td>
				<td><input type="text" name ="username" onclick="test()"></td>
			</tr>
			<tr>
				<td align="right">密码</td>
				<td><input type="password" name ="password" ></td>
			</tr>
			<tr align="center">
				<td><input type="submit" name ="submit" value="提交" ></td>
				<td><input type="reset" name ="reset" value="重置"></td>
			</tr>
			
		</table>
		<div class = "message">
			${message}<%session.removeAttribute("message") ;%>
		</div>
	</form>
</body>

<script type="text/javascript">
	$(function(){
		<!--- 打印断点 --->
		console.log("歡迎進入系統");
	});
	
	$("input[name='submit']").click(function() {
		$("form").attr("method","POST").attr("action","login");
	});
	function test() {
		var v_t = $("input[name='username']").val();
		$("input[name='username']").val("jcm");
		$("input[name='password']").val("111111");
	}
</script>
</html>