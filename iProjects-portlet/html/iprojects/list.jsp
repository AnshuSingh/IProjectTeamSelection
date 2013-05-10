<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="/html/iprojects/init.jsp" %>

<h1>List of projects</h1>
<%
int count = iProjectLocalServiceUtil.getiProjectsCount();
List<iProject> projects = iProjectLocalServiceUtil.getiProjects(0, count);

%>

<%
PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("jspPage", "/html/iprojects/list.jsp");

PortletURL deleteProjectURL = renderResponse.createActionURL();
deleteProjectURL.setParameter(ActionRequest.ACTION_NAME, "deleteProject");
deleteProjectURL.setParameter("redirectURL", iteratorURL.toString());	

PortletURL editProjectURL = renderResponse.createRenderURL();	
editProjectURL.setParameter("jspPage", "/html/iprojects/update.jsp");
%>


<liferay-ui:error key="Cant delete"
message="Can't delete once started" ></liferay-ui:error>


<table border="1" width="90%" >
<tr>
<th align="center" style="display:none"> Project id</th>
<th align="center">Project Title</th>
<th align="center">Sponsor</th>
<th align="center">Contact</th>
<th align="center">Department</th>
<th align="center">Required Skills</th>
<th align="center">Video Link</th>
<th align="center"> Status </th>
<th align="center"> Delete </th>
<th align="center"> Edit </th>
</tr>
<%
for (iProject project : projects) {
%>
<tr>
<td style="display:none"><%= project.getProjectID() %></td>
<td><%= project.getProjectTitle() %></td>
<td><%= project.getSponsor() %></td>
<td><%= project.getContact() %></td>
<td><%= project.getDepartments() %> </td>
<td><%= project.getRequiredSkills() %> </td>
<td><%= project.getLink() %></td>
<td><%= project.getStatus() %></td>
<% deleteProjectURL.setParameter("projectID", String.valueOf(project.getProjectID())); %>
<td>
<a href="<%= deleteProjectURL.toString() %>">
    <button>Delete</button>
</a>
</td>
<% editProjectURL.setParameter("projectID", String.valueOf(project.getProjectID())); %>
<td>
<a href="<%= editProjectURL.toString() %>">
    <button>Edit</button>
</a>
</td>

</tr>


<%
}
%>
</table>

<br/><a href="<portlet:renderURL/>">
    <button >Back</button>
</a>
 
