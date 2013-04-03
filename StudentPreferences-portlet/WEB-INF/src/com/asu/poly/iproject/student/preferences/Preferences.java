package com.asu.poly.iproject.student.preferences;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.asu.poly.iproject.student.preferences.model.impl.preferencesImpl;
import com.asu.poly.iproject.student.preferences.service.preferencesLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Preferences
 */
public class Preferences extends MVCPortlet {
 
	public void updatePreferences(ActionRequest actionRequest,
		ActionResponse actionResponse)
		throws IOException, PortletException, SystemException {
		
		preferencesImpl preference = new preferencesImpl();
		
		preferencesImpl pref = ActionUtil.prupdatefromRequest(actionRequest);
		ArrayList<String> errors =new ArrayList<String>();
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		User user = themeDisplay.getRealUser(); // it gives you the actual Logged in User
		
		long userId = user.getUserId();  //gives the id of the logged in user

		
		boolean projectValid = ProjectValidator.validateProject(pref,errors);
		
		if(projectValid){
			
			
			
		String preference1 = ParamUtil.getString(actionRequest, "preference1");
		String preference2 = ParamUtil.getString(actionRequest, "preference2");
		String preference3 = ParamUtil.getString(actionRequest, "preference3");
		String preference4 = ParamUtil.getString(actionRequest, "preference4");
		String preference5 = ParamUtil.getString(actionRequest, "preference5");
	
		String focusarea = ParamUtil.getString(actionRequest, "focusarea");
		String reasons = ParamUtil.getString(actionRequest, "reasons");
		
		
		
		
		// set primary key
		long preferenceID = 0L;
		try {
			preferenceID = CounterLocalServiceUtil.increment(this.getClass().getName());
		} catch (SystemException e) {
		e.printStackTrace();
		}

		// set UI fields
		pref.setPreference1(preference1);
		pref.setPreference2(preference2);
		pref.setPreference3(preference3);
		pref.setPreference4(preference4);
		pref.setPreference5(preference5);
		pref.setStudentasuid(userId);
		pref.setFocusarea(focusarea);
		pref.setReasons(reasons);
		
		pref.setDateAdded(new Date());
		pref.setDateModified(new Date());
		
	
		//preferencesLocalServiceUtil.addpreferences(preference);
		preferencesLocalServiceUtil.addpreferences(pref);
		SessionMessages.add(actionRequest,"entries-saved-sucessfully" );
	    //actionResponse.setRenderParameter("", viewThanksYouJSP);
	  
		
	}
		
		else{
			 for (String error :errors){
				 SessionErrors.add(actionRequest,error);
			}
			 SessionErrors.add(actionRequest, "Error-saving-registraction");
			actionResponse.setRenderParameter("jspPage", "/view.jsp");
			 actionRequest.setAttribute("pref",pref);
			}

	}//if
}
