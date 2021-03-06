<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
<portlet:actionURL var="createUserURL">
    <portlet:param name="action" value="createUser" />
</portlet:actionURL>
<aui:form action="<%=createUserURL %>" method="post" name="createEmp">
<p> * All fields are necessary</p>
    <aui:layout>         
         <aui:fieldset>
           <aui:column>
            <aui:input type="text" name="firstName" label="First Name " />
                        <aui:input type="text" name="LastName" label="Last Name " />
                <aui:input type="text" name="email" label="ASU email " />
                <aui:input type="password" name="pwd" label="Password " />
                <aui:select name="major" label="Major">
                <aui:option value=""> </aui:option>
                <aui:option value="CS"> Computer Science</aui:option>
                <aui:option value="EE"> Electronics </aui:option>
                <aui:option value="ME"> Mechanical Engineering</aui:option> 
                </aui:select>
                <aui:input type="text" name="cgpa" label="CGPA"></aui:input>
            <aui:input type="text" name="phoneNo" label="Phone No" />
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