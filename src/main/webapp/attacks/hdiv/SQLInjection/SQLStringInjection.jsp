<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<html:html xhtml="true">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>SQL Injection Example</title>
		<html:base />
		<link rel="stylesheet" type="text/css" href="../../../css/example.css" />
	</head>
	<body> 
		<html:link action="/secure/attacks">
			<html:img src="../../../images/return.gif" width="24" height="24" alt="Return to examples page" styleClass="icon" />
		</html:link>
	
		<h1>How to perform String SQL Injection</h1>
		<hr noshade="noshade"/>

		<p><b>General Goal(s):</b></p>
		The form below allows a user to view account values. Try to inject an SQL string that results 
		in all the accounts being displayed.<br>
		<p>First, you must insert the username <b>ACID</b>. You will only see the data related to the username ACID.</p>
		<p>Then, inserting the value <b>ACID' or '1'='1</b>, HDIV will stop the attack due to non editable data validations defined 
		in the <i>hdiv-validations.xml</i> file.</p>
		<p>
		<html:errors/>
		<html:form action="/secure/processSQLStringInjection">
			<label>Enter your last name:
				<html:text property="account" value="" />
			</label>
			<html:submit value="Go!" />
		</html:form>
		</p>
	</body>
</html:html>