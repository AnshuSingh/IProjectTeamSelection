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
<input type="submit" value="Submit" /><&nbsp><&nbsp><%out.println(prj.getProjectTitle());%>

<select name="title" label="iProjects">
	<option value="<%= prj.getProjectTitle() %>" ><%out.println(prj.getProjectTitle());%></option>

<input type="submit" value="Submit" />

              
</select>

<%
}
%>
</form>


