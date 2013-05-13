<%@ include file="/html/assignfaculty/init.jsp" %>

<h1>List of teams</h1>
<%
int count = TeamLocalServiceUtil.getTeamsCount();
List<Team> teams = TeamLocalServiceUtil.getTeams(0, count);
%>

<%
PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("jspPage", "/html/assignfaculty/list.jsp");

PortletURL deleteTeamURL = renderResponse.createActionURL();
deleteTeamURL.setParameter(ActionRequest.ACTION_NAME, "deleteTeam");
deleteTeamURL.setParameter("redirectURL", iteratorURL.toString());	

PortletURL editTeamURL = renderResponse.createRenderURL();	
editTeamURL.setParameter("jspPage", "/html/assignfaculty/update.jsp");
%>

<table id="table" width="100%" border=1 cellpadding="0" cellspacing="0" class="scrollTable"> 
<thead class="fixedHeader">
<tr>
<th align="center"> teamID </th>
<th align="center">Project Title</th>
<th align="center">Faculty</th>
<th align="center"> Date added </th>
<th align="center"> Delete </th>
<th align="center"> Edit </th>
</tr>
</thead>
<tbody class="scrollContent">
<%
for (Team team : teams) {
	String csvFaculty="";
	csvFaculty = team.getFaculty1();
	String []parts=null;
	parts= csvFaculty.split(",");
%>
<tr>
<td><%= team.getTeamID() %></td>
<td><%= team.getProjectTitle() %></td>
<td><%= team.getFaculty1() %></td>
<% for (String part: parts){ %>
<td><%= part %> </td>
<% } %>
<td><%= team.getDateAdded() %></td>
<% deleteTeamURL.setParameter("teamID", String.valueOf(team.getTeamID())); %>
<td>
<a href="<%= deleteTeamURL.toString() %>">Delete &raquo;</a>
</td>
<% editTeamURL.setParameter("teamID", String.valueOf(team.getTeamID())); %>
<td>
<a href="<%= editTeamURL.toString() %>">Edit &raquo;</a>
</td>
</tr>
<%
}
%>
	</tbody>
</table> 
<br /><br ><br >
<br></br>
 <a href="<portlet:renderURL/>">&laquo;Back</a>
 

