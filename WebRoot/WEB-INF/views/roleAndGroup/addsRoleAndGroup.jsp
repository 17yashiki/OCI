<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
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
<form:form method="POST" action="adds" commandName="roleAndGroupAdd">
<form:errors path="*" cssClass="errorStyle" element="div" />
   <table>
     <tr>
    	<td><form:label path="groupId">权限组：</form:label></td>
    	<td><form:select path="groupId">
    		<form:option value="NONE" lable="选择国籍..."></form:option>
    		<form:options items="${groupList}"/>
    	</form:select>
    </tr>
    
     <tr>
    	<td><form:label path="roleIds">权限：</form:label></td>
    	<td><form:checkboxes items="${roleList}" path="roleIds"/></td>
    	<td><form:select path="roleIds" items="${roleList}"
    	multiple="true"/></td>
    </tr>
    

    <tr>
        <td colspan="2">
            <input type="submit" value="提交表单"/>
        </td>
    </tr>

</table>  
</form:form>
  </body>
</html>
