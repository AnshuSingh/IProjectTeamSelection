<%@ include file="/html/student/init.jsp" %>


<script type="text/javascript" language="javascript">
 document.redirect.submit();
</script>
<h1>Student Availability</h1>
<%
PortletURL studentAvailabilityURL = renderResponse.createActionURL();
studentAvailabilityURL.setParameter("jspPage", "/html/student/skillsForm1.jsp");
%>

<form name="redirect" method="POST" action="<%=studentAvailabilityURL.toString() %>">
		<table border="1" style="width: 800px;">
			<tbody>
				<tr>
					<td>&nbsp;</td>
					<td>8:00 -9:00</td>
					<td>9:00 - 10:00</td>
					<td>10:00 - 11:00</td>
					<td>11:00 - 12:00</td>
					<td>12:00 - 1:00</td>
					<td>1:00 - 2:00</td>
					<td>2:00 - 3:00</td>
					<td>3:00 - 4:00</td>
					<td>4:00 - 5:00</td>
				</tr>
				<tr>
					<td>Monday</td>
					<td style="text-align: center;">
						<input name="mon8to9" type="checkbox" value="mon8to9" /></td>
					<td style="text-align: center;">
						<input name="mon9to10" type="checkbox" value="mon9to10" /></td>
					<td style="text-align: center;">
						<input name="mon10to11" type="checkbox" value="mon10to11" /></td>
					<td style="text-align: center;">
						<input name="mon11to12" type="checkbox" value="mon11to12" /></td>
					<td style="text-align: center;">
						<input name="mon12to1" type="checkbox" value="mon12to1" /></td>
					<td style="text-align: center;">
						<input name="mon1to2" type="checkbox" value="mon1to2" /></td>
					<td style="text-align: center;">
						<input name="mon2to3" type="checkbox" value="mon2to3" /></td>
					<td style="text-align: center;">
						<input name="mon3to4" type="checkbox" value="mon3to4" /></td>
					<td style="text-align: center;">
						<input name="mon4to5" type="checkbox" value="mon4to5" /></td>
				</tr>
				<tr>
					<td>
						Tuesday</td>
					<td style="text-align: center;">
						<input name="tue8to9" type="checkbox" value="tue8to9" /></td>
					<td style="text-align: center;">
						<input name="tue9to10" type="checkbox" value="tue9to10" /></td>
					<td style="text-align: center;">
						<input name="tue10to11" type="checkbox" value="tue10to11" /></td>
					<td style="text-align: center;">
						<input name="tue11to12" type="checkbox" value="tue11to12" /></td>
					<td style="text-align: center;">
						<input name="tue12to1" type="checkbox" value="tue12to1" /></td>
					<td style="text-align: center;">
						<input name="tue1to2" type="checkbox" value="tue1to2" /></td>
					<td style="text-align: center;">
						<input name="tue2to3" type="checkbox" value="tue2to3" /></td>
					<td style="text-align: center;">
						<input name="tue3to4" type="checkbox" value="tue3to4" /></td>
					<td style="text-align: center;">
						<input name="tue4to5" type="checkbox" value="tue4to5" /></td>
				</tr>
				<tr>
					<td>
						Wednesday</td>
					<td style="text-align: center;">
						<input name="wed8to9" type="checkbox" value="wed8to9" /></td>
					<td style="text-align: center;">
						<input name="wed9to10" type="checkbox" value="wed9to10" /></td>
					<td style="text-align: center;">
						<input name="wed10to11" type="checkbox" value="wed10to11" /></td>
					<td style="text-align: center;">
						<input name="wed11to12" type="checkbox" value="wed11to12" /></td>
					<td style="text-align: center;">
						<input name="wed12to1" type="checkbox" value="wed12to1" /></td>
					<td style="text-align: center;">
						<input name="wed1to2" type="checkbox" value="wed1to2" /></td>
					<td style="text-align: center;">
						<input name="wed2to3" type="checkbox" value="wed2to3" /></td>
					<td style="text-align: center;">
						<input name="wed3to4" type="checkbox" value="wed3to4" /></td>
					<td style="text-align: center;">
						<input name="wed4to5" type="checkbox" value="wed4to5" /></td>
				</tr>
				<tr>
					<td>
						Thursday</td>
					<td style="text-align: center;">
						<input name="thu8to9" type="checkbox" value="thu8to9" /></td>
					<td style="text-align: center;">
						<input name="thu9to10" type="checkbox" value="thu9to10" /></td>
					<td style="text-align: center;">
						<input name="thu10to11" type="checkbox" value="thu10to11" /></td>
					<td style="text-align: center;">
						<input name="thu11to12" type="checkbox" value="thu11to12" /></td>
					<td style="text-align: center;">
						<input name="thu12to1" type="checkbox" value="thu12to1" /></td>
					<td style="text-align: center;">
						<input name="thu1to2" type="checkbox" value="thu1to2" /></td>
					<td style="text-align: center;">
						<input name="thu2to3" type="checkbox" value="thu2to3" /></td>
					<td style="text-align: center;">
						<input name="thu3to4" type="checkbox" value="thu3to4" /></td>
					<td style="text-align: center;">
						<input name="thu4to5" type="checkbox" value="thu4to5" /></td>
				</tr>
				<tr>
					<td>
						Friday</td>
					<td style="text-align: center;">
						<input name="fri8to9" type="checkbox" value="fri8to9" /></td>
					<td style="text-align: center;">
						<input name="fri9to10" type="checkbox" value="fri9to10" /></td>
					<td style="text-align: center;">
						<input name="fri10to11" type="checkbox" value="fri10to11" /></td>
					<td style="text-align: center;">
						<input name="fri11to12" type="checkbox" value="fri11to12" /></td>
					<td style="text-align: center;">
						<input name="fri12to1" type="checkbox" value="fri12to1" /></td>
					<td style="text-align: center;">
						<input name="fri1to2" type="checkbox" value="fri1to2" /></td>
					<td style="text-align: center;">
						<input name="fri2to3" type="checkbox" value="fri2to3" /></td>
					<td style="text-align: center;">
						<input name="fri3to4" type="checkbox" value="fri3to4" /></td>
					<td style="text-align: center;">
						<input name="fri4to5" type="checkbox" value="fri4to5" /></td>
				</tr>
				<tr>
					<td>
						Saturday</td>
					<td style="text-align: center;">
						<input name="sat8to9" type="checkbox" value="sat8to9" /></td>
					<td style="text-align: center;">
						<input name="sat9to10" type="checkbox" value="sat9to10" /></td>
					<td style="text-align: center;">
						<input name="sat10to11" type="checkbox" value="sat10to11" /></td>
					<td style="text-align: center;">
						<input name="sat11to12" type="checkbox" value="sat11to12" /></td>
					<td style="text-align: center;">
						<input name="sat12to1" type="checkbox" value="sat12to1" /></td>
					<td style="text-align: center;">
						<input name="sat1to2" type="checkbox" value="sat1to2" /></td>
					<td style="text-align: center;">
						<input name="sat2to3" type="checkbox" value="sat2to3" /></td>
					<td style="text-align: center;">
						<input name="sat3to4" type="checkbox" value="sat3to4" /></td>
					<td style="text-align: center;">
						<input name="sat4to5" type="checkbox" value="sat4to5" /></td>
				</tr>
				<tr>
					<td>
						Sunday</td>
					<td style="text-align: center;">
						<input name="sun8to9" type="checkbox" value="sun8to9" /></td>
					<td style="text-align: center;">
						<input name="sun9to10" type="checkbox" value="sun9to10" /></td>
					<td style="text-align: center;">
						<input name="sun10to11" type="checkbox" value="sun10to11" /></td>
					<td style="text-align: center;">
						<input name="sun11to12" type="checkbox" value="sun11to12" /></td>
					<td style="text-align: center;">
						<input name="sun12to1" type="checkbox" value="sun12to1" /></td>
					<td style="text-align: center;">
						<input name="sun1to2" type="checkbox" value="sun1to2" /></td>
					<td style="text-align: center;">
						<input name="sun2to3" type="checkbox" value="sun2to3" /></td>
					<td style="text-align: center;">
						<input name="sun3to4" type="checkbox" value="sun3to4" /></td>
					<td style="text-align: center;">
						<input name="sun4to5" type="checkbox" value="sun4to5" /></td>
				</tr>
			</tbody>
		</table>
	
<br/><input type="submit" value="Next" />
</form>

<a href="<portlet:renderURL/>">&laquo; Go Back</a>
</html>
