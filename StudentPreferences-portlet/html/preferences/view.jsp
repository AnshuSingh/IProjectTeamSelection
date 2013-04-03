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
<aui:fieldset>
Select your preferences below:<br><br>
<p>
</p>
Preference 1:

<aui:select  name="preference1"  >
<aui:option value= "-1">
<liferay-ui:message key = "please choose"/>
</aui:option>

<%
for (Projectdetail project : projects) {
%>
<aui:option value = "<%= project.getProjectID() %>" > 
    <%= project.getProjectTitle() %>             
</aui:option>
<%
}
%>
</aui:select>
</p>
<p>
Preference 2: <aui:select name="preference2">
<aui:option></aui:option>
<%
for (Projectdetail project : projects) {
%>
<aui:option> <%= project.getProjectTitle() %></aui:option>
<%
}
%>
</aui:select>
</p>
<p>
Preference 3: <aui:select name="preference3">
<aui:option></aui:option>
<%
for (Projectdetail project : projects) {
%>
<aui:option> <%= project.getProjectTitle() %></aui:option>
<%
}
%>
</aui:select>
</p>
<p>
Preference 4: <aui:select name="preference4" >
<aui:option></aui:option>
<%
for (Projectdetail project : projects) {
%>
<aui:option> <%= project.getProjectTitle() %></aui:option>
<%
}
%>
</aui:select>
</p>
<p>
Preference 5: <aui:select name="preference5" >
<aui:option></aui:option>
<%
for (Projectdetail project : projects) {
%>
<aui:option> <%= project.getProjectTitle() %></aui:option>
<%
}
%>
</aui:select>

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
</aui:fieldset>
<input type="submit" value="Submit">


</aui:form>


<portlet:renderURL var = "viewsubmitURL">
<portlet:param name= "jspPage" value ="/view.jsp"/>
</portlet:renderURL>

<p><a href="<%=viewsubmitURL %>" >Back</a>


<aui:script use="aui-form-validator, aui-overlay-context-panel">

var validator = new A.FormValidator({
boundingBox: document.<portlet:namespace/>fm,

rules: {
<portlet:namespace/>preference1: {
required: true
},
<portlet:namespace/>preference2: {
required: true
},
<portlet:namespace/>preference3: {
required: true
},
<portlet:namespace/>preference4: {
required: true
},
<portlet:namespace/>preference5: {
required: true
}
},

fieldStrings: {
<portlet:namespace/>preference1: {
required: '<liferay-ui:message key="required-selected-project" />'
},
<portlet:namespace/>preference2: {
required: '<liferay-ui:message key="required-selected-project" />'
},
<portlet:namespace/>preference3: {
required: '<liferay-ui:message key="required-selected-project" />'
},
<portlet:namespace/>preference4: {
required: '<liferay-ui:message key="required-selected-project" />'
},
<portlet:namespace/>preference5: {
required: '<liferay-ui:message key="required-selected-project" />'
}
}
})
</aui:script>

