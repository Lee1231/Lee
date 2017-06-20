<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'goodsList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table border="1">
    	<tr>
    		<th>id</th>
    		<th>name</th>
    		<th>price</th>
    	</tr>
    	<c:forEach items="${userGoodsVo.goods }" var="goods">
    		<tr>
    			<td>${goods.id }</td>
    			<td>${goods.name }</td>
    			<td>${goods.price }</td>
    		</tr>
    		
    	</c:forEach>
    	
    </table>
    <br/>
    <hr/>
    <table border="1">
    	<tr>
    		<th>id</th>
    		<th>用户名</th>
    		<th>邮箱</th>
    	</tr>
    	<c:forEach items="${userGoodsVo.users }" var="user">
    		<tr>
    			<td>${user.id }</td>
    			<td>${user.username }</td>
    			<td>${user.email }</td>
    		</tr>
    		
    	</c:forEach>
    	
    </table>
  </body>
</html>
