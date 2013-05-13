<%@ include file="/html/instructorselected/init.jsp" %>
 
<liferay-ui:error key="error"  message="error-message" />
<liferay-ui:error key="error-key-2" message="this-is-error-message-2" />
<%
	PortletURL saveURL = renderResponse.createActionURL();
	saveURL.setParameter(ActionRequest.ACTION_NAME, "saveteam");
	int count = iProjectLocalServiceUtil.getiProjectsCount();
 	List<iProject> projects = iProjectLocalServiceUtil.getiProjects(0, count);
	int facultyCount = facultyLocalServiceUtil.getfacultyCount();
	List<faculty> faculties = facultyLocalServiceUtil.getfaculties(0,facultyCount);
%>
<div class="backlink"> 
 <a href="<portlet:renderURL/>">&laquo;Back</a>
 </div>


<h1>Manual Team Creation:</h1> <br>  
 
 <h2>Select an iProject</h2>
 <portlet:actionURL var="updateTeamsURL" name="updateTeams">	
		<portlet:param name="jspPage" value="/update.jsp" />	
	</portlet:actionURL>
	
<form name="<portlet:namespace/>fm" method="POST" action="<%=
updateTeamsURL.toString() %>">

<input type="hidden" name="redirectURL" value="<%= renderResponse.createRenderURL().toString() %>"/>
<select name="project" >
	<option></option>
<%
	for (iProject project : projects) {
%>
	<option name="Project_titile"> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
<br ><br >

<b>Select faculty for the Team: </b>
<p>Maximum of 3 Faculty mentors per Team</p>
<div id="tableContainer" class="tableContainer">
<input type="text" id="filter" placeholder="Enter a search criteria">
<table id="table" width="100%" border=1 cellpadding="0" cellspacing="0" class="scrollTable"> 
<thead class="fixedHeader">
	<tr>
		<th>Select</th>
		<th>FacultyID</th>
		<th>Asuid</th>		
		<th>Faculty Name</th>
		<th>FacultyDept</th>
		<th>contact</th>
	</tr>
</thead>


<%

int team_count = TeamLocalServiceUtil.getTeamsCount();
List<Team> teams = TeamLocalServiceUtil.getTeams(0, team_count);

%>

	<tbody class="scrollContent">

<%
		for (faculty fclty: faculties) {
			if (fclty.getPhone().equals("assigned = true"))
				continue;
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

	</tbody>
</table><br /><br ><br >
</div>
<br></br>
<input type="submit" value="Save">
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="Reset">
<p>
</p>

</form><br><br>
<script type="text/javascript">
<!--
filter
//-->

var $rows = $('#table tr');
$('#filter').keyup(function() {
    var val = $.trim($(this).val()).replace(/ +/g, ' ').toLowerCase();
    
    $rows.show().filter(function() {
        var text = $(this).text().replace(/\s+/g, ' ').toLowerCase();
        return !~text.indexOf(val);
    }).hide();
});
</script>

