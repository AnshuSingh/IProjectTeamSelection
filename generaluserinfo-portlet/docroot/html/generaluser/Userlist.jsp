<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/html/generaluser/init.jsp" %>
<%@page import="com.generaluser.slayer.model.Employee" %>
<%@page import="com.generaluser.slayer.service.EmployeeLocalServiceUtil"%>

<%
PortletURL updateuserURL = renderResponse.createActionURL();
updateuserURL.setParameter(ActionRequest.ACTION_NAME, "updateuser");
%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Subscribers</title>

</head>
<body>
<%
int count = EmployeeLocalServiceUtil.getEmployeesCount();
List<Employee> subscribers = EmployeeLocalServiceUtil.getEmployees(0, count); 
%>

<form method="post" action="<%= updateuserURL.toString() %>"> 
<table width="540" align="center" border="0" cellspacing="10" cellpadding="0">
<tr>
<th align="center" width="30%"> Subscriber Name</th>
<th align="center" width="30%"> Role </th>
<th align="center" style="display:none"> UserId</th>
<th align="center" width="30%"> Select All </th>
</tr>
</table>
<%
for (Employee subs : subscribers) {
%>

<table width="540" align="center" border="0" cellspacing="10" cellpadding="0" id="mytable">
<tr >
	<td  width="30%"><%= (((subs.getFirstName()==null)?"":subs.getFirstName()) + "  " +((subs.getLastName()==null)?"":subs.getLastName())) %> </td>
	<td  width="50%" ><%= ((subs.getRole()==null)?"                  ":subs.getRole()) %> </td>
	<td  width="50%" id="employeeid" ><%= subs.getEmployeeId() %> </td>
	<td  width="20%" id="checkboxid"> <input id="checkid" type="checkbox" name="approveuser"  ></td>
</tr>
</table>

<%
}
%>

<input align="left" name="" type="submit" value="Accept" />
</form>
</body>
</html>