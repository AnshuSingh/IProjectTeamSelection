package com.asu.poly.iproject.teams.Manual;
import com.asu.poly.teams.manualSelect.slayer.service.FacultyLocalServiceUtil;
import com.asu.poly.teams.manualSelect.slayer.service.StudentLocalServiceUtil;
import com.asu.poly.teams.manualSelect.slayer.model.Faculty;
import com.asu.poly.teams.manualSelect.slayer.model.Team;

import java.io.IOException;
import java.util.Date;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;

import com.asu.poly.teams.manualSelect.slayer.model.impl.TeamImpl;
import com.asu.poly.teams.manualSelect.slayer.service.TeamLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletConfig;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.util.bridges.mvc.MVCPortlet;
import java.io.*;
import java.sql.*;
import static java.lang.System.*;
import com.liferay.portal.kernel.servlet.SessionErrors;  
import com.liferay.portal.util.PortalUtil;

 
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;

/**
 * Portlet implementation class Manual
 */
public class Manual extends MVCPortlet {
	public void updateTeams(ActionRequest actionRequest,
			ActionResponse actionResponse)
	
			throws IOException, PortletException {
		
		
			String project = ParamUtil.getString(actionRequest, "project");
			int count=0;
						
			if(project ==null || "".equalsIgnoreCase(project)){
				SessionErrors.add(actionRequest, "project-required");
				}
			
			 String [] faculty = actionRequest.getParameterValues("faculty");
			 String [] student = actionRequest.getParameterValues("student");
			 
			 
			 Team team  = null;
				long teamID = ParamUtil.getLong(actionRequest, "teamID");
				if (teamID > 0L) {
				try {
				team = TeamLocalServiceUtil.getTeam(teamID);
				} catch (PortalException e) {
				e.printStackTrace();
				} catch (SystemException e) {
				e.printStackTrace();
				}
				} else {
					team = new TeamImpl();
				}
								 

			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "");
				Statement st = con.createStatement();
				ResultSet rs=st.executeQuery("SELECT  * FROM `teamdetails` WHERE projectTitle ='"+project+" ' ");
				while(rs.next()){
					count++;
				}
				if(count>0){
			        out.println("<font color=red>Error: Team is already created for the particular Project Title</font>");
			        //SessionErrors.add(actionRequest,"Team is already created for the particular Project Title" );
			        		
			   //   SessionMessages.add(actionRequest, (LiferayPortletConfig)portletConfig.getPortletName()+ SessionMessages. KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			       //	 SessionErrors.add(actionRequest, error.class);
			     SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			     // SessionErrors.add(actionRequest, "error");
			        
				}
				else{
					team.setTeamID(teamID );
					team.setProjectTitle(project);
					
					if (faculty.length == 0){
						team.setFaculty1("-");
						 team.setFaculty2("-");
						 team.setFaculty3("-");
						 team.setFaculty4("-");
					}
			
					else if(faculty.length == 1){
						 
						team.setFaculty1(faculty[0]);
					 }else if(faculty.length == 2){
						 team.setFaculty1(faculty[0]);
						 team.setFaculty2(faculty[1]);	
					 }else if(faculty.length == 3){
						 team.setFaculty1(faculty[0]);
						 team.setFaculty2(faculty[1]);
						 team.setFaculty3(faculty[2]);
					 }else if(faculty.length == 3){
						 team.setFaculty1(faculty[0]);
						 team.setFaculty2(faculty[1]);
						 team.setFaculty3(faculty[2]);
						 team.setFaculty4(faculty[3]);
						 
					 }
					 				
					if(student.length == 0){
					String blnk = "-";
				    team.setStudent0(blnk);
					team.setStudent1(blnk);
					team.setStudent2(blnk);
					team.setStudent3(blnk);
					}
				else if(student.length == 4){
				
			    team.setStudent0(student[0]);
				team.setStudent1(student[1]);
				team.setStudent2(student[2]);
				team.setStudent3(student[3]);
				}
				else if(student.length == 5){
					
				    team.setStudent0(student[0]);
					team.setStudent1(student[1]);
					team.setStudent2(student[2]);
					team.setStudent3(student[3]);
					team.setStudent4(student[4]);
				}
				else if(student.length == 6){
					
				    team.setStudent0(student[0]);
					team.setStudent1(student[1]);
					team.setStudent2(student[2]);
					team.setStudent3(student[3]);
					team.setStudent4(student[4]);
					team.setStudent5(student[5]);
				}
				else if(student.length == 7){
					
				    team.setStudent0(student[0]);
					team.setStudent1(student[1]);
					team.setStudent2(student[2]);
					team.setStudent3(student[3]);
					team.setStudent4(student[4]);
					team.setStudent5(student[5]);
					team.setStudent6(student[6]);
				}
				 else if(student.length == 8){
					
				    team.setStudent0(student[0]);
					team.setStudent1(student[1]);
					team.setStudent2(student[2]);
					team.setStudent3(student[3]);
					team.setStudent4(student[4]);
					team.setStudent5(student[5]);
					team.setStudent6(student[6]);
					team.setStudent7(student[7]);
				}
					
				
			}
			}
			catch(Exception se){
		        //System.out.println(se);
		       // SessionErrors.add(actionRequest, se.getClass().getName());
		        PortletConfig portletConfig = (PortletConfig)actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		      //  SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		        //SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			      SessionErrors.add(actionRequest, "error");
			      //return -1;
			}
			
			
				if(teamID >0L){
					modifyteam(team);
				}else {
					addTeam(team);
				}
		//return 0;	
	}
	
	private void addTeam(Team team) {
		// TODO Auto-generated method stub
		long teamID = 0L;
		try {
			teamID = CounterLocalServiceUtil.increment(this.getClass().getName());
		} catch (SystemException e) {
		e.printStackTrace();
		}
		team.setTeamID(teamID);
		// set audit field(s)
		  
		team.setDateAdded(new Date());
		team.setDateModified(new Date());
		
		try
		{
			
		TeamLocalServiceUtil.addTeam(team);
		} catch (SystemException e)
		{
		e.printStackTrace();
		}
		}
		
		private void modifyteam(Team team) {
			// TODO Auto-generated method stub
			
			team.setDateModified(new Date());

			try {
				TeamLocalServiceUtil.updateTeam(team);
			} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
		public void saveteam(ActionRequest actionRequest,
				ActionResponse actionResponse) throws IOException, PortletException {
			
			
			String prjtitle = ParamUtil.getString(actionRequest,"project");
			
			 String [] fac = actionRequest.getParameterValues("faculty");
			 String [] std = actionRequest.getParameterValues("student");
			 
			 actionRequest.setAttribute("prjtitle", prjtitle);
			 actionRequest.setAttribute("fac", fac);
			 actionRequest.setAttribute("std", std);
		}
			

		public void deleteTeam(ActionRequest actionRequest,
	            ActionResponse actionResponse) throws IOException, PortletException
	    {

	    long teamID = ParamUtil.getLong(actionRequest, "teamID");
	
	    if (teamID > 0L) {
            try {
            	Team team = TeamLocalServiceUtil.getTeam(teamID);
            	TeamLocalServiceUtil.deleteTeam(teamID);
            	
            	
            } catch (PortalException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            
        } catch (SystemException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
         }
      }
	
	    
	    String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
	    actionResponse.sendRedirect(redirectURL);
				// set primary key
				
			
	    }
}
	
