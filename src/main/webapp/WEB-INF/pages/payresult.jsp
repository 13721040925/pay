<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html >
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title></title>
<script src="<%=request.getContextPath() %>/js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		var result="${result}";
		alert(result);
	});
</script>
</head>
<body>

</body>
</html>