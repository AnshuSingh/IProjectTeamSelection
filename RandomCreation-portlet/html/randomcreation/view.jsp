<%@ include file="/html/randomcreation/init.jsp" %>

<%
PortletURL listteamsURL = renderResponse.createRenderURL();
listteamsURL.setParameter("jspPage", "/html/randomcreation/list.jsp");
%>

<%
PortletURL updateTeamsURL = renderResponse.createActionURL();
updateTeamsURL.setParameter(
ActionRequest.ACTION_NAME, "createTeams");
%>


<%
	int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
	List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0,
			count);
%>

<form name="<portlet:namespace/>fm" method="POST" action="<%=
updateTeamsURL.toString() %>">
<%
		for (Projectdetail project : projects) {
	%>
	 <%= project.getProjectTitle() %>
	<%
		}
	%>
<br ><br >
Enter the number of students: <select type="number" name="numofStudents"><option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
<option>6</option>
<option>7</option></select><br >
Enter the weightage to be assigned for the following:<br />
<table border ="0">
<tr><td>
Student Preference:</td><td> </td><td>
<select name="pref" ><option>0-1</option>
<option>2-3</option>
<option>4-5</option>
<option>6-7</option>
<option>8-10</option></select></td></tr><tr><td>
Student skills:</td><td> </td><td>
<select name="skills" ><option>0-1</option>
<option>2-3</option>
<option>4-5</option>
<option>6-7</option>
<option>8-10</option></select></td></tr><tr><td>
GPA:</td><td> </td><td>
<select name="gpa" ><option>0-1</option>
<option>2-3</option>
<option>4-5</option>
<option>6-7</option>
<option>8-10</option></select></td></tr><tr><td>
Student Availability:</td><td> </td><td>
<select name="avail" ><option>0-1</option>
<option>2-3</option>
<option>4-5</option>
<option>6-7</option>
<option>8-10</option></select></td></tr>
</table>

<br /><br ><br >

<input type="submit" value="Submit">&nbsp;</form>
</form>

<a href="<%= listteamsURL.toString() %>">Show all Teams &raquo;</a>





