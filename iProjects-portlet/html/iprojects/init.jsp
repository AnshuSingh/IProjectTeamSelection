<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page import="com.liferay.portal.kernel.util.Validator"%>
<%@ page import="javax.portlet.PortletPreferences"%>
<%@ page import="com.liferay.util.PwdGenerator"%>

<%@page import="java.util.ArrayList"%>
 <%@page import="java.util.HashMap"%>
 <%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.util.*"%>

<%@page import="com.asu.poly.iProjects.model.iProject" %>
<%@page import="com.asu.poly.iProjects.service.iProjectLocalServiceUtil" %>
<%@page import="com.asu.poly.iProjects.model.impl.iProjectImpl" %>
<%@page import="com.asu.poly.iProjects.util.*" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.util.portlet.PortletProps" %>

<portlet:defineObjects />