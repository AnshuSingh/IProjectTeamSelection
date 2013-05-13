<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@ page import="com.asu.poly.iProjects.teams.model.Team" %>
<%@ page import="com.asu.poly.iProjects.teams.model.impl.TeamImpl" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.asu.poly.iProjects.teams.service.TeamLocalServiceUtil" %>
<%@ page import="com.asu.poly.iProjects.model.iProject" %>
<%@page import="com.asu.poly.iProjects.service.iProjectLocalServiceUtil"%>

<%@ page import="com.asu.poly.iProjects.teams.model.Faculty" %>
<%@ page import="com.asu.poly.iProjects.teams.service.FacultyLocalServiceUtil" %>

<portlet:defineObjects />