<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>

<portlet:defineObjects />

This is the <b>Create User Portlet</b> portlet in Edit mode.
	
<%

PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("jspPage", "/html/createuser/view.jsp");

PortletURL createUserURL = renderResponse.createActionURL();
createUserURL.setParameter(ActionRequest.ACTION_NAME, "createUser");
createUserURL.setParameter("redirectURL", iteratorURL.toString());	

PortletURL editProjectURL = renderResponse.createRenderURL();	
editProjectURL.setParameter("jspPage", "/html/createuser/view.jsp");

%>
<aui:form name="userForms " action="<%=createUserURL.toString() %>" method="post" >
<p> * All fields are necessary</p>
    <aui:layout>         
         <aui:fieldset>
           <aui:column>
          	<aui:input type="text" name="email" label="ASU email " />
          	<aui:input type="password" name="pwd" label="Password " />
            <aui:input name="asuriteId" label="ASURITE User ID" type="text"></aui:input>            
           	<aui:input type="text" name="firstName" label="First Name " />
            <aui:input type="text" name="LastName" label="Last Name " />                
            <aui:select name="major" label="Major">
                <aui:option value=""> </aui:option>
                <aui:option value="CS"> Computer Science</aui:option>
                <aui:option value="EE"> Electronics </aui:option>
                <aui:option value="ME"> Mechanical Engineering</aui:option> 
                </aui:select>
            <aui:select name="level" label="Program">
                <aui:option value=""> </aui:option>
                <aui:option value="undergraduate"> Undergraduate</aui:option>
                <aui:option value="graduate"> Graduate </aui:option>
                </aui:select>
            <aui:input type="text" name="cgpa" label="CGPA"></aui:input>
            <aui:input type="text" name="phoneNo" label="Phone No" />
            <aui:select name="sex" label="Sex">
                <aui:option value=""> </aui:option>
                <aui:option value="female"> Female</aui:option>
                <aui:option value="male"> Male </aui:option>
                </aui:select>
             <aui:select name="role" label="Role ">
            	<aui:option value=""> </aui:option>
                <aui:option value="student"> Student</aui:option>
                <aui:option value="faculty"> Faculty </aui:option>
                <aui:option value="sponsor"> Sponsor</aui:option> 
                </aui:select>
                <aui:button type="submit" value="Save"  />
           </aui:column>
            </aui:fieldset>  
    </aui:layout>
</aui:form>

