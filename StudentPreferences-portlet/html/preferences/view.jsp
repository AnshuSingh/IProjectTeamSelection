<%@ include file="/html/preferences/init.jsp" %>

<%
PortletURL listPreferencesURL = renderResponse.createRenderURL();
listPreferencesURL.setParameter("jspPage", "/html/preferences/view.jsp");
%>

<%
PortletURL updatePreferencesURL = renderResponse.createActionURL();
updatePreferencesURL.setParameter(
ActionRequest.ACTION_NAME, "updatePreferences");
%>


<%
int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0,
count);
%>

<form name="fm" method="POST" action="<%=updatePreferencesURL.toString() %>">
<h1>Student Preferences</h1><br>
Select your preferences below:<br><br>
<p>
Preference 1: <select name="preference1">
<option></option>
<%
for (Projectdetail project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>
<p>
Preference 2: <select name="preference2">
<option></option>
<%
for (Projectdetail project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>
<p>
Preference 3: <select name="preference3">
<option></option>
<%
for (Projectdetail project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>
<p>
Preference 3: <select name="preference4">
<option></option>
<%
for (Projectdetail project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>
<p>
Preference 3: <select name="preference5">
<option></option>
<%
for (Projectdetail project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>

<br ><br >
<input type="submit" value="Submit">


</form>
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
					preference1: {
						required: true
					},
					
					preference2: {
						required: true
					},
					preference3: {
						required: true
					},
					preference4: {
						required: true
					},
					preference5: {
						required: true
					}
				},

				fieldStrings: {
					preference1: {
						required: 'Preference is required'
					},
					preference2: {
						required: 'Preference is required'
					},
					
					preference3: {
						required: 'Preference is required'
					},
					
					preference4: {
						required: 'Preference is required'
					},
					
					preference5: {
						required: 'Preference is required'
					},
					
					
				}

				
			});

			console.log('initialization time: ', Date.now() - t);
		});
	</script>


