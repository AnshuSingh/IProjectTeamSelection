package com.generaluser;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Contact;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ContactLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.persistence.UserUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import com.generaluser.slayer.model.Employee;
import com.generaluser.slayer.service.EmployeeLocalServiceUtil;

/**
 * Portlet implementation class GeneraluserPortlet
 */
public class GeneraluserPortlet extends MVCPortlet  {
	
	public void updateuser(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		
		int count;
	try {
			count = EmployeeLocalServiceUtil.getEmployeesCount();
			List<Employee> subscribers = EmployeeLocalServiceUtil.getEmployees(0, count);
		
		
		 String[] firstname = new String[count];
		 String[] lastName = new String[count];
		 String[] email = new String[count];
		 String[] password = new String[count];
		 String[] screenName = new String[count];
		
		 
		 User[] userToCreate = new User[count];
		
		for ( int i=0;i<count; i++)
		{
			 firstname[i] = subscribers.get(i).getFirstName();
			 lastName[i] = subscribers.get(i).getLastName();
			 email[i] = subscribers.get(i).getEMail();
			 password[i] = subscribers.get(i).getPassword();
			 screenName[i] = subscribers.get(i).getFirstName();
			 
			 		       
			 
			 long userId;
			
				userId = CounterLocalServiceUtil.increment();
				 long contactId = CounterLocalServiceUtil.increment();
		            long groupId = CounterLocalServiceUtil.increment();
		            long publicLayoutSetId = CounterLocalServiceUtil.increment();
		            long privateLayoutSetId = CounterLocalServiceUtil.increment();
		            
		            
				userToCreate[i] = UserUtil.create(userId);
	             userToCreate[i].setFirstName(firstname[i]);
	             userToCreate[i].setLastName(lastName[i]);
	             userToCreate[i].setEmailAddress(email[i]);
	             userToCreate[i].setPassword(password[i]);
	             userToCreate[i].setScreenName(screenName[i]);
	             userToCreate[i].setStatus(0);
	             userToCreate[i].setCreateDate(new Date());
	           userToCreate[i].setGreeting("Hi " + screenName);
	           userToCreate[i].setContactId(0);
	           
	           
	           User createdUser = UserLocalServiceUtil.addUser(userToCreate[i]);
	           
	           
	           long companyId = CounterLocalServiceUtil.increment();
	           Contact contact1 =ContactLocalServiceUtil.createContact(contactId);
	            contact1.setCompanyId(companyId);
	            contact1.setUserId(userId);

	           
	           
		}
		
		
	}
		
			 catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}	

}
