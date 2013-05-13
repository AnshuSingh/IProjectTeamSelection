<%@ include file="/html/assignfaculty/init.jsp" %>

<h1>Create Teams</h1>
<%
PortletURL listteamsURL = renderResponse.createRenderURL();
listteamsURL.setParameter("jspPage", "/html/assignfaculty/list.jsp");
%>


<%
PortletURL updateTeamsURL = renderResponse.createRenderURL();
updateTeamsURL.setParameter("jspPage", "/html/assignfaculty/update.jsp");
%>
<br><br>
<a href="<%= updateTeamsURL.toString() %>">Assign Project and Faculty Mentors &raquo;</a><br><br>
<a href="<%= listteamsURL.toString() %>">Show all Teams &raquo;</a><br>


