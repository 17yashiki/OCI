<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <sec:authorize access="hasRole('role_add')"> <a href="role/add">diandian</a></sec:authorize>
    <sec:authorize access="hasRole('role_find')"><a href="role/find">再点点</a></sec:authorize>
      <sec:authorize access="hasRole('type_add')"> <a href="materialType/add">diandian</a></sec:authorize>
    <sec:authorize access="hasRole('type_find')"><a href="materialType/find">再点点</a></sec:authorize>
 <sec:authorize access="hasRole('group_add')"> <a href="group/add">diandian</a></sec:authorize>
    <sec:authorize access="hasRole('group_find')"><a href="group/find">再点点</a></sec:authorize>
    <br>
    
    <sec:authorize access="hasRole('projecttype_add')"> <a href="projectType/add">diandian</a></sec:authorize>
    <sec:authorize access="hasRole('projecttype_find')"><a href="projectType/find">再点点</a></sec:authorize>
    
    <sec:authorize access="hasRole('grouprole_add')"> <a href="roleAndGroup/add">diandian</a></sec:authorize>
    <sec:authorize access="hasRole('grouprole_add')"> <a href="roleAndGroup/adds">diandian</a></sec:authorize>
    <sec:authorize access="hasRole('grouprole_find')"><a href="roleAndGroup/find">再点点</a></sec:authorize>
    
    <sec:authorize access="hasRole('progress_add')"> <a href="progress/add">diandian</a></sec:authorize>
    <sec:authorize access="hasRole('progress_find')"><a href="progress/find">再点点</a></sec:authorize>
    
    
        
    <a href="login?logout">登入</a>
  </body>
</html>
