<%@ include file="/html/iprojects/init.jsp" %>
<%
PortletURL listprojectsURL = renderResponse.createRenderURL();
listprojectsURL.setParameter("jspPage", "/html/iprojects/list.jsp");
%>
<portlet:renderURL var="updateprojectURL">

<portlet:param name="jspPage" value="/html/iprojects/update.jsp"/>
</portlet:renderURL>
<br/>
<br/><a href="<%= updateprojectURL %>">
    <button class="linkBtn" style="background-color:#990033" >Add Project</button>
</a>
<br/>
<br/>
<a href="<%= listprojectsURL.toString() %>">
	<button class="linkBtn" style="background-color:#990033">List Projects</button> 
</a>

