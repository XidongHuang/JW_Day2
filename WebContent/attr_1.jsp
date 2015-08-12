<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		pageContext.setAttribute("pageContextAttr", "pageContextValue");	
		request.setAttribute("requestAttr", "requestValue");
		session.setAttribute("sessionAttr", "sessionValue");
		application.setAttribute("applicationAttr", "applicationValue");	
	
	%>
	
	<h2>Attr 1 Page<%= new Date() %></h2>
	
	
	<br><br><!-- 属性范围: 当前页面 -->
	pageContextAttr:<%= pageContext.getAttribute("pageContextAttr") %>
	
	<br><br><!-- 属性范围: 仅限于同一个请求 -->
	requestAttr:<%= request.getAttribute("requestAttr") %>
	
	<br><br><!-- 属性范围: 限于一次会话(页面从打开到关闭)-->
	sessionAttr:<%= session.getAttribute("sessionAttr") %>
	
	<br><br>
	<!-- 属性范围: 当前 WEB 应用. 是范围最大的属性作用范围，
	只要在一处设置属性，在其他各处的 JSP 或 Servlet 都可以获取到 -->
	applicationAttr:<%= application.getAttribute("applicationAttr") %>
	
	<br><br>
	<a href="attr_2.jsp">To Attr2 Page</a>
	
	<br><br>
	<a href="testAttr">To Attr Servlet</a>

</body>
</html>