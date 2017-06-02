<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'updateRole.jsp' starting page</title>
    
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
<form:form method="POST" action="modify" commandName="progress">
<form:errors path="*" cssClass="errorStyle" element="div" />
  <table>
  	<tr>
  	<td>
  	<form:hidden path="progressId"/>
  	</td>
  	</tr>
  
    <tr>
       	<td>progressName：</td>
        <td><form:input path="progressName" /></td>
        <td><form:errors path="progressName" cssClass="error" /></td>
    </tr>
    <tr>
		<td>reserve1：</td>
        <td><form:input path="reserve1" /></td>
        <td><form:errors path="reserve1" cssClass="error" /></td>
    </tr>
     <tr>
		<td>reserve2：</td>
        <td><form:input path="reserve2" /></td>
        <td><form:errors path="reserve2" cssClass="error" /></td>
    </tr>
    
     <tr>
		<td>reserve3：</td>
        <td><form:input path="reserve3" /></td>
        <td><form:errors path="reserve3" cssClass="error" /></td>
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
