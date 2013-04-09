<%@ include file="/html/addproject/init.jsp" %>

<%
/*PortletURL updateprojectURL = renderResponse.createActionURL();
updateprojectURL.setParameter(ActionRequest.ACTION_NAME, "updateproject");*/

PortletURL saveURL = renderResponse.createActionURL();
saveURL.setParameter(ActionRequest.ACTION_NAME, "saveproject");

Projectdetail project = new ProjectdetailImpl();
long prjId = ParamUtil.getLong(request, "projectID");
if (prjId > 0L) {
project = ProjectdetailLocalServiceUtil.getProjectdetail(prjId);
System.out.println(ParamUtil.getLong(request, "projectID"));
}
String uploadProgressId = PwdGenerator.getPassword(PwdGenerator.KEY3, 4);
PortletPreferences prefs = renderRequest.getPreferences();
%>

<portlet:actionURL var="updateprojectURL" name="updateproject">
    <portlet:param name="jspPage" value="/update.jsp" />
</portlet:actionURL>

<liferay-ui:error key="projectTitle-required"
message="Project title is required." ></liferay-ui:error>

<aui:form name="fm" method="POST" action="<%= updateprojectURL.toString() %>" enctype="multipart/form-data">

<aui:input type="hidden" name="redirectURL" value="<%= renderResponse.createRenderURL().toString() %>"/>
<aui:input type="hidden" name="projectId" value="<%= String.valueOf(project.getProjectID()) %>"/>
<aui:input type="text" size="103" name="projectTitle" label="Project Title" value="<%= project.getProjectTitle() %>" />
<br/>
<!--aui:input type="textarea" rows="10" cols="100" name="projectdescription" label="Project Description" value="<%= project.getProjectdescription() %>"/>-->
<br/>
<aui:input type="text" size="103" name="sponsor" label="Sponsor" value="<%= project.getSponsor() %>"/>
<br/>
<aui:input type="textarea" rows="4" cols="100" name="projectrequiredskill" label="Required Skillset" value="<%= project.getProjectrequiredskill() %>" />
<br/>
<aui:input type="text" size="103" name="contact" label="Contact" value="<%= project.getContact() %>"/>
<br/>
<aui:input type="text" size="20" name="phone" label="Phone Number" value="<%= project.getPhonenumber() %>"  />
<br/>
<aui:input type="text"  size="75" name="email" label="Email"  value="<%= project.getEmail() %>"/>
<br/>
<aui:select name="status" label="Status" value="<%= project.getStatus() %>" >		
<aui:option value="Not Started">Not Started</aui:option>
<aui:option value="In Progress">In Progress</aui:option>
<aui:option value="Finished">Finished</aui:option>
<aui:option value="Scrapped">Scrapped</aui:option>
	</aui:select>
<br/>
<br/>

<aui:input type="text" name="link" label="Video Link (optional)" value="<%= project.getLink() %>" />
<br/>

<!--need to add this for required skillsets
<aui:input type="checkbox" name="CS" label="CS" />

<br/><a href="<%= requiredskillsetURL %>">Next &raquo;</a>
<br/>
<br/>
<br/>

<aui:input align="right" name="" type="submit" value="Save"/>

<!--aui:button type="submit" value="Save"/-->
</aui:form>


<!-- <h3>File Upload:</h3>
<h3> Select a file to upload: </h3>
<br />
<form action="UploadServlet" method="post" enctype="multipart/form-data">
<input type="file" name="file" size="50" />
<br />
<input type="submit" value="Upload File" />
</form> -->


<br/>
<br/>
<a href="<portlet:renderURL/>">&laquo;Back</a>
