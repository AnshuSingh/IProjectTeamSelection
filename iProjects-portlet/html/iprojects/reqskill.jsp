<%@ include file="/html/iprojects/init.jsp" %>

<%DropDownParser dp = new DropDownParser();
HashMap<String, ArrayList<DropOption>> allDropDowns =  dp.Parse("C:/DropDown.xml");

PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/iprojects/update.jsp");
 
PortletURL updateprojectURL = renderResponse.createActionURL();
updateprojectURL.setParameter(ActionRequest.ACTION_NAME, "updateproject");
String dept = request.getParameter("department");
%>
<aui:form name="fm" method="POST" action="<%= updateprojectURL.toString() %>">

<br/>
Required Skillsets:<br/>
 <% for (String key : allDropDowns.keySet()) {
    ArrayList<DropOption> value = allDropDowns.get(key);
    
    if (dept.contains(key)){%>   
    <aui:select name="<%= key %>"  multiple="true">
<%    for (DropOption opt : value){ %>
    	<aui:option value="<%= opt.getKey() %>"> <%= opt.getValue() %></aui:option>
<% } %>   	
    </aui:select>
<% } }%>
<input type="hidden" name="projectTitle" value="<%=request.getParameter("projectTitle")%>">
<input type="hidden" name="projectdescription" value="<%=request.getParameter("projectdescription")%>">
<input type="hidden" name="sponsor" value="<%=request.getParameter("sponsor")%>">
<input type="hidden" name="contact" value="<%=request.getParameter("contact")%>">
<input type="hidden" name="status" value="<%=request.getParameter("status")%>">
<input type="hidden" name="department" value="<%=request.getParameter("department")%>">
<input type="hidden" name="link" value="<%=request.getParameter("link")%>">


<a href="<%= updateprojectURL.toString() %>">
    <button>Save</button>
</a>
</aui:form>

<a href="<%= backURL.toString() %>">&laquo;Back</a>
  