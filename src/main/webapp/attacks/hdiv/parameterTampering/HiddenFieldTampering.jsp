<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<html:html xhtml="true">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Parameter Tampering Example</title>
		<html:base />
		<link rel="stylesheet" type="text/css" href="../../../css/example.css" />
	</head>
	<body>
		<html:link action="/secure/attacks">
			<html:img src="../../../images/return.gif" width="24" height="24" alt="Return to examples page" styleClass="icon" />
		</html:link>
	
		<h1>How to Exploit Hidden Fields</h1>
		<hr noshade="noshade"/>

		<p><b>General Goal(s):</b></p>
		<p>The user will be able to exploit a hidden field to obtain all users' orders.</p>
		<p>First, by clicking in the 'View Orders' button you will visualize all the orders 
		of the <b>j2ee</b> user.</p>
		<p>Then, you have to set the username parameter to the following value when you post 
		the form: <b>ACID</b>. HDIV will stop the attack due to non editable data validations 
		defined in the <i>hdiv-validations.xml</i> file.</p>

		<html:form action="/secure/processListOrders">
			<html:hidden property="username" value="j2ee" />
			<br />
			<html:submit value="View Orders" />
		</html:form>
	</body>
</html:html>