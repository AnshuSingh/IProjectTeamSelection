package com.asu.poly.teams.randomCreate;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.asu.poly.teams.randomCreate.slayer.model.Faculty;
import com.asu.poly.teams.randomCreate.slayer.model.Projectdetail;
import com.asu.poly.teams.randomCreate.slayer.model.Student;
import com.asu.poly.teams.randomCreate.slayer.model.impl.TeamImpl;
import com.asu.poly.teams.randomCreate.slayer.service.FacultyLocalServiceUtil;
import com.asu.poly.teams.randomCreate.slayer.service.ProjectdetailLocalServiceUtil;
import com.asu.poly.teams.randomCreate.slayer.service.StudentLocalServiceUtil;
import com.asu.poly.teams.randomCreate.slayer.service.TeamLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Test class RandomCreation
 */
public class TestRandomCreation extends MVCPortlet {
  public void createTeams(ActionRequest actionRequest,
	ActionResponse actionResponse)
	throws IOException, PortletException {

    List<Student> students;
  	List<Team> teams;
		TeamImpl team = new TeamImpl();
	  int teamCount;
		
		int teamCount;
		try {
			teamCount = TeamLocalServiceUtil.getTeamsCount();
			teams = TeamLocalServiceUtil.getTeams(0,	teamCount);
			
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// set UI fields
		try {
		studentCount = StudentLocalServiceUtil.getStudentsCount();
		students = StudentLocalServiceUtil.getStudents(0,	studentCount);
		}catch (SystemException e1) {
  		// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}
}
