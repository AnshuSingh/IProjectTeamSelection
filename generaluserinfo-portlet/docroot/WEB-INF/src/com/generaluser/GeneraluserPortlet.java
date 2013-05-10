package com.generaluser;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Address;
import com.liferay.portal.model.Contact;
import com.liferay.portal.model.EmailAddress;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.Phone;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroupRole;
import com.liferay.portal.model.Website;
import com.liferay.portal.security.auth.AutoLogin;
import com.liferay.portal.service.AccountLocalServiceUtil;
import com.liferay.portal.service.ContactLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.service.persistence.UserUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.announcements.model.AnnouncementsDelivery;
import com.liferay.util.bridges.mvc.MVCPortlet;

import com.generaluser.slayer.model.Employee;
import com.generaluser.slayer.service.EmployeeLocalServiceUtil;

/**
 * Portlet implementation class GeneraluserPortlet
 */
public  class GeneraluserPortlet extends MVCPortlet  {
	
	
	
	public void updateuser(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException, PortalException, SystemException {
		
		
		System.out.println("in action class      1");
		
		int count;
	try {
		
		System.out.println("in action class  2");
		
		
			count = EmployeeLocalServiceUtil.getEmployeesCount();
			List<Employee> subscribers = EmployeeLocalServiceUtil.getEmployees(0, count);
			
			System.out.println("in action class  3");
		
		User createduser = myaddUser(actionRequest,subscribers.get(1));
		
		System.out.println("in action class  4");
		
		User user1 = UserLocalServiceUtil.addUser(createduser);
		
		System.out.println("in action class  5");
	}
	 catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* String[] firstname = new String[count];
		 String[] lastName = new String[count];
		 String[] email = new String[count];
		 String[] password = new String[count];
		 String[] screenName = new String[count];
		
		 
		 User[] userToCreate = new User[count];
		
		 System.out.println("in action class   3");
		 */
		//for ( int i=0;i<count; i++)
		/*{
			int i =0;
			
			 firstname[i] = subscribers.get(i).getFirstName();
			 lastName[i] = subscribers.get(i).getLastName();
			 email[i] = subscribers.get(i).getEMail();
			 password[i] = subscribers.get(i).getPassword();
			 screenName[i] = subscribers.get(i).getFirstName();
			 
			 ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			 
			 long userId;
				
				userId = CounterLocalServiceUtil.increment();
				
				System.out.println("in action class   4");
			 
			 long companyId1 = themeDisplay.getCompanyId(); // default company		       
			 boolean autoPassword = true;
			  String password1 = "";
			  String password2 = "";
			  boolean autoScreenName = true;
			  String ScreenName = "";
			  String emailAddress = subscribers.get(1).getEMail();
			  long facebookId = 0;
			  String openId = "";
			  Locale locale = themeDisplay.getLocale();
			  String firstName = subscribers.get(1).getFirstName();
			  String middleName = "";
			  String lastname = subscribers.get(1).getLastName();
			  int prefixId = 0;
			  int suffixId = 0;
			  boolean male = false;   
			  int birthdayMonth = 1; ///Integer.parseInt(userData.getBirthDate().getMonth());
			  int birthdayDay = 1; ///Integer.parseInt(userData.getBirthDate().getDay());
			  int birthdayYear = 1; ///Integer.parseInt(userData.getBirthDate().getYear());
			  String jobTitle = null;//userData.getTitle();
			  
			  long[] groupIds = null;
			  long[] organizationIds = null;
			  long[] roleIds = null;
			  long[] userGroupIds = null;
			  
			  boolean sendEmail = false;
			  
			  System.out.println("in action class  5");
			  
			  ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			  
			  System.out.println("in action class  6");
			  
			 //UserServiceUtil userservice = new UserServiceUtil();
			  
			//userservice.addUser(blah, blah, ......); 
			//UserServiceUtil.addUser(userId, autoPassword, password1, password2, autoScreenName, ScreenName, emailAddress, facebookId, openId, locale, firstName, middleName, lastname, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, sendEmail, serviceContext);
			 // userservice.addUser(companyId1, autoPassword, password1, password2, autoScreenName, ScreenName, emailAddress, facebookId, openId, locale, firstName, middleName, lastname, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, addresses, emailAddresses, phones, websites, announcementsDelivers, sendEmail, serviceContext);
			  
			  User user = UserLocalServiceUtil.addUser(userId, companyId1, autoPassword, password1, password2, autoScreenName, ScreenName, emailAddress, facebookId, openId, locale, firstName, middleName, lastname, prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, sendEmail, serviceContext);
			  
			  User user1 = UserLocalServiceUtil.addUser(user);
			  
			  System.out.println("in action class    7");
			  
			 // User user1 = UserLocalServiceUtil.addUser(userToCreate[0]);
			  
			  System.out.println("in action class   8");*/
			  
			/* long userId;
			
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
	           userToCreate[i].setContactId(0);*/
	           
	           
	          
	          // User createdUser =  UserLocalServiceUtil.addUser(userToCreate[i]); 
	         //  }
	           
	         //  User createdUser = UserLocalServiceUtil.addUser(userToCreate[i]);
	           
	           
	           /*      long companyId = CounterLocalServiceUtil.increment();
	           Contact contact1 =ContactLocalServiceUtil.createContact(contactId);
	            contact1.setCompanyId(companyId);
	            contact1.setUserId(userId);
	            
                contact1.setAccountId(AccountLocalServiceUtil.getAccounts(0,1).get(0).getAccountId());
           contact1.setFirstName(firstname[i]);
           contact1.setLastName(lastName[i]);
           ContactLocalServiceUtil.addContact(contact1);

	           
		}      
		*/
		
		
	
		
		//int count = EmployeeLocalServiceUtil.getEmployeesCount();
		//List<Employee> subscribers = EmployeeLocalServiceUtil.getEmployees(0, count);
			
			
		
		/*ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		 
		  long creatorUserId = themeDisplay.getUserId(); // default liferay user
		  long companyId1 = themeDisplay.getCompanyId(); // default company
		  boolean autoPassword = true;
		  String password1 = "";
		  String password2 = "";
		  boolean autoScreenName = true;
		  String ScreenName = "";
		  String emailAddress = subscribers.get(0).getEMail();
		  long facebookId = 0;
		  String openId = "";
		  Locale locale = themeDisplay.getLocale();
		  String firstName = subscribers.get(0).getFirstName();
		  String middleName = "";
		  String lastname = subscribers.get(0).getLastName();
		  int prefixId = 0;
		  int suffixId = 0;
		  boolean male = false;   
		  int birthdayMonth = 1; ///Integer.parseInt(userData.getBirthDate().getMonth());
		  int birthdayDay = 1; ///Integer.parseInt(userData.getBirthDate().getDay());
		  int birthdayYear = 1; ///Integer.parseInt(userData.getBirthDate().getYear());
		  String jobTitle = null;//userData.getTitle();
		 
		  long[] groupIds = null;
		  long[] organizationIds = null;
		  long[] roleIds = null;
		  long[] userGroupIds = null;
		  
		  boolean sendEmail = false;
		  
		  ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
		  User user = UserLocalServiceUtil.addUser(creatorUserId,
		                                           companyId1,
		                                           autoPassword,
		                                           password1,
		                                           password2,
		                                           autoScreenName,
		                                           ScreenName,
		                                           emailAddress,
		                                           facebookId,
		                                           openId,
		                                           locale,
		                                           firstName,
		                                           middleName,
		                                           lastname,
		                                           prefixId,
		                                           suffixId,
		                                           male,
		                                           birthdayMonth,
		                                           birthdayDay,
		                                           birthdayYear,
		                                           jobTitle,
		                                           groupIds,
		                                           organizationIds,
		                                           roleIds,
		                                           userGroupIds,
		                                           sendEmail,
		                                           serviceContext);
		  
	
	*/
	/*}
	
	 catch (SystemException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/

	
	
	}

	private User myaddUser(ActionRequest actionRequest, Employee employee) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		long creatorUserId = themeDisplay.getUserId(); // default liferay user
		long companyId = themeDisplay.getCompanyId(); // default company
		boolean autoPassword = true;
		String password1 = "";
		String password2 = "";
		boolean autoScreenName = true;
		String screenName = "";
		String emailAddress = employee.getEMail();//userData.getEmail();
		long facebookId = 0;
		String openId = "";
		Locale locale = themeDisplay.getLocale();
		String firstName = employee.getFirstName();
		String middleName = "";
		String lastName = employee.getLastName();
		int prefixId = 0;
		int suffixId = 0;
		boolean male = true;//employee.isMale();   
		int birthdayMonth = 1;//Integer.parseInt(userData.getBirthDate().getMonth());
		int birthdayDay = 1;//Integer.parseInt(userData.getBirthDate().getDay());
		int birthdayYear = 1;//Integer.parseInt(userData.getBirthDate().getYear());
		String jobTitle = null;//userData.getTitle();

		long[] groupIds = null;
		long[] organizationIds = null;
		long[] roleIds = null;
		long[] userGroupIds = null;
		
		

		boolean sendEmail = false;

		ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
		User user = UserLocalServiceUtil.addUser(creatorUserId,
                companyId,
                autoPassword,
                password1,
                password2,
                autoScreenName,
                screenName,
                emailAddress,
                facebookId,
                openId,
                locale,
                firstName,
                middleName,
                lastName,
                prefixId,
                suffixId,
                male,
                birthdayMonth,
                birthdayDay,
                birthdayYear,
                jobTitle,
                groupIds,
                organizationIds,
                roleIds,
                userGroupIds,
                sendEmail,
                serviceContext);

		
		return user;
	}

	

	
	
	

	

	
	

	

	

	

	
	
	

}
