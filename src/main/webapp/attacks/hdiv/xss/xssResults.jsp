<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<html:html xhtml="true">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>XSS Example</title>
		<html:base />
		<link rel="stylesheet" type="text/css" href="../../../css/example.css" />
	</head>
	<body>
		<html:link action="/secure/attacks"> 
			<html:img src="../../../images/return.gif" width="24" height="24"
				alt="Return to examples page" styleClass="icon" />
			</html:link>
		<h1>XSS Results</h1>
		<hr noshade="noshade" />
		 
		<p><strong>You wrote this message:</strong></p>
		<p><bean:write name="xssForm" property="message" filter="true" /></p>
		<p><b>This vulnerability have been resolved using Struts custom tags.</b></p>
	</body>
</html:html>
