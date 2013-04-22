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

<form name="fm" method="POST" action="<%=
updatePreferencesURL.toString() %>">
<h1>Faculty Preferences</h1><br>
Select your preferences below:<br><br>
<p>
Preference 1: <select name="preference1" id ="preference1">
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
Preference 2: <select name="preference2" id ="preference2">
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
Preference 3: <select name="preference3" id ="preference3">
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
<input type="button" value="Submit" onclick= "return checkDropdowns();">


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
				}

				
			});

			console.log('initialization time: ', Date.now() - t);
		});
		function checkDropdowns(){
			var dropdowns =3;
			var x ;
			var y;
			var key = true;
			
			for(var i = 1; i < 3 && key != false; i++)
			{
					x = document.getElementById('preference'+ i).value;
					if(x== ""){
					alert("Pease enter preferences"+i);
					key= false;
					break;
				}
					
				for( var j = i+1; j <= 3 && key != false; j++)
				{
					
					y = document.getElementById('preference'+j).value;
						if(y == ""){
						alert("Pease enter preferences"+j);
						key= false;
						break;
					}
					if(x == y && i != j)
					{
						if(y!= ""){
							alert('Duplicates Found Please Change'+i+j);
						
						key = false;
						break;
						}
					}
				}
				if(key==false)
					break;
			}
			if(key ==true)
			document.fm.submit();
			return key;
						
		}
</script>	
		
	
	

