<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Project</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Project</h1>
        <form:form action="saveProject" method="post" modelAttribute="project">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Project Name:</td>
                <td><form:input path="project_name" /></td>
            </tr>
            <tr>
                <td>Project Description:</td>
                <td><form:input path="project_description" /></td>
            </tr>
           
           
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>