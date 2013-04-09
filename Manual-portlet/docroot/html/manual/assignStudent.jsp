<%@ include file="/html/manual/init.jsp" %>

<%
PortletURL updateTeamsURL = renderResponse.createActionURL();
updateTeamsURL.setParameter(
ActionRequest.ACTION_NAME, "createTeams");
%>
Select students:
<%
	int studentCount = StudentLocalServiceUtil.getStudentsCount();
	List<Student> students = StudentLocalServiceUtil.getStudents(0,
			studentCount);
%>

<form name="<portlet:namespace/>fm" method="POST" action="<%=
updateTeamsURL.toString() %>">

<br ><br >

</table>
<br ><br >
<table width="80%" border=1 >
<th>select</th>
<th>ASUID</th>
<th>Name</th>
<th>Course</th>
<th>Level</th>
<th>GPA</th>
<th>Sex</th></tr>

<%
		for (Student stud : students) {
	%>
	<tr>
	<td><input type="checkbox" id = "<%= stud.getAsuid() %>" name="student" value="<%= stud.getAsuid() %>"></td>
	
	<td><%= stud.getAsuid() %></td>
	<td><%= stud.getStudentName() %></td>
	<td><%= stud.getCourse() %></td>
	<td><%= stud.getLevel() %></td>
	<td><%= stud.getGpa() %></td>
	<td><%= stud.getSex() %></td>
	</tr>
	<%
		}
	%>

</table><br /><br ><br >

<input type="submit" value="Create Team">
<p>
</p>

<a href="<portlet:renderURL/>">&laquo;Back</a>


</form><br><br>