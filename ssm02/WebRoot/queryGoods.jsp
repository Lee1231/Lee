<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'queryGoods.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="jquery-1.8.2.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){ 
			$("#bt").click(function(){
				$.ajax({
     		type: 'POST',
     		url: 'findUser',
    		data: 'id=3',
    		success: function(result){
    			var user = eval(result);
    			alert(user.username);
    		}
});
			});
		}); 
	</script>
  </head>
  
  <body>
  <H1>高级查询</H1>
  	<input type="button" id="bt" value="testAjax"/>
  	<input id="input1"/>
  	<br/>
    <form action="user/findGoods_User.action">
    	商品名称:<input name="name"/><br/>
    	最低价格:<input name="minPrice"/><br/>
    	最高价格:<input name="maxPrice"/><br/>
    	<input type="submit"/>
    </form>
  </body>
</html>
