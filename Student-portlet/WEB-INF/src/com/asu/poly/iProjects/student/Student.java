package com.asu.poly.iProjects.student;
import com.asu.poly.iProjects.student.model.student;
import com.asu.poly.iProjects.student.service.studentLocalServiceUtil;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.asu.poly.iProjects.student.model.availability;
import com.asu.poly.iProjects.student.model.preferences;
import com.asu.poly.iProjects.student.model.impl.availabilityImpl;
import com.asu.poly.iProjects.student.model.impl.preferencesImpl;
import com.asu.poly.iProjects.student.service.availabilityLocalServiceUtil;
import com.asu.poly.iProjects.student.service.preferencesLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Student
 */
public class Student extends MVCPortlet {
 
	public void submitForms(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws IOException, PortletException {
		int countStudent;
		List<student> dbStudentList = null;
		try {
			countStudent = studentLocalServiceUtil.getstudentsCount();
			dbStudentList = studentLocalServiceUtil.getstudents(0, countStudent);
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		for (student std: dbStudentList){
		
		}
		
		
		updatePreferences(actionRequest,actionResponse);
		studentAvailability(actionRequest,actionResponse);
		updateSkills(actionRequest,actionResponse);
	}
	
	public void updatePreferences(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws IOException, PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getRealUser(); // it gives you the actual Logged in User
		long userId = user.getUserId();  //gives the id of the logged in user
	
		String preference1 = ParamUtil.getString(actionRequest, "preference1");
		String preference2 = ParamUtil.getString(actionRequest, "preference2");
		String preference3 = ParamUtil.getString(actionRequest, "preference3");
		String preference4 = ParamUtil.getString(actionRequest, "preference4");
		String preference5 = ParamUtil.getString(actionRequest, "preference5");
		String focusarea = ParamUtil.getString(actionRequest, "focusarea");
		String reasons = ParamUtil.getString(actionRequest, "reasons");
		
		
		
		preferences preference = null ;
		
		if (userId > 0L) {
			try {
				preference = preferencesLocalServiceUtil.getpreferences(userId);
				} catch (PortalException e) {
					e.printStackTrace();
				} catch (SystemException e) {
					e.printStackTrace();
				}
		} else {
			preference=  new preferencesImpl();
		}
			
		
		// set UI fields
		preference.setStudentID(userId);
		try {
			preference.setAsuriteid(user.getLogin());
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		preference.setPreference1(preference1);
		preference.setPreference2(preference2);
		preference.setPreference3(preference3);
		preference.setPreference4(preference4);
		preference.setPreference5(preference5);
		preference.setStudentasuid(userId);
		preference.setFocusarea(focusarea);
		preference.setReasons(reasons);
		
		preference.setDateAdded(new Date());
		preference.setDateModified(new Date());
		
		try {
		preferencesLocalServiceUtil.addpreferences(preference);
		} catch (SystemException e) {
		e.printStackTrace();
		}
		
	}
	
	public void studentAvailability(ActionRequest actionRequest,ActionResponse actionResponse)
			throws IOException, PortletException 
			{
		
				System.out.println("In function");
		      String mon8to9 = ParamUtil.getString(actionRequest,"mon8to9");
		      String mon9to10 = ParamUtil.getString(actionRequest,"mon9to10");
		      String mon10to11 = ParamUtil.getString(actionRequest,"mon10to11");
		      String mon11to12 = ParamUtil.getString(actionRequest,"mon11to12");
		      String mon12to1 = ParamUtil.getString(actionRequest,"mon12to1");
		      String mon1to2 = ParamUtil.getString(actionRequest,"mon1to2");
		      String mon2to3 = ParamUtil.getString(actionRequest,"mon2to3");
		      String mon3to4 = ParamUtil.getString(actionRequest,"mon3to4");
		      String mon4to5  = ParamUtil.getString(actionRequest,"mon4to5");
			
		         		      	      
		      String tue8to9 = ParamUtil.getString(actionRequest, "tue8to9");
		      String tue9to10 = ParamUtil.getString(actionRequest, "tue9to10");
		      String tue10to11 = ParamUtil.getString(actionRequest, "tue10to11");
		      String tue11to12 = ParamUtil.getString(actionRequest, "tue11to12");
		      String tue12to1 = ParamUtil.getString(actionRequest, "tue12to1");
		      String tue1to2 = ParamUtil.getString(actionRequest, "tue1to2");
		      String tue2to3 = ParamUtil.getString(actionRequest, "tue2to3");
		      String tue3to4 = ParamUtil.getString(actionRequest, "tue3to4");
		      String tue4to5 = ParamUtil.getString(actionRequest, "tue4to5");
		      
		      String wed8to9= ParamUtil.getString(actionRequest, "wed8to9");
		      String wed9to10 = ParamUtil.getString(actionRequest, "wed9to10");
		      String wed10to11 = ParamUtil.getString(actionRequest, "wed10to11");
		      String wed11to12 = ParamUtil.getString(actionRequest, "wed11to12");
		      String wed12to1 = ParamUtil.getString(actionRequest, "wed12to1");
		      String wed1to2 = ParamUtil.getString(actionRequest, "wed1to2");
		      String wed2to3 = ParamUtil.getString(actionRequest, "wed2to3");
		      String wed3to4 = ParamUtil.getString(actionRequest, "wed3to4");
		      String wed4to5 = ParamUtil.getString(actionRequest, "wed4to5");
		      
		      String thu8to9 = ParamUtil.getString(actionRequest, "thu8to9");
		      String thu9to10 = ParamUtil.getString(actionRequest, "thu9to10");
		      String thu10to11 = ParamUtil.getString(actionRequest, "thu10to11");
		      String thu11to12 = ParamUtil.getString(actionRequest, "thu11to12");
		      String thu12to1 = ParamUtil.getString(actionRequest, "thu12to1");
		      String thu1to2 = ParamUtil.getString(actionRequest, "thu1to2");
		      String thu2to3 = ParamUtil.getString(actionRequest, "thu2to3");
		      String thu3to4 = ParamUtil.getString(actionRequest, "thu3to4");
		      String thu4to5 = ParamUtil.getString(actionRequest, "thu4to5");
		      
		      String fri8to9 = ParamUtil.getString(actionRequest, "fri8to9");
		      String fri9to10 = ParamUtil.getString(actionRequest, "fri9to10");
		      String fri10to11 = ParamUtil.getString(actionRequest, "fri10to11");
		      String fri11to12 = ParamUtil.getString(actionRequest, "fri11to12");
		      String fri12to1 = ParamUtil.getString(actionRequest, "fri12to1");
		      String fri1to2 = ParamUtil.getString(actionRequest, "fri1to2");
		      String fri2to3 = ParamUtil.getString(actionRequest, "fri2to3");
		      String fri3to4 = ParamUtil.getString(actionRequest, "fri3to4");
		      String fri4to5 = ParamUtil.getString(actionRequest, "fri4to5");
		      
		      String sat8to9 = ParamUtil.getString(actionRequest, "sat8to9");
		      String sat9to10 = ParamUtil.getString(actionRequest, "sat9to10");
		      String sat10to11 = ParamUtil.getString(actionRequest, "sat10to11");
		      String sat11to12 = ParamUtil.getString(actionRequest, "sat11to12");
		      String sat12to1 = ParamUtil.getString(actionRequest, "sat12to1");
		      String sat1to2 = ParamUtil.getString(actionRequest, "sat1to2");
		      String sat2to3 = ParamUtil.getString(actionRequest, "sat2to3");
		      String sat3to4 = ParamUtil.getString(actionRequest, "sat3to4");
		      String sat4to5 = ParamUtil.getString(actionRequest, "sat4to5");
		      
		      String sun8to9 = ParamUtil.getString(actionRequest, "sun8to9");
		      String sun9to10 = ParamUtil.getString(actionRequest, "sun9to10");
		      String sun10to11 = ParamUtil.getString(actionRequest, "sun11to12");
		      String sun11to12 = ParamUtil.getString(actionRequest, "sat11to12");
		      String sun12to1 = ParamUtil.getString(actionRequest, "sun12to1");
		      String sun1to2 = ParamUtil.getString(actionRequest, "sun1to2");
		      String sun2to3 = ParamUtil.getString(actionRequest, "sun2to3");
		      String sun3to4 = ParamUtil.getString(actionRequest, "sun3to4");
		      String sun4to5 = ParamUtil.getString(actionRequest, "sun4to5");
		      
		      
		      availability student = new availabilityImpl();
		      long studentId = 0L;
		      try 
		      {
		    	 studentId = CounterLocalServiceUtil.increment(this.getClass().getName());
		      } 
		      catch (Exception e) 
		      {
		    	  e.printStackTrace();
		      }
		      
		      System.out.println("In function after paramutil");
		   student.setStudentid(studentId);
		   // set UI fields
		   student.setMon8to9(mon8to9);
		   student.setMon9to10(mon9to10);
		   student.setMon10to11(mon10to11);
		   student.setMon11to12(mon11to12);
		   student.setMon12to1(mon12to1);
		   student.setMon1to2(mon1to2);
		   student.setMon2to3(mon2to3);
		   student.setMon3to4(mon3to4);
		   student.setMon4to5(mon4to5);
		   
		   student.setTue8to9(tue8to9);
		   student.setTue9to10(tue9to10);
		   student.setTue10to11(tue10to11);
		   student.setTue11to12(tue11to12);
		   student.setTue12to1(tue12to1);
		   student.setTue1to2(tue1to2);
		   student.setTue2to3(tue2to3);
		   student.setTue3to4(tue3to4);
		   student.setTue4to5(tue4to5);
		   
		   
		   student.setWed8to9(wed8to9);
		   student.setWed9to10(wed9to10);
		   student.setWed10to11(wed10to11);
		   student.setWed11to12(wed11to12);
		   student.setWed12to1(wed12to1);
		   student.setWed1to2(wed1to2);
		   student.setWed2to3(wed2to3);
		   student.setWed3to4(wed3to4);
		   student.setWed4to5(wed4to5);
		   
		   student.setThu8to9(thu8to9);
		   student.setThu9to10(thu9to10);
		   student.setThu10to11(thu10to11);
		   student.setThu11to12(thu11to12);
		   student.setThu12to1(thu12to1);
		   student.setThu1to2(thu1to2);
		   student.setThu2to3(thu2to3);
		   student.setThu3to4(thu3to4);
		   student.setThu4to5(thu4to5);
		   
		   student.setFri8to9(fri8to9);
		   student.setFri9to10(fri9to10);
		   student.setFri10to11(fri10to11);
		   student.setFri11to12(fri11to12);
		   student.setFri12to1(fri12to1);
		   student.setFri1to2(fri1to2);
		   student.setFri2to3(fri2to3);
		   student.setFri3to4(fri3to4);
		   student.setFri4to5(fri4to5);
		   
		   student.setSat8to9(sat8to9);
		   student.setSat9to10(sat9to10);
		   student.setSat10to11(sat10to11);
		   student.setSat11to12(sat11to12);
		   student.setSat12to1(sat12to1);
		   student.setSat1to2(sat1to2);
		   student.setSat2to3(sat2to3);
		   student.setSat3to4(sat3to4);
		   student.setSat4to5(sat4to5);
		   
		   student.setSun8to9(sun8to9);
		   student.setSun9to10(sun9to10);
		   student.setSun10to11(sun10to11);
		   student.setSun11to12(sun11to12);
		   student.setSun12to1(sun12to1);
		   student.setSun1to2(sun1to2);
		   student.setSun2to3(sun2to3);
		   student.setSun3to4(sun3to4);
		   student.setSun4to5(sun4to5);
		   
		   
		   // set audit field(s)
		   student.setCreateDate(new Date());
		   System.out.println("In Avaialbility after set");
		   try {
			   	System.out.println("In try-catch block");
				availabilityLocalServiceUtil.addavailability(student);
				} catch (SystemException e) {
				e.printStackTrace();
					
			}
 }
	
	public void updateSkills(ActionRequest actionRequest,ActionResponse actionResponse)
			throws IOException, PortletException {
			
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

			User user = themeDisplay.getRealUser(); // it gives you the actual Logged in User
			
			long userId = user.getUserId();  //gives the id of the logged in user
			
			//String userName = user.getEmailAddress();
			
			//System.out.println(userId);
			//System.out.println(userName);
			
			
			 
		}
		
}
