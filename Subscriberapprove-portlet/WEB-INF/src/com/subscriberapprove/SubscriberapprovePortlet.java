package com.subscriberapprove;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;


import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.RoleServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.subscriberapprove.model.Faculty;
import com.subscriberapprove.model.student;
//import com.subscriberapprove.model.useraccount;
import com.subscriberapprove.model.impl.FacultyImpl;
import com.subscriberapprove.model.impl.studentImpl;
import com.subscriberapprove.service.FacultyLocalServiceUtil;
import com.subscriberapprove.service.studentLocalServiceUtil;
//import com.subscriberapprove.service.useraccountLocalServiceUtil;
import com.CreateUser.model.useraccount;
import com.CreateUser.service.useraccountLocalServiceUtil;


/**
 * Portlet implementation class SubscriberapprovePortlet
 */
public class SubscriberapprovePortlet extends MVCPortlet {
 
	
	public void updateuser(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException, PortalException, SystemException {
		
		
		System.out.println("in action class      1");
		
		int count;
	try {
		
		System.out.println("in action class  2");
		
		
			count = useraccountLocalServiceUtil.getuseraccountsCount();			
			 
			String[] selectedId = actionRequest.getParameterValues("approveuser");
			for(int i =0; i<selectedId.length; i++){
				System.out.println(selectedId[i]);
				useraccount ua = useraccountLocalServiceUtil.fetchuseraccount(Long.parseLong(selectedId[i]));
				System.out.println("in action class  2A");
				
				//adding to the user_ table
				User createduser =	myaddUser(actionRequest,ua);
				
				//adding to the student table
				if(ua.getRole().equalsIgnoreCase("student")){
					
					System.out.println("in action class  3");
					
					addNewStudent(actionRequest,ua);
					
					System.out.println("in action class  4");
				}
				
				//adding to the faculty table
				else if(ua.getRole().equalsIgnoreCase("faculty")){
					
					System.out.println("in action class  3");
					
					addnewfaculty(actionRequest,ua);
					
					System.out.println("in action class  4");
				}
				
				//delete the user entry in the cnua_useraccount table
				//useraccountLocalServiceUtil.deleteuseraccount(Long.parseLong(selectedId[i]));
				
			}
				  
			
			System.out.println("in action class  3");
	}
	 catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void addnewfaculty(ActionRequest actionRequest, useraccount useraccount) {
		// TODO Auto-generated method stub
		
		Faculty newfaculty = new FacultyImpl();
		
		 long facultyid = 0L; try {
			 facultyid =
			  CounterLocalServiceUtil.increment( this.getClass().getName());
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 newfaculty.setFacultyID(facultyid);
		 newfaculty.setAsuriteid(useraccount.getAsuriteId());
		 newfaculty.setFacultyDept(useraccount.getMajor());
		 newfaculty.setFacultyName((useraccount.getFirstName()+useraccount.getLastName()));
		 newfaculty.setContact(useraccount.getPhoneNo());
		 newfaculty.setDateAdded(new Date());
		 newfaculty.setDateModified(new Date());
		 newfaculty.setAssigned(false);
		 
		 try {
				//useraccountLocalServiceUtil.adduseraccount(useraccount);
			 	FacultyLocalServiceUtil.addFaculty(newfaculty);
				System.out.println("Finish adding useraccount");
				
			} catch (com.liferay.portal.kernel.exception.SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
	}

	private void addNewStudent(ActionRequest actionRequest, useraccount useraccount) {
		// TODO Auto-generated method stub
		student student1 = new studentImpl();
				 
		  long studentgeninfoID = 0L; try {
			  studentgeninfoID =
			  CounterLocalServiceUtil.increment( this.getClass().getName());
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		student1.setStudentgeninfoid(studentgeninfoID);
		student1.setAsuriteid(useraccount.getAsuriteId());
		student1.setFirstName(useraccount.getFirstName());
		student1.setLastName(useraccount.getLastName());
		student1.setDepartment(useraccount.getMajor());
		student1.setLevel(useraccount.getLevel());
		student1.setCgpa(useraccount.getCgpa());
		student1.setPhone(useraccount.getPhoneNo());
		student1.setSex(useraccount.getSex());
		student1.setCreateDate(new Date());
		student1.setModifiedDate(new Date());
		student1.setAssigned(false);
		
		 try {
				//useraccountLocalServiceUtil.adduseraccount(useraccount);
			 	studentLocalServiceUtil.addstudent(student1);
				System.out.println("Finish adding useraccount");
				
			} catch (com.liferay.portal.kernel.exception.SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
	}

	@SuppressWarnings("null")
	private User myaddUser(ActionRequest actionRequest, useraccount employee) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		
		System.out.println("in add user method 1");
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		long creatorUserId = themeDisplay.getUserId(); // default liferay user
		long companyId = themeDisplay.getCompanyId(); // default company
		boolean autoPassword = false;
		String password1 = employee.getPassword();//"";
		String password2 = employee.getPassword();//"";
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
		
		System.out.println("in add user method 2");

		long[] groupIds = null;
		long[] organizationIds = null;
		long[] roleIds = null ;//= null;
		long[] userGroupIds = null;
		
		System.out.println(employee.getRole());
		
		
		//System.out.print(roleIds[0]);
		
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

		if(employee.getRole().equals("student"))
		{
			
			Role roleOLD = RoleLocalServiceUtil.getRole(user.getCompanyId(), "User");
			Role roleNEW= RoleLocalServiceUtil.getRole(user.getCompanyId(), "ASUStudent");
			long lRoleOLD = roleOLD.getRoleId();
			long lRoleNEW = roleNEW.getRoleId();
			List<Role> roles = RoleServiceUtil.getUserRoles(user.getUserId());
			for (Role role : roles) {
			       if (role.getName().equalsIgnoreCase("User")) {
			             UserLocalServiceUtil.setRoleUsers(lRoleNEW , new long[]{user.getUserId()});
			             UserLocalServiceUtil.deleteRoleUser(lRoleOLD , user.getUserId());
			          }
			}
			System.out.println("in add user method 3");
			
			
			System.out.println("in add user method 4");
			
			//System.out.print(roleIds[0]);
		}
		
		else if(employee.getRole().equals("faculty"))
		{
			
			Role roleOLD = RoleLocalServiceUtil.getRole(user.getCompanyId(), "User");
			Role roleNEW= RoleLocalServiceUtil.getRole(user.getCompanyId(), "ASUfaculty");
			long lRoleOLD = roleOLD.getRoleId();
			long lRoleNEW = roleNEW.getRoleId();
			List<Role> roles = RoleServiceUtil.getUserRoles(user.getUserId());
			for (Role role : roles) {
			       if (role.getName().equalsIgnoreCase("User")) {
			             UserLocalServiceUtil.setRoleUsers(lRoleNEW , new long[]{user.getUserId()});
			             UserLocalServiceUtil.deleteRoleUser(lRoleOLD , user.getUserId());
			          }
			}
			System.out.println("in add user method 5");
			
			
			System.out.println("in add user method 6");
			
			//System.out.print(roleIds[0]);
		}
		
		else if(employee.getRole().equals("sponsor"))
		{
			
			Role roleOLD = RoleLocalServiceUtil.getRole(user.getCompanyId(), "User");
			Role roleNEW= RoleLocalServiceUtil.getRole(user.getCompanyId(), "iProjectSponsor");
			long lRoleOLD = roleOLD.getRoleId();
			long lRoleNEW = roleNEW.getRoleId();
			List<Role> roles = RoleServiceUtil.getUserRoles(user.getUserId());
			for (Role role : roles) {
			       if (role.getName().equalsIgnoreCase("User")) {
			             UserLocalServiceUtil.setRoleUsers(lRoleNEW , new long[]{user.getUserId()});
			             UserLocalServiceUtil.deleteRoleUser(lRoleOLD , user.getUserId());
			          }
			}
			System.out.println("in add user method 5");
			
			
			System.out.println("in add user method 6");
			
			//System.out.print(roleIds[0]);
		}
		
		
		return user;
	}

	

}
