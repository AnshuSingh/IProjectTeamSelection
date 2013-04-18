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
<script type="text/javascript">
		AUI().use('aui-form-validator', function(A) {
			var t = Date.now();

			var validator2 = new A.FormValidator({
				boundingBox: document.fm,

				fieldContainer: 'p',
				// fieldContainer: null,

				validateOnBlur: true,
				validateOnInput: true,
				showMessages: true,
				showAllMessages: true,

				rules: {
					projectTitle: {
						required: true
					},
					sponsor: {
						required: true
					},
					projectrequiredskill: {
						required: true
					},
					contact: {
						required: true
					},
					phone: {
						required: true
					},
					email: {
						required: true
					},
					status: {
						required: true
					},
					
			},

			fieldStrings: {
					projectTitle: {
						required: 'projectTitle is a required feild'
					},
					sponsor: {
						required: 'Sponsor is required'
					},
					
					projectrequiredskill: {
						required: 'Projectrequiredskill is a required feild'
					},
					contact: {
						required: 'Contact is  a required feild'
					},
					phone: {
						required: 'Phone is a required feild'
					},
					email: {
						required: 'Email is a required feild'
					},
					status: {
						required: 'Status is a required feild'
					},
									
				}

				
			});

			console.log('initialization time: ', Date.now() - t);
		});
	</script>

			
<!-- <h3>File Upload:</h3>
<h3> Select a file to upload: </h3>
<form action="UploadServlet" method="post" enctype="multipart/form-data">
 <center>
   <table border="2">
	
	<tr>
	       <td align="center"><b>Multiple file Upload</td>
       	</tr>
	
	<tr>
		<td>
		       Specify file: <input name="file" type="file" id="file">
		<td>
	</tr>
	
	<tr>
		<td>
		     Specify file:<input name="file" type="file" id="file">
		</td>
        <tr>
		<td>
		      Specify file:<input name="file" type="file" id="file">
		</td>
	</tr>
	
	<tr>
		<td align="center">
			<input type="submit" value="Upload Files" />
		</td>
	</tr>
    </table>
	<center>
 </form>

<br/>
<br/>
<a href="<portlet:renderURL/>">&laquo;Back</a>


