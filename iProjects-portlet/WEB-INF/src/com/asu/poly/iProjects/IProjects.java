package com.asu.poly.iProjects;

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
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.asu.poly.iProjects.model.iProject;
import com.asu.poly.iProjects.model.impl.iProjectImpl;
import com.asu.poly.iProjects.service.iProjectLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class IProjects
 */
public class IProjects extends MVCPortlet {
	
	
	
	
	public void updateproject(ActionRequest actionRequest,ActionResponse actionResponse)
			throws IOException, PortletException
	{	
			System.out.println("Reahed update ." );
			String projectTitle = ParamUtil.getString(actionRequest, "projectTitle");
			String projectdescription = ParamUtil.getString(actionRequest, "projectdescription");
			String sponsor = ParamUtil.getString(actionRequest, "sponsor");
			String contact = ParamUtil.getString(actionRequest, "contact");
			String [] dept = ParamUtil.getParameterValues(actionRequest, "department");
			String status = ParamUtil.getString(actionRequest, "status");
			String link = ParamUtil.getString(actionRequest, "link");
			
			
			
			//String folder = getInitParameter("uploadFolder");
			//if(folder ==null || "".equalsIgnoreCase(folder)){
			//fileUpload(actionRequest,folder);
			//}
			System.out.println("Reahed link ." + projectTitle+contact+sponsor+link);
			iProject project = null;
			long projectId = ParamUtil.getLong(actionRequest, "projectId");
			if (projectId > 0L) {
				try {
					project = iProjectLocalServiceUtil.getiProject(projectId);
					} catch (PortalException e) {
						e.printStackTrace();
					} catch (SystemException e) {
						e.printStackTrace();
					}
			} else {
				project = new iProjectImpl();
			}
			System.out.println("Reahed project.");
			
			// set UI fields
			project.setProjectTitle(projectTitle);
			project.setProjectdescription(projectdescription);
			//project.setRequiredSkills(requiredskill);
			project.setContact(contact);
			project.setStatus(status);
			project.setSponsor(sponsor);
			project.setLink(link);
			
			String csvDept="",csvSkills ="";
			String [] requiredskill =null;
			if (dept!=null){
				for(String strDept :dept){
					csvDept = strDept+","+csvDept;
					requiredskill = ParamUtil.getParameterValues(actionRequest, strDept);
					for ( String strSkills: requiredskill)
						csvSkills = strSkills + ","+ csvSkills;
					System.out.println("dept >>>> "+ strDept);
					System.out.println("dept >>>> "+ csvSkills);
				}
			}
			System.out.println("csv"+csvDept);
			project.setDepartments(csvDept);
			project.setRequiredSkills(csvSkills);
			System.out.println("Reahed roject.setLink(link);");
			if (projectId > 0L) {
				modifyproject(project);
			
			} else {
				addproject(project);
			}
			System.out.println("addproject(project);");
		}
		
		private void addproject(iProject project)
		{
			// set primary key
			long projectID = 0L;
			try
			{
				projectID = CounterLocalServiceUtil.increment(this.getClass().getName());
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
			iProjectLocalServiceUtil.addiProject(project);
			} catch (SystemException e)
			{
			e.printStackTrace();
			}
			System.out.println("addproject(project2);");
		}
		
		private void modifyproject(iProject project) {
		
		project.setDateModified(new Date());
		
		try {
		iProjectLocalServiceUtil.updateiProject(project);
		} catch (SystemException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
		
		
		public void saveproject(ActionRequest actionRequest,
				ActionResponse actionResponse) throws IOException, PortletException {

			System.out.println("Saving data");
			/*
			final PortletSession portletSession = actionRequest.getPortletSession();
			 portletSession.setAttribute("password", "authenticated", PortletSession.APPLICATION_SCOPE);
			 Object name= (String)[color=#f45050] PortletSession[/color].getAttribute("password");
			 System.out.println("Value of Pwd Session : "+ name);
			 */
			String prjtitle = ParamUtil.getString(actionRequest,"projectTitle");
			String prjdesc = ParamUtil.getString(actionRequest,"projectdescription");
			String prjsponsor = ParamUtil.getString(actionRequest,"sponsor");
			String prjcontact = ParamUtil.getString(actionRequest,"contact");
			String phone = ParamUtil.getString(actionRequest,"phone");
			String email = ParamUtil.getString(actionRequest,"email");
			String status = ParamUtil.getString(actionRequest,"status");
			System.out.println(prjtitle);
			
			
			PortletURL redirectURL = null;
			String redirectJSP = "/html/iprojects/reqskill.jsp";
			
			if(prjtitle != null)
			{
				String portletName = (String)actionRequest.getAttribute(WebKeys.PORTLET_ID);
		        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		        redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest),
		                portletName, themeDisplay.getLayout().getPlid(), PortletRequest.RENDER_PHASE);
		        System.out.println(redirectURL);
				redirectURL.setParameter("projectTitle", prjtitle);
				redirectURL.setParameter("projectDescription", prjdesc);
				redirectURL.setParameter("projectSponsor", prjsponsor);
				redirectURL.setParameter("projectContact", prjcontact);	
				redirectURL.setParameter("projectContact", phone);	
				redirectURL.setParameter("projectContact", email);
				redirectURL.setParameter("status", status);
		        redirectURL.setParameter("jspPage", redirectJSP);
		        actionResponse.sendRedirect(redirectURL.toString());
			}
			System.out.println("Checking ");
			System.out.println("redirecting");
			actionResponse.sendRedirect(redirectURL.toString());
			
			System.out.println("redirecting1");
		}
		
		
		public void deleteProject(ActionRequest actionRequest,
		            ActionResponse actionResponse) throws IOException, PortletException
		    {
		
			
		    long projectId = ParamUtil.getLong(actionRequest, "projectID");
		   		   
		    if (projectId > 0L) {
		            try {
		            	iProject project = iProjectLocalServiceUtil.getiProject(projectId);
		            	String status = project.getStatus();
		    			System.out.println("status = "+ status);
		    			if(status == "Scrapped" || status == "In Progress" || status == "Finished"){
		    				System.out.println("Project can be deleted");
		    				SessionErrors.add(actionRequest, "CantDelete");
		    				return;
		    			}
		             iProjectLocalServiceUtil.deleteiProject(projectId);
		            } catch (PortalException e) {
		                    // TODO Auto-generated catch block
		                    e.printStackTrace();
		            } catch (SystemException e) {
		                    // TODO Auto-generated catch block
		                    e.printStackTrace();
		            }
		    }
		   
		    
		}

		/*public void fileUpload(ActionRequest actionRequest, String folder)
		 * //gracefully redirecting to the default portlet view
		    String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
		    actionResponse.sendRedirect(redirectURL);
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
		
}*/
		
		/*public void uploadFile(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException
		{
		}
		}*/
		
		 
		
}

