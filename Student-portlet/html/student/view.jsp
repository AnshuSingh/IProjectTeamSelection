<%@ include file="/html/student/init.jsp" %>

<%
PortletURL showSkillsURL = renderResponse.createRenderURL();
showSkillsURL.setParameter("jspPage", "/html/student/availabilityForm.jsp");
%>


<script type="text/javascript" language="javascript">
 document.redirect.submit();
</script>

<%
int count = iProjectLocalServiceUtil.getiProjectsCount();
List<iProject> projects = iProjectLocalServiceUtil.getiProjects(0, count);
%>

<form name="redirect" method="POST" action="<%=showSkillsURL.toString() %>">
<h1>Student Preferences</h1><br>
Select your preferences below:<br><br>
<p>
Preference 1: <select name="preference1">
<option></option>
<%
for (iProject project : projects) {
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
for (iProject project : projects) {
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
for (iProject project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>
<p>
Preference 4: <select name="preference4">
<option></option>
<%
for (iProject project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>
<p>
Preference 5: <select name="preference5">
<option></option>
<%
for (iProject project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>
<br><br>


<br ><br >
<h4>Reasons for choosing the above projects:</h4> <br>


<textarea name="reasons" rows="5" cols="60"></textarea>


<p>
<br ><br >
<input type="submit" value="Next">


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
				}
		}
		
		
		});
		
		console.log('initialization time: ', Date.now() - t);
		});
</script>