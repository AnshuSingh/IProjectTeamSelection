package com.asu.poly.iproject.teams.addProject;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.asu.poly.iproject.teams.addProject.model.Projectdetail;
import com.asu.poly.iproject.teams.addProject.model.impl.ProjectdetailImpl;
import com.asu.poly.iproject.teams.addProject.service.ProjectdetailLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AddProject
 */
public class AddProject extends MVCPortlet {
	
	public void updateproject(ActionRequest actionRequest,ActionResponse actionResponse)
			throws IOException, PortletException
	{
		System.out.println("Reahed here.");
		
		String projectTitle = ParamUtil.getString(actionRequest, "projectTitle");
		if(projectTitle ==null || "".equalsIgnoreCase(projectTitle)){
			SessionErrors.add(actionRequest, "projectTitle-required");
			} 
		String projectdescription = ParamUtil.getString(actionRequest, "projectdescription");
		String contact = ParamUtil.getString(actionRequest, "contact");
		String requiredskill = ParamUtil.getString(actionRequest, "projectrequiredskill");
		String status = ParamUtil.getString(actionRequest, "status");
		String link = ParamUtil.getString(actionRequest, "link");
		
		String phone = ParamUtil.getString(actionRequest,"phone");
		String email = ParamUtil.getString(actionRequest,"email");
		
		 String ch1 = ParamUtil.getString(actionRequest, "preference1");
		 String ch2 = ParamUtil.getString(actionRequest, "preference2");
		 String ch3 = ParamUtil.getString(actionRequest, "preference3");
		 String ch4 = ParamUtil.getString(actionRequest, "preference4");
		 String ch5 = ParamUtil.getString(actionRequest, "preference5");
		 String ch6 = ParamUtil.getString(actionRequest, "mpreference1");
		 String ch7 = ParamUtil.getString(actionRequest, "mpreference2");
		 String ch8 = ParamUtil.getString(actionRequest, "mpreference3");
		 String ch9 = ParamUtil.getString(actionRequest, "mpreference4");
		 String ch10 = ParamUtil.getString(actionRequest, "mpreference5");
		
		/*String folder = getInitParameter("uploadFolder");
		if(folder ==null || "".equalsIgnoreCase(folder)){
		fileUpload(actionRequest,folder);
		}*/
		
		Projectdetail project = null;
		long projectId = ParamUtil.getLong(actionRequest, "projectId");
		if (projectId > 0L) {
		try {
		project = ProjectdetailLocalServiceUtil.getProjectdetail(projectId);
		} catch (PortalException e) {
		e.printStackTrace();
		} catch (SystemException e) {
		e.printStackTrace();
		}
		} else {
		project = new ProjectdetailImpl();
		}
		
		
		// set UI fields
		project.setProjectTitle(projectTitle);
		project.setProjectdescription(projectdescription);
		project.setProjectrequiredskill(requiredskill);
		project.setContact(contact);
		project.setStatus(status);
		project.setLink(link);
		project.setPrefer1(ch1);
		project.setPrefer2(ch2);
		project.setPrefer3(ch3);
		project.setPrefer4(ch4);
		project.setPrefer5(ch5);
		project.setMprefer1(ch6);
		project.setMprefer2(ch7);
		project.setMprefer3(ch8);
		project.setMprefer4(ch9);
		project.setMprefer5(ch10);
		
		project.setPhonenumber(phone);
		project.setEmail(email);
		
		if (projectId > 0L) {
		modifyproject(project);
		} else {
		addproject(project);
		}
		
		
		}
		
		private void addproject(Projectdetail project)
		{
		// set primary key
		long projectID = 0L;
		try
		{
		projectID =
		CounterLocalServiceUtil.increment(
		this.getClass().getName());
		}
		catch (SystemException e)
		{
		e.printStackTrace();
		}
		project.setProjectID(projectID);
		// set audit field(s)
		project.setDateAdded(new Date());
		project.setDateModified(new Date());
		
		// insert the project using persistence api
		try
		{
		ProjectdetailLocalServiceUtil.addProjectdetail(project);
		} catch (SystemException e)
		{
		e.printStackTrace();
		}
		}
		
		private void modifyproject(Projectdetail project) {
		
		project.setDateModified(new Date());
		
		try {
		ProjectdetailLocalServiceUtil.updateProjectdetail(project);
		} catch (SystemException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
		
		public void saveproject(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {

		System.out.println("Saving data");
		 
		String prjtitle = ParamUtil.getString(actionRequest,"projectTitle");
		String prjdesc = ParamUtil.getString(actionRequest,"projectdescription");
		String prjsponsor = ParamUtil.getString(actionRequest,"sponsor");
		String prjcontact = ParamUtil.getString(actionRequest,"contact");
		System.out.println(prjtitle);
		/*actionRequest.setAttribute("prjtitle", prjtitle);
		actionRequest.setAttribute("prjdesc", prjdesc);
		actionRequest.setAttribute("prjsponsor", prjsponsor);
		actionRequest.setAttribute("prjcontact", prjcontact);
		actionResponse.setRenderParameter("jspPage", "/html/addproject/reqskill.jsp");*/
		
		PortletURL redirectURL = null;
		String redirectJSP = "/html/addproject/reqskill.jsp";
		
		
		
		String portletName = (String)actionRequest.getAttribute(WebKeys.PORTLET_ID);
	        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
	        redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest),
	                portletName, themeDisplay.getLayout().getPlid(), PortletRequest.RENDER_PHASE);
	        System.out.println(redirectURL);
			redirectURL.setParameter("projectTitle", prjtitle);
			redirectURL.setParameter("projectDescription", prjdesc);
			redirectURL.setParameter("projectSponsor", prjsponsor);
			redirectURL.setParameter("projectContact", prjcontact);	
	        redirectURL.setParameter("jspPage", redirectJSP);
		
		System.out.println("Checking ");
		
		actionResponse.sendRedirect(redirectURL.toString());	
		
		}
		
		public void deleteProject(ActionRequest actionRequest,
		            ActionResponse actionResponse) throws IOException, PortletException
		    {
		
		    long projectId = ParamUtil.getLong(actionRequest, "projectID");
		    
		   		    
		   /*String status = ParamUtil.getString(actionRequest, "status");
		    //int st = integer.ParseInt(status);
		    //if(st == 2 || status == 3 || status == 4){
				//SessionErrors.add(actionRequest, "Cant Delete");
		    if(status == "In Progress" || status == "Finished" || status == "Scrapped")
		    		SessionErrors.add(actionRequest, "Cant Delete");
		    */
		   
		    if (projectId > 0L) {
		            try {
		            	Projectdetail project = ProjectdetailLocalServiceUtil.getProjectdetail(projectId);
		            	String status = project.getStatus();
                                System.out.println("status = "+ status);
                                if(status == "Scrapped" || status == "In Progress" || status == "Finished"){
                                SessionErrors.add(actionRequest, "Cant Delete");
                                 }	
		             ProjectdetailLocalServiceUtil.deleteProjectdetail(projectId);
		             
		            } catch (PortalException e) {
		                    // TODO Auto-generated catch block
		                    e.printStackTrace();
		            } catch (SystemException e) {
		                    // TODO Auto-generated catch block
		                    e.printStackTrace();
		            }
		    }
		   
		    //gracefully redirecting to the default portlet view
		    String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
		    actionResponse.sendRedirect(redirectURL);
		}

		public void fileUpload(ActionRequest actionRequest, String folder)
		{
		String realPath = "C:/liferay-portal-tomcat-6.1.1-ce-ga2/liferay-portal-6.1.1-ce-ga2/tomcat-7.0.27/webapps/AddProject-portlet/";
		Log logger = LogFactory.getLog("C://abc.log");
		logger.info("RealPath" + realPath + " UploadFolder :" + folder);
		        try {
           logger.info("Siamo nel try");
            UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
        System.out.println("Size: "+uploadRequest.getSize("fileName"));

        if (uploadRequest.getSize("fileName")==0) {
            SessionErrors.add(actionRequest, "error");
        }

            String sourceFileName = uploadRequest.getFileName("fileName");
            File file = uploadRequest.getFile("fileName");

            logger.info("Nome file:" + uploadRequest.getFileName("fileName"));
            File newFile = null;
            newFile = new File(folder + sourceFileName);
            logger.info("New file name: " + newFile.getName());
            logger.info("New file path: " + newFile.getPath());

            InputStream in = new BufferedInputStream(uploadRequest.getFileAsStream("fileName"));
            FileInputStream fis = new FileInputStream(file);
           FileOutputStream fos = new FileOutputStream(newFile);

            byte[] bytes_ = FileUtil.getBytes(in);
            int i = fis.read(bytes_);

            while (i != -1) {
                fos.write(bytes_, 0, i);
                i = fis.read(bytes_);
            }
            fis.close();
            fos.close();
            Float size = (float) newFile.length();
            System.out.println("file size bytes:" + size);
            System.out.println("file size Mb:" + size / 1048576);

            logger.info("File created: " + newFile.getName());
            SessionMessages.add(actionRequest, "success");

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            e.printStackTrace();
            SessionMessages.add(actionRequest, "error");
        } catch (NullPointerException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
            SessionMessages.add(actionRequest, "error");
        }

        catch (IOException e1) {
            System.out.println("Error Reading The File.");
            SessionMessages.add(actionRequest, "error");
            e1.printStackTrace();
        }
		
}
		
		/*public void uploadFile(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException
		{
		}
		}*/
		
		 
		
}

