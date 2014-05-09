<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ad.jsp' starting page</title>
    
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
	<h1>${ad1[0].title}</h1>
    <c:forEach items = "${ad1}" var = "a1" >
    	${a1.id}
    	---${a1.title }
    	---${a1.image }
    	---${a1.position } 
    	---${a1.intro }
    	---${a1.type }  
    	<br/>
    </c:forEach>
    
    <c:forEach items = "${ad2}" var = "a2" >
    	${a2.id}
    	---${a2.title }
    	---${a2.image }
    	---${a2.position } 
    	---${a2.intro }
    	---${a2.type }  
    	<br/>
    </c:forEach>
    
    <c:forEach items = "${ad3}" var = "a3" >
    	${a3.id}
    	---${a3.title }
    	---${a3.image }
    	---${a3.position } 
    	---${a3.intro }
    	---${a3.type }  
    	<br/>
    </c:forEach>
  </body>
</html>
