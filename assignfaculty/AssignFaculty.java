package com.asu.poly.iProjects.teams;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.asu.poly.iProjects.teams.model.Team;
import com.asu.poly.iProjects.teams.model.impl.TeamImpl;
import com.asu.poly.iProjects.teams.service.TeamLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.asu.poly.iProjects.teams.model.Faculty;
import com.asu.poly.iProjects.teams.service.FacultyLocalServiceUtil;


/**
 * Portlet implementation class AssignFaculty
 */
public class AssignFaculty extends MVCPortlet {
 
	public void updateTeams(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws IOException, PortletException {
		
			String project = ParamUtil.getString(actionRequest, "project");
			if(project ==null || "".equalsIgnoreCase(project)){
				SessionErrors.add(actionRequest, "project-required");
			}
			String [] faculty1 = actionRequest.getParameterValues("faculty");
			Team team  = null;
			
			int countFaculty;
			List<faculty> dbFacultyList = null;
			try {
				countFaculty = FacultyLocalServiceUtil.getFacultyCount();
				dbFacultyList = FacultyLocalServiceUtil.getfaculties(0, countFaculty);
			} catch (SystemException e1) {
				e1.printStackTrace();
			}
			
			
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
			
			team.setProjectTitle(project);
			String csvFaculty = "";
			
			for (int i = 0; i<faculty1.length;i++){
				csvFaculty = faculty1[i]+","+csvFaculty;
				for (faculty fclty : dbFacultyList) {
					if (fclty.getAsuid().equals(faculty1[i])){
						updateFacultyTable(fclty);
					}
						
				}
			}
			team.setFaculty1(csvFaculty);

			if(teamID >0L){
				modifyteam(team);
			}else {
				addTeam(team);
			}
	}
	
	private void updateFacultyTable(faculty fclty) {
		//stdnt.setAssigned(true);
		stdnt.setPhone("assigned = true");
		stdnt.setModifiedDate(new Date());
		try {
			FacultyLocalServiceUtil.updatefaculty(stdnt);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
	}

	private void addTeam(Team team) {
		long teamID = 0L;
		try {
			teamID = CounterLocalServiceUtil.increment(this.getClass().getName());
		} catch (SystemException e) {
			e.printStackTrace();
		}
		team.setTeamID(teamID);
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
			team.setDateModified(new Date());

			try {
				TeamLocalServiceUtil.updateTeam(team);
			} catch (SystemException e) {
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
                e.printStackTrace();
        } catch (SystemException e) {
                e.printStackTrace();
         }
      }
	
	    
	    String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
	    actionResponse.sendRedirect(redirectURL);
				// set primary key
				
			
	    }
}
