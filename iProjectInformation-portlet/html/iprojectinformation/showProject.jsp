<%@ include file="/html/iprojectinformation/init.jsp" %>

<%
int count = iProjectLocalServiceUtil.getiProjectsCount();
List<iProject> projects = iProjectLocalServiceUtil.getiProjects(0, count);
String title = request.getParameter("title");
System.out.println(title);
%>
<h1><% out.println(title); %></h1>
<%
for (iProject prj : projects) {
	if (prj.getProjectTitle().equals(title)){

%>
<table width="100%" >
<tr><td width="10%">Sponsor: <br ><br ></td><td><%= prj.getSponsor() %> <br ><br ></td></tr>
<tr><td width="10%">Description: </td><td><%= prj.getProjectdescription() %> </td></tr>
<tr><td width="10%">Required Skillset: </td><td> <%= prj.getRequiredSkills() %> </td></tr>
</table>
<strong>Video Links:</strong>
<br />
 <embed
width="420" height="345"
src="<%= prj.getLink() %>"
type="application/x-shockwave-flash">
</embed>

<%
break;
	}
}
%>
