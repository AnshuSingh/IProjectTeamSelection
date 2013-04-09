<%@ include file="/html/manual/init.jsp" %>
<%@ page import="com.asu.poly.teams.manualSelect.slayer.model.Team" %>
<%@ page import="com.asu.poly.teams.manualSelect.slayer.service.TeamLocalServiceUtil" %>
<h1>List of teams</h1>
<%
int count = TeamLocalServiceUtil.getTeamsCount();
List<Team> teams = TeamLocalServiceUtil.getTeams(0, count);
%>

<%
PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("jspPage", "/html/manual/list.jsp");

PortletURL deleteTeamURL = renderResponse.createActionURL();
deleteTeamURL.setParameter(ActionRequest.ACTION_NAME, "deleteTeam");
deleteTeamURL.setParameter("redirectURL", iteratorURL.toString());	

PortletURL editTeamURL = renderResponse.createRenderURL();	
editTeamURL.setParameter("jspPage", "/html/manual/update.jsp");
%>

<table border="1" width="90%" >
<tr>
<th align="center"> teamID </th>
<th align="center">Project Title</th>
<th align="center">Faculty1</th>
<th align="center">Faculty2</th>
<th align="center">Faculty3</th>
<th align="center">Faculty4</th>
<th align="center">Student 1</th>
<th align="center">Student 2</th>
<th align="center">Student 3</th>
<th align="center">Student 4</th>
<th align="center">Student 5</th>
<th align="center">Student 6</th>
<th align="center">Student 7</th>
<th align="center">Student 8</th>
<th align="center">Student 9</th>
<th align="center"> Date added </th>
<th align="center"> Delete </th>
<th align="center"> Edit </th>

</tr>

<%
for (Team team : teams) {
%>
<tr>
<td><%= team.getTeamID() %></td>
<td><%= team.getProjectTitle() %></td>
<td><%= team.getFaculty1() %></td>
<td><%= team.getFaculty2() %></td>
<td><%= team.getFaculty3() %></td>
<td><%= team.getFaculty4() %></td>
<td><%= team.getStudent0() %> </td>
<td><%= team.getStudent1() %> </td>
<td><%= team.getStudent2() %> </td>
<td><%= team.getStudent3() %> </td>
<td><%= team.getStudent4() %> </td>
<td><%= team.getStudent5() %> </td>
<td><%= team.getStudent6() %> </td>
<td><%= team.getStudent7() %> </td>
<td><%= team.getStudent8() %> </td>
<td><%= team.getDateAdded() %></td>
<% deleteTeamURL.setParameter("TeamID", String.valueOf(team.getTeamID())); %>
<td>
<a href="<%= deleteTeamURL.toString() %>">Delete &raquo;</a>
</td>
<% editTeamURL.setParameter("TeamID", String.valueOf(team.getTeamID())); %>
<td>
<a href="<%= editTeamURL.toString() %>">Edit &raquo;</a>
</td>



</tr>
<%
}
%>
</table> 
<br ><br><br>
 <a href="<portlet:renderURL/>">&laquo;Back</a>
