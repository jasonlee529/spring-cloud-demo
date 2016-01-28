<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Cart Application</title>
</head>
<body>
	<h1>Hello!</h1>
	<br />
	<a href="${ctx }/shopping.flow">View Cart</a>
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<a href="${ctx }/shopping2.flow">View Cart2</a>
		<br />
	<br />
	<a href="${ctx }/test/shopping2.flow">View Cart3</a>
</body>
</html>