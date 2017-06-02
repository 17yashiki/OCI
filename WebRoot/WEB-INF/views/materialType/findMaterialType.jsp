<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'addRole.jsp' starting page</title>
    
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
   <h2>Student Information</h2>
   
   
<form:form method="POST" action="find" commandName="materialTypeSearcher">
<form:errors path="*" cssClass="errorStyle" element="div" />
<table>
<tr>
	
        <td>typename：</td>
        <td><form:input path="typeName" /></td>
        <td><form:errors path="typeName" cssClass="error" /></td>
        <td>reserve1：</td>
        <td><form:input path="reserve1" /></td>
        <td><form:errors path="reserve1" cssClass="error" /></td>
        <td>reserve2：</td>
        <td><form:input path="reserve2" /></td>
        <td><form:errors path="reserve2" cssClass="error" /></td>
        <td>reserve3：</td>
        <td><form:input path="reserve3" /></td>
        <td><form:errors path="reserve3" cssClass="error" /></td>
       
        <td colspan="2">
            <input type="submit" value="查询"/>
        </td>
   </tr>
</table>  
</form:form>
   
   

<table>
	<c:forEach var="materialType" items="${materialTypes}">
	<tr>
		<td><c:out value="${materialType.typeId}"></c:out></td>
		<td><c:out value="${materialType.typeName}"></c:out></td>
		<td><c:out value="${materialType.reserve1}"></c:out></td>
		<td><c:out value="${materialType.reserve2}"></c:out></td>
		<td><c:out value="${materialType.reserve3}"></c:out></td>
		<td><a href="update/${materialType.typeId}">更新</a>	
		<td><a href="delete/${materialType.typeId}">删除</a>	
	</tr>
	</c:forEach>
</table>
  </body>
</html>
