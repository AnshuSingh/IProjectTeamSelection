<%@ include file="/html/manual/init.jsp" %>

<portlet:defineObjects />


 
<liferay-ui:error key="error"  message="error-message" />


<liferay-ui:error key="error-key-2" message="this-is-error-message-2" />
<%
PortletURL saveURL = renderResponse.createActionURL();
saveURL.setParameter(
ActionRequest.ACTION_NAME, "saveteam");

Team team= new TeamImpl();
long tmID = ParamUtil.getLong(request, "teamID");
if (tmID > 0L) {	
team = TeamLocalServiceUtil.getTeam(tmID);
//System.out.println(ParamUtil.getLong(request, "teamID"));
}


%>
<div class="backlink"> 
 <a href="<portlet:renderURL/>">&laquo;Back</a>
 </div>
 </p>

<b>Manual Team Creation:</b></p>

     
       <br>  
       </p>

 <b>Select iProject:</b></p>
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
	<option name="Project_titile"> <%= project.getProjectTitle() %></option>
	
	<%
	}
	%>

</select>
<br ><br >
<b>Select Faculty Mentors:</b>
<p>Maximum 3 Mentors per team</p>

<table width="80%" border=1 >
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
<div id="tableContainer" class="tableContainer">
<input type="text" id="filter" placeholder="Enter a search criteria">
<table id="table" width="100%" border=1 cellpadding="0" cellspacing="0" class="scrollTable"> 
<thead class="fixedHeader">
	<tr>
		<th>select</th>
		<th>ASUID</th>
		<th>Name</th>
		<th>Course</th>
		<th>Level</th>
		<th>GPA</th>
		<th>Sex</th>
	</tr>
</thead>


<%

int team_count = TeamLocalServiceUtil.getTeamsCount();
List<Team> teams = TeamLocalServiceUtil.getTeams(0, team_count);

%>

	<tbody class="scrollContent">

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
	</tbody>
</table><br /><br ><br >
</div>
<br></br>
<input type="submit" value="Save" >
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="Reset">
<p>
</p>

</form><br><br>

</body>
</html>  
<style type="text/css">

body {
	background: #FFF;
	color: #000;
	font: normal normal 12px Verdana;
	margin: 10px;
	padding: 0
}

table, td, a {
	color: #000;
	font: normal normal 12px Verdana;
}

div.backlink{
float:right;
align:right;
font-size:150%;
}
div.title{
align:center;
}
div.tableContainer {
	clear: both;
	border: 1px solid #880000;
	height: 300px;
	overflow: auto;
	width: 800px
}

html>body div.tableContainer {
	overflow: hidden;
	width: 756px
}
div.tableContainer table {
	float: left;
	width: 740px
}
div.tableContainer table {
	float: left;
	width: 740px
}
thead.fixedHeader tr {
	position: relative
}
html>body thead.fixedHeader tr {
	display: block
}
thead.fixedHeader th {
	background:#880000;
	border-left: 1px solid #880000 ;
	border-right: 1px solid #880000 ;
	border-top: 1px solid #880000 ;
	font-weight: normal;
	padding: 4px 3px;
	text-align: left
}
thead.fixedHeader a, thead.fixedHeader a:link, thead.fixedHeader a:visited {
	color: #880000 ;
	display: block;
	text-decoration: none;
	width: 100%
}
thead.fixedHeader a:hover {
	color: #880000;
	display: block;
	text-decoration: underline;
	width: 100%
}
html>body tbody.scrollContent {
	display: block;
	height: 262px;
	overflow: auto;
	width: 100%
}
html>body tbody.scrollContent {
	display: block;
	height: 262px;
	overflow: auto;
	width: 100%
}
tbody.scrollContent tr.alternateRow td {
	background: #880000;
	border-bottom: none;
	border-left: none;
	border-right: 1px solid #880000;
	border-top: 1px solid #880000;
	padding: 2px 3px 3px 4px
}
html>body thead.fixedHeader th {
	width: 200px
}
html>body thead.fixedHeader th + th {
	width: 240px
}

html>body thead.fixedHeader th + th + th {
	width: 316px
}
html>body tbody.scrollContent td {
	width: 200px
}

html>body tbody.scrollContent td + td {
	width: 240px
}

html>body tbody.scrollContent td + td + td {
	width: 300px
}
-->

table, td, th
{
border:1px solid #880000  ;
}
th
{
background-color:#880000  ;
color:white;
}

</style>

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

