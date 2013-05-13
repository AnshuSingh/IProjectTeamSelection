package com.NewSubscriber;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;


import com.NewSubscriber.model.useraccount;
import com.NewSubscriber.model.impl.useraccountImpl;
import com.NewSubscriber.service.useraccountLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class NewSubscriberPortlet
 */
public class NewSubscriberPortlet extends MVCPortlet {
	
	public void createUser(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long companyId = themeDisplay.getCompanyId();
		String emailaddress = ParamUtil.getString(actionRequest, "email");
		String password = ParamUtil.getString(actionRequest, "pwd");
		 String asuriteid = ParamUtil.getString(actionRequest, "asuriteId");
		 String firstname = ParamUtil.getString(actionRequest, "firstName");
		 String lastname = ParamUtil.getString(actionRequest, "LastName");		 
		 String major = ParamUtil.getString(actionRequest, "major");
		 String level = ParamUtil.getString(actionRequest, "level");
		 String cgpa = ParamUtil.getString(actionRequest, "cgpa");
		 String phoneno = ParamUtil.getString(actionRequest, "phoneNo");
		 String sex = ParamUtil.getString(actionRequest, "sex");
		 String role = ParamUtil.getString(actionRequest, "role");
		
		 
		 System.out.println("Your inputs ==> " +
				 firstname + ", " + lastname + "," + major+ "," +
				 level);
		 
		  useraccount useraccount = new useraccountImpl(); // set primary key
		  long useraccountID = 0L; try {
			useraccountID =
			  CounterLocalServiceUtil.increment( this.getClass().getName());
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  useraccount.setCompanyId(companyId);
		  useraccount.setUseraccountId(useraccountID);
		  useraccount.setEMail(emailaddress);
		  useraccount.setPassword(password);
		  useraccount.setAsuriteId(asuriteid);
		  useraccount.setFirstName(firstname);
		  useraccount.setLastName(lastname);
		  useraccount.setMajor(major);
		  useraccount.setLevel(level);
		  useraccount.setCgpa(cgpa);
		  useraccount.setPhoneNo(phoneno);
		  useraccount.setSex(sex);
		  useraccount.setRole(role);
		  useraccount.setDateAdded(new Date());
		  useraccount.setUserapproved(false);
		
		  
		  
		  
		  System.out.println("Finish setting all fields");
		  
		  try {
			useraccountLocalServiceUtil.adduseraccount(useraccount);
			System.out.println("Finish adding useraccount");
			
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
			String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
			System.out.println("redirectURL = "+redirectURL);
			actionResponse.sendRedirect(redirectURL);
		  
			  SessionMessages.add(actionRequest, "request_processed", "Your request is waiting for approval");
		  
		 
	}
	
 
 

}
