<%@ include file="/html/manual/init.jsp" %>


<%
PortletURL saveURL = renderResponse.createActionURL();
saveURL.setParameter(
ActionRequest.ACTION_NAME, "saveteam");

Team team= new TeamImpl();
long tmID = ParamUtil.getLong(request, "teamID");
if (tmID > 0L) {
team = TeamLocalServiceUtil.getTeam(tmID);
System.out.println(ParamUtil.getLong(request, "teamID"));
}


%>

<b>Manual Team Creation:</b></p>

Select iProject: 
<%
	int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
	List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0,
			count);
%>
<%
	int facultyCount = FacultyLocalServiceUtil.getFacultiesCount();
	List<Faculty> faculties = FacultyLocalServiceUtil.getFaculties(0,
			facultyCount);
%>

<%
	int studentCount = StudentLocalServiceUtil.getStudentsCount();
	List<Student> students = StudentLocalServiceUtil.getStudents(0,
			studentCount);
%>

<portlet:actionURL var="updateTeamsURL" name="updateTeams">	
		<portlet:param name="jspPage" value="/update.jsp" />	
	</portlet:actionURL>
	
<form name="<portlet:namespace/>fm" method="POST" action="<%=
updateTeamsURL.toString() %>">
<input type="hidden" name="redirectURL" value="<%= renderResponse.createRenderURL().toString() %>"/>
<input type="hidden" name="teamID" value="<%= String.valueOf(team.getTeamID()) %>"/>
<select name="project" >
<option></option>
<%
		for (Projectdetail project : projects) {
	%>
	<option> <%= project.getProjectTitle() %></option>
	<%
		}
	%>
	
</select>
<br ><br >
<b>Select Faculty Mentors:</b>
<p>Maximum 3 Mentors per team</p>
<table width="80%" border=1>
<th>select</th>
<th>ASUID</th>
<th>Name</th>
<th>Department</th>
<tr></tr><%

		for (Faculty fclty : faculties) {
	%>
	<tr>
	
	<td><input type="checkbox" id = "<%= fclty.getAsuid()  %>" name="faculty"  value="<%= fclty.getAsuid()  %>"></td>
	
	<td><%= fclty.getAsuid() %></td>
	<td><%= fclty.getFacultyName() %></td>
	<td><%= fclty.getFacultyDept()  %></td>
	</tr>
	<%
		}

	%>
	
</table>
<br ><br >
<b>Select student for the Team: </b>
<p>Minimium 4 Students per Team</p>
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

<input type="submit" value="Save">
<p>
</p>

<a href="<portlet:renderURL/>">&laquo;Back</a>

</form><br><br>