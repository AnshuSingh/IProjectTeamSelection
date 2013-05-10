<%@ include file="/html/iprojects/init.jsp" %>

<%
PortletURL redirectURL = renderResponse.createRenderURL();	
redirectURL.setParameter("jspPage", "/html/iprojects/reqskill.jsp");

iProject project = new iProjectImpl();
long prjId = ParamUtil.getLong(request, "projectID");
if (prjId > 0L) {
project = iProjectLocalServiceUtil.getiProject(prjId);
System.out.println(ParamUtil.getLong(request, "projectID"));
}
DropDownParser dp = new DropDownParser();
HashMap<String, ArrayList<DropOption>> allDropDowns =  dp.Parse("C:/DropDown.xml");
%>
<script type="text/javascript" language="javascript">
 document.redirect.submit();
</script>
<liferay-ui:error key="projectTitle-required"
message="Project title is required." ></liferay-ui:error> 

<!-- perform a sendRedirect to the above resource -->
<form name="redirect" action="<%= redirectURL.toString() %>" method="post">
<aui:input type="hidden" name="" value="<%= renderResponse.createRenderURL().toString() %>"/>
<aui:input type="hidden" name="projectId" value="<%= String.valueOf(project.getProjectID()) %>"/>
<aui:input type="text" size="103" name="projectTitle" label="Project Title" value="<%= project.getProjectTitle() %>" />
<aui:input type="textarea" rows="10" cols="100" name="projectdescription" label="Project Description" value="<%= project.getProjectdescription() %>"/>
<aui:input type="text" size="103" name="sponsor" label="Sponsors " value="<%= project.getSponsor() %>"/>
<aui:select name="department" multiple="true">
<% for (String key : allDropDowns.keySet()) {
%>
    <aui:option value="<%= key %>"> <%= key %></aui:option>
 <% } %> 
</aui:select>

<aui:input type="text" size="103" name="contact" label="Contact " value="<%= project.getContact() %>"/>

<aui:select name="status" label="Status" value="<%= project.getStatus() %>" >	
<aui:option value="Not Started">Not Started</aui:option>
<aui:option value="In Progress">In Progress</aui:option>
<aui:option value="Finished">Finished</aui:option>
<aui:option value="Scrapped">Scrapped</aui:option>
</aui:select>
 
<aui:input type="text" name="link" label="Video Link (optional)" value="<%= project.getLink() %>" />

<aui:button type="submit" value="Next"/>
</form>

<br/>
<br/>
<a href="<portlet:renderURL/>">&laquo;Back</a>