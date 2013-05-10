<%@ include file="/html/iprojectinformation/init.jsp" %>
<h1>iProjects </h1>
<script type="text/javascript" language="javascript">
	document.redirect.submit();
</script>
<%
PortletURL listprojectsURL = renderResponse.createRenderURL();
listprojectsURL.setParameter("jspPage", "/html/iprojectinformation/showProject.jsp");
int count = iProjectLocalServiceUtil.getiProjectsCount();
List<iProject> projects = iProjectLocalServiceUtil.getiProjects(0, count);
%>
<form name="redirect" action="<%= listprojectsURL.toString() %>" method="post">
<%
for (iProject prj : projects) {
%><strong>
<input type="hidden" name="title" value="<%= prj.getProjectTitle() %>" />
<input type="submit" value="Submit" /><%out.println(prj.getProjectTitle());%>
<a href ="<%=listprojectsURL.toString() %>"><%out.println(prj.getProjectTitle());%></a><br><br>
<%
}
%>
</form>


