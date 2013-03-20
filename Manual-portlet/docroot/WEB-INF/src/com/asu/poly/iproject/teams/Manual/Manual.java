package com.asu.poly.iproject.teams.Manual;
import com.asu.poly.teams.manualSelect.slayer.service.FacultyLocalServiceUtil;
import com.asu.poly.teams.manualSelect.slayer.service.StudentLocalServiceUtil;
import com.asu.poly.teams.manualSelect.slayer.model.Faculty;
import com.asu.poly.teams.manualSelect.slayer.model.Team;

import java.io.IOException;
import java.util.Date;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.asu.poly.teams.manualSelect.slayer.model.impl.TeamImpl;
import com.asu.poly.teams.manualSelect.slayer.service.TeamLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Manual
 */
public class Manual extends MVCPortlet {
	public void createTeams(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws IOException, PortletException {
			String project = ParamUtil.getString(actionRequest, "project");
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
								 
		//TeamImpl team = new TeamImpl();
			team.setTeamID(teamID );
			team.setProjectTitle(project);
			
			// set UI fields
				
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
			
				if(teamID >0L){
					modifyteam(team);
				}else {
					addTeam(team);
				}
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
	
