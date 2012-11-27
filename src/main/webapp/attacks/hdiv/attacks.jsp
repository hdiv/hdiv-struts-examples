<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<html:html xhtml="true">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Vulnerable Section resolved by HDIV</title>
		<html:base />
		<link rel="stylesheet" type="text/css" href="../../css/example.css" />
	</head>
	<body>
		<html:link href="../../welcome.do">
			<html:img src="../../images/return.gif" width="24" height="24" alt="Return to examples page" styleClass="icon" />
		</html:link>
	
		<h1>Vulnerable Section resolved by HDIV</h1>
		<hr noshade="noshade"/>

		<!--  Injection Flaws examples -->		
		<jsp:include page="../SQLInjection/SQLInjection.html" /><br />
		<html:link action="/secure/prepareSQLInjection">
		  <img src="../../images/execute.gif" alt="" hspace="4" border="0"  align="top" class="inline" />
		</html:link>
		<html:link href="../../attacks/secure/prepareSQLInjection.do">String SQL Injection resolved by HDIV</html:link><br />

		<!--  Parameter Tampering examples -->
		<jsp:include page="../parameterTampering/ParameterTampering.html" /><br>
		<html:link action="/secure/prepareHiddenFieldTampering">
		  <img src="../../images/execute.gif" alt="" hspace="4" border="0"  align="top" class="inline" />
		</html:link>		
		<html:link href="../../attacks/secure/prepareHiddenFieldTampering.do">Parameter Tampering resolved by HDIV</html:link><br />

		<!--  Cross Site Scripting (XSS) -->
		<jsp:include page="../xss/XSS.html" /><br>
		<html:link action="/secure/prepareXSS">
		  <img src="../../images/execute.gif" alt="" hspace="4" border="0"  align="top" class="inline" />
		</html:link>			
		<html:link href="../../attacks/secure/prepareXSS.do">Cross Site Scripting (XSS) resolved by HDIV</html:link><br />
	
	</body>
</html:html>