<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/html/subscriberapprove/init.jsp" %>
<%@page import="com.CreateUser.model.useraccount" %>
<%@page import="com.CreateUser.service.useraccountLocalServiceUtil" %>

<%
PortletURL updateuserURL = renderResponse.createActionURL();
updateuserURL.setParameter(ActionRequest.ACTION_NAME, "updateuser");
%>

<%
int count = useraccountLocalServiceUtil.getuseraccountsCount();
List<useraccount> subscribers = useraccountLocalServiceUtil.getuseraccounts(0, count); 
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
for (useraccount subs : subscribers) {	
%>



<table width="540" align="center" border="0" cellspacing="10" cellpadding="0" id="mytable">
<tr >
	<td  width="30%"><%= (((subs.getFirstName()==null)?"":subs.getFirstName()) + "  " +((subs.getLastName()==null)?"":subs.getLastName())) %> </td>
	<td  width="50%" ><%= ((subs.getRole()==null)?"                  ":subs.getRole()) %> </td>
	<td  width="50%" style="display:none" id="employeeid" ><%= subs.getUseraccountId() %> </td>
	<td  width="20%" id="checkboxid"> <input id="<%=subs.getUseraccountId() %>" type="checkbox" name="approveuser" value="<%=subs.getUseraccountId() %>" ></td>
</tr>
</table>

<%
}
%>

<input align="left" name="" type="submit" value="Accept" />
</form>