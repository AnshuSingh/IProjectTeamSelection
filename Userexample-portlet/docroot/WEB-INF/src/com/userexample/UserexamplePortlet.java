package com.userexample;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
 
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.userexample.model.Employee;
import com.userexample.model.impl.EmployeeImpl;
import com.userexample.service.EmployeeLocalServiceUtil;
/**
 * Portlet implementation class UserexamplePortlet
 */
@Controller
public class UserexamplePortlet  {
 
	@RenderMapping
    public String createEmployee(RenderRequest request,RenderResponse response) {  
        return "createUser";   
    }
     
    @RenderMapping(params = "redirectPage=welcome")
    public String registration(RenderRequest request,RenderResponse response) {
        return "welcome";
    }
     
    @ActionMapping(params = "action=createUser")
    public void createEmployee(ActionRequest request,ActionResponse response)throws SystemException
    {
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        Employee employee = new EmployeeImpl();
        employee.setCompanyId(themeDisplay.getCompanyId());    
        employee.setUserId(themeDisplay.getUserId());
        employee.setFirstName(request.getParameter("firstName"));
        employee.setLastName(request.getParameter("LastName"));
        employee.setEMail(request.getParameter("email"));
        employee.setPhoneNo(request.getParameter("phoneNo"));
        employee.setMajor(request.getParameter("major"));
        employee.setCgpa(request.getParameter("cgpa"));
                         
        EmployeeLocalServiceUtil.addEmployee(employee);
        response.setRenderParameter("redirectPage", "welcome");
        request.setAttribute("EmployeeName",request.getParameter("firstName")+" "+request.getParameter("LastName")); 
        
    	    	     
}
}
