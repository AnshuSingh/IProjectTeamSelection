<%@ include file="/html/student/init.jsp" %>

<%

PortletURL showAvailURL = renderResponse.createRenderURL();
showAvailURL.setParameter(ActionRequest.ACTION_NAME, "submitForms"); 

int count = iProjectLocalServiceUtil.getiProjectsCount();
List<iProject> projects = iProjectLocalServiceUtil.getiProjects(0, count);
String pref1 = request.getParameter("preference1");
String pref2 = request.getParameter("preference2");
String pref3 = request.getParameter("preference3");
String pref4 = request.getParameter("preference4");
String pref5 = request.getParameter("preference5");
ArrayList<String> reqSkills = new ArrayList<String>();
String csvSkills="";String[] parts;
for (iProject prj : projects) {
	if (prj.getProjectTitle().equals(pref1)){
		csvSkills = prj.getRequiredSkills();
		parts=null;
		parts= csvSkills.split(",");
		for (String part: parts){
			if (!reqSkills.contains(part))
				reqSkills.add(part);
		}
	}
	if (prj.getProjectTitle().equals(pref2)){
		csvSkills = prj.getRequiredSkills();
		parts=null;
		parts = csvSkills.split(",");
		for (String part: parts){
			if (!reqSkills.contains(part))
				reqSkills.add(part);
		}
	}
	if (prj.getProjectTitle().equals(pref3)){
		csvSkills = prj.getRequiredSkills();
		parts=null;
		parts = csvSkills.split(",");
		for (String part: parts){
			if (!reqSkills.contains(part))
				reqSkills.add(part);
		}
	}
	if (prj.getProjectTitle().equals(pref4)){
		csvSkills = prj.getRequiredSkills();
		parts=null;
		parts = csvSkills.split(",");
		for (String part: parts){
			if (!reqSkills.contains(part))
				reqSkills.add(part);
		}
	}
	if (prj.getProjectTitle().equals(pref5)){
		csvSkills = prj.getRequiredSkills();
		parts=null;
		parts = csvSkills.split(",");
		for (String part: parts){
			if (!reqSkills.contains(part))
				reqSkills.add(part);
		}
	}
}
%>

<form name="redirect" method="POST" action="<%=showAvailURL.toString() %>">
<%
for (String skills : reqSkills) {
%>
<aui:field-wrapper inlineField="true" name="<%= skills %>" label="<%= skills %>">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="<%= skills %>" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />
<%
}
%>

<input type="hidden" name="preference1" value="<%=pref1%>">
<input type="hidden" name="preference2" value="<%=pref2%>">
<input type="hidden" name="preference3" value="<%=pref3%>">
<input type="hidden" name="preference4" value="<%=pref4%>">
<input type="hidden" name="preference5" value="<%=pref5%>">

<input type="hidden" name="mon8to9" value="<%=request.getParameter("mon8to9")%>">
<input type="hidden" name="mon9to10" value="<%=request.getParameter("mon9to10")%>">
<input type="hidden" name="mon10to11" value="<%=request.getParameter("mon10to11")%>">
<input type="hidden" name="mon11to12" value="<%=request.getParameter("mon11to12")%>">
<input type="hidden" name="mon12to1" value="<%=request.getParameter("mon12to1")%>">
<input type="hidden" name="mon1to2" value="<%=request.getParameter("mon1to2")%>">
<input type="hidden" name="mon2to3" value="<%=request.getParameter("mon2to3")%>">
<input type="hidden" name="mon3to4" value="<%=request.getParameter("mon3to4")%>">
<input type="hidden" name="mon4to5" value="<%=request.getParameter("mon4to5")%>">

<input type="hidden" name="tue8to9" value="<%=request.getParameter("tue8to9")%>">
<input type="hidden" name="tue9to10" value="<%=request.getParameter("tue9to10")%>">
<input type="hidden" name="tue10to11" value="<%=request.getParameter("tue10to11")%>">
<input type="hidden" name="tue11to12" value="<%=request.getParameter("tue11to12")%>">
<input type="hidden" name="tue12to1" value="<%=request.getParameter("tue12to1")%>">
<input type="hidden" name="tue1to2" value="<%=request.getParameter("tue1to2")%>">
<input type="hidden" name="tue2to3" value="<%=request.getParameter("tue2to3")%>">
<input type="hidden" name="tue3to4" value="<%=request.getParameter("tue3to4")%>">
<input type="hidden" name="tue4to5" value="<%=request.getParameter("tue4to5")%>">

<input type="hidden" name="wed8to9" value="<%=request.getParameter("wed8to9")%>">
<input type="hidden" name="wed9to10" value="<%=request.getParameter("wed9to10")%>">
<input type="hidden" name="wed10to11" value="<%=request.getParameter("wed10to11")%>">
<input type="hidden" name="wed11to12" value="<%=request.getParameter("wed11to12")%>">
<input type="hidden" name="wed12to1" value="<%=request.getParameter("wed12to1")%>">
<input type="hidden" name="wed1to2" value="<%=request.getParameter("wed1to2")%>">
<input type="hidden" name="wed2to3" value="<%=request.getParameter("wed2to3")%>">
<input type="hidden" name="wed3to4" value="<%=request.getParameter("wed3to4")%>">
<input type="hidden" name="wed4to5" value="<%=request.getParameter("wed4to5")%>">

<input type="hidden" name="thu8to9" value="<%=request.getParameter("thu8to9")%>">
<input type="hidden" name="thu9to10" value="<%=request.getParameter("thu9to10")%>">
<input type="hidden" name="thu10to11" value="<%=request.getParameter("thu10to11")%>">
<input type="hidden" name="thu11to12" value="<%=request.getParameter("thu11to12")%>">
<input type="hidden" name="thu12to1" value="<%=request.getParameter("thu12to1")%>">
<input type="hidden" name="thu1to2" value="<%=request.getParameter("thu1to2")%>">
<input type="hidden" name="thu2to3" value="<%=request.getParameter("thu2to3")%>">
<input type="hidden" name="thu3to4" value="<%=request.getParameter("thu3to4")%>">
<input type="hidden" name="thu4to5" value="<%=request.getParameter("thu4to5")%>">

<input type="hidden" name="fri8to9" value="<%=request.getParameter("fri8to9")%>">
<input type="hidden" name="fri9to10" value="<%=request.getParameter("fri9to10")%>">
<input type="hidden" name="fri10to11" value="<%=request.getParameter("fri10to11")%>">
<input type="hidden" name="fri11to12" value="<%=request.getParameter("fri11to12")%>">
<input type="hidden" name="fri12to1" value="<%=request.getParameter("fri12to1")%>">
<input type="hidden" name="fri1to2" value="<%=request.getParameter("fri1to2")%>">
<input type="hidden" name="fri2to3" value="<%=request.getParameter("fri2to3")%>">
<input type="hidden" name="fri3to4" value="<%=request.getParameter("fri3to4")%>">
<input type="hidden" name="fri4to5" value="<%=request.getParameter("fri4to5")%>">

<input type="hidden" name="sat8to9" value="<%=request.getParameter("sat8to9")%>">
<input type="hidden" name="sat9to10" value="<%=request.getParameter("sat9to10")%>">
<input type="hidden" name="sat10to11" value="<%=request.getParameter("sat10to11")%>">
<input type="hidden" name="sat11to12" value="<%=request.getParameter("sat11to12")%>">
<input type="hidden" name="sat12to1" value="<%=request.getParameter("sat12to1")%>">
<input type="hidden" name="sat1to2" value="<%=request.getParameter("sat1to2")%>">
<input type="hidden" name="sat2to3" value="<%=request.getParameter("sat2to3")%>">
<input type="hidden" name="sat3to4" value="<%=request.getParameter("sat3to4")%>">
<input type="hidden" name="sat4to5" value="<%=request.getParameter("sat4to5")%>">

<input type="hidden" name="sun8to9" value="<%=request.getParameter("sun8to9")%>">
<input type="hidden" name="sun9to10" value="<%=request.getParameter("sun9to10")%>">
<input type="hidden" name="sun10to11" value="<%=request.getParameter("sun10to11")%>">
<input type="hidden" name="sun11to12" value="<%=request.getParameter("sun11to12")%>">
<input type="hidden" name="sun12to1" value="<%=request.getParameter("sun12to1")%>">
<input type="hidden" name="sun1to2" value="<%=request.getParameter("sun1to2")%>">
<input type="hidden" name="sun2to3" value="<%=request.getParameter("sun2to3")%>">
<input type="hidden" name="sun3to4" value="<%=request.getParameter("sun3to4")%>">
<input type="hidden" name="sun4to5" value="<%=request.getParameter("sun4to5")%>">


<input type="submit" value="Next" />





</form>
