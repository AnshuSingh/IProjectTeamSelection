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

<aui:form name="<portlet:namespace/>fm"  id ="fm" method="POST" action="<%=
updatePreferencesURL.toString() %>">
<h1>Student Preferences</h1><br>
Select your preferences below:<br><br>
<p>
Preference 1:
<aui:fieldset>
<aui:select name="preference1"  label ="preference1">

<aui:option>Select a project</aui:option>

<%
for (Projectdetail project : projects) {
%>

<aui:option> <%= project.getProjectTitle() %></aui:option>

<%
}
%>

</aui:select>
</aui:fieldset>

</p>
<p>
Preference 2: <select name="preference2" label ="preference2">
<option>Select a project</option>
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
Preference 3: <select name="preference3" label ="preference3">
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
Preference 4: <select name="preference4" label ="preference4">
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
Preference 5: <select name="preference5" label ="preference5">
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
<br><br>
<h4>Enter your focus areas:</h4> <br>

<textarea name="focusarea" rows="3" cols="60"></textarea>

<p>
<br ><br >
<h4>Reasons for choosing the above projects:</h4> <br>

<textarea name="reasons" rows="5" cols="60"></textarea>

<p>
<br ><br >
<input type="submit" value="Submit">


</aui:form>

<aui:script use="aui-form-validator, aui-overlay-context-panel">

var validator = new A.FormValidator({
boundingBox: document.<portlet:namespace/>fm,

rules: {
<portlet:namespace/>preference1: {
required: true
},
rules: {
<portlet:namespace/>preference2: {
required: true
},

rules: {
<portlet:namespace/>preference3: {
required: true
},

rules: {
<portlet:namespace/>preference4: {
required: true
},

rules: {
<portlet:namespace/>preference5: {
required: true
},

fieldStrings: {
<portlet:namespace/>preference1: {
required: '<liferay-ui:message key="required-selected-project" />'
},
'<portlet:namespace/>preference2': {
required: '<liferay-ui:message key="required-selected-project" />'
}
}
})
</aui:script>

