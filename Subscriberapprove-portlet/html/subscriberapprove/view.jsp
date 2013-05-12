<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:renderURL var="listUSerURL">
<portlet:param name="jspPage" value="/html/subscriberapprove/subscriberlist.jsp"/>
</portlet:renderURL>
<h1> Subscriber Approval</h1>
<br/>
<br/>

<br/><a href="<%= listUSerURL %>">Please approve the subscribers &raquo;</a>