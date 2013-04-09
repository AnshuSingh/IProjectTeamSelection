<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="/html/addproject/init.jsp" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.io.File" %>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@ page import="org.apache.commons.fileupload.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<center><table border="2">
<tr><td><h1>Your files  uploaded </h1></td></tr>
<%
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	if (!isMultipart)
	{
	} 
	else
	{
           FileItemFactory factory = new DiskFileItemFactory();
	   ServletFileUpload upload = new ServletFileUpload(factory);
	   List items = null;
	   try 
           {
		   items = upload.parseRequest(request);
	   } 
           catch (FileUploadException e) 
           {
		   e.printStackTrace();
	   }
	   Iterator itr = items.iterator();
	   while (itr.hasNext()) 
           {
	  	FileItem item = (FileItem) itr.next();
	   	if (item.isFormField()) 
		{
	   	} 
		else 
		{
			try {
				String itemName = item.getName();
				File savedFile = new File(config.getServletContext().getRealPath("/")+"uploadedFiles/"+itemName);
				item.write(savedFile);
				out.println("<tr><td><b>Your file has been saved at the loaction:</b></td></tr><tr><td><b>"+config.getServletContext().getRealPath("/")+"uploadedFiles"+"\\"+itemName+"</td></tr>");
			    } 
			catch (Exception e) 
			{
			   e.printStackTrace();
		   	}
	   	}
	   }
	}
%>
 </table>
 </center>




<h1>List of projects</h1>
<%
int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0, count);

%>

<%
PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("jspPage", "/html/addproject/list.jsp");

PortletURL deleteProjectURL = renderResponse.createActionURL();
deleteProjectURL.setParameter(ActionRequest.ACTION_NAME, "deleteProject");
deleteProjectURL.setParameter("redirectURL", iteratorURL.toString());	

PortletURL editProjectURL = renderResponse.createRenderURL();	
editProjectURL.setParameter("jspPage", "/html/addproject/update.jsp");
%>


<liferay-ui:error key="Cant delete"
message="Can't delete once started" ></liferay-ui:error>


<table border="1" width="90%" >
<tr>
<th align="center" style="display:none"> Project id</th>
<th align="center">Project Title</th>
<th align="center">Project Description</th>
<th align="center">Sponsor</th>
<!--<th align="center">Required Skills</th>-->
<th align="center">Contact</th>
<th align="center"> Delete </th>
<th align="center"> Edit </th>
<th align="center"> Status </th>
</tr>
<%
for (Projectdetail project : projects) {
%>
<tr>
<td style="display:none"><%= project.getProjectID() %></td>
<td><%= project.getProjectTitle() %></td>
<td><%= project.getProjectdescription() %></td>
<td><%= project.getSponsor() %></td>
<!--<td><%= project.getProjectrequiredskill() %> </td>-->
<td><%= project.getContact() %></td>
<td><%= project.getStatus() %></td>
<% deleteProjectURL.setParameter("projectID", String.valueOf(project.getProjectID())); %>
<td>
<a href="<%= deleteProjectURL.toString() %>">Delete &raquo;</a>
</td>
<% editProjectURL.setParameter("projectID", String.valueOf(project.getProjectID())); %>
<td>
<a href="<%= editProjectURL.toString() %>">Edit &raquo;</a>
</td>

</tr>
<%
}
%>
</table>

<br/><a href="<portlet:renderURL/>">&laquo;Back</a>
 
