<%@ page contentType="text/html; charset=ISO-8859-1" language="java" errorPage="" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ page import="org.apache.struts.webapp.examples.attacks.bean.Account" %>
 
<html:html xhtml="true">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>SQL Injection Example</title>
		<html:base />
		<link rel="stylesheet" type="text/css" href="../../../css/example.css" />
	</head>
	<body>
		<html:link action="/secure/prepareSQLInjection">
			<html:img src="../../../images/return.gif" width="24" height="24" alt="Return to SQL String Injection page" styleClass="icon" />
		</html:link>
	
		<h1>User account</h1>
		<hr noshade="noshade"/>
			
		<table align="center" border="1" cellspacing="2">
			<tr bgcolor="#CCCCCC">
				<td><b>Account</b></td>
				<td><b>email</b></td>
				<td><b>First Name</b></td>
				<td><b>Last Name</b></td>
				<td><b>Status</b></td>
				<td><b>Adress 1</b></td>
				<td><b>Adress 2</b></td>
				<td><b>City</b></td>
				<td><b>State</b></td>
				<td><b>Zip</b></td>
				<td><b>Country</b></td>
				<td><b>Phone</b></td>
			</tr>		
			
			<logic:iterate name="sqlStringInjectionForm" property="userAccounts" id="account" indexId="indice" type="Account">
				<tr align="center"> 
					<td><bean:write name="account" property="userId"/></td>			
					<td><bean:write name="account" property="email"/></td>			
					<td><bean:write name="account" property="firstName"/></td>
					<td><bean:write name="account" property="lastName"/></td>					
					<td><bean:write name="account" property="status"/></td>
					<td><bean:write name="account" property="address1"/></td>
					<td><bean:write name="account" property="address2"/></td>
					<td><bean:write name="account" property="city"/></td>
					<td><bean:write name="account" property="state"/></td>
					<td><bean:write name="account" property="zip"/></td>
					<td><bean:write name="account" property="country"/></td>
					<td><bean:write name="account" property="phone"/></td>										
				</tr>
			</logic:iterate>
		</table>	
	</body>
</html:html>