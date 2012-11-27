<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<html:html xhtml="true">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Vulnerable Section</title>
		<html:base />
		<link rel="stylesheet" type="text/css" href="../css/example.css" />
	</head>
	<body>
		<html:link href="../welcome.do">
			<html:img src="../images/return.gif" width="24" height="24" alt="Return to examples page" styleClass="icon" />
		</html:link>
	
		<h1>Vulnerable Section</h1>
		<hr noshade="noshade"/>

		<!--  Injection Flaws examples -->		
		<jsp:include page="SQLInjection/SQLInjection.html" /><br />
		<html:link action="/prepareSQLInjection">
		  <img src="../images/execute.gif" alt="" hspace="4" border="0"  align="top" class="inline" />
		</html:link>
		<html:link href="../attacks/unsecure/prepareSQLInjection.do">How to perform String SQL Injection</html:link><br />

		<!--  Parameter Tampering examples -->
		<jsp:include page="parameterTampering/ParameterTampering.html" /><br>
		<html:link action="/prepareHiddenFieldTampering">
		  <img src="../images/execute.gif" alt="" hspace="4" border="0"  align="top" class="inline" />
		</html:link>		
		<html:link href="../attacks/unsecure/prepareHiddenFieldTampering.do">How to Exploit Hidden Fields</html:link><br />

		<!--  Cross Site Scripting (XSS) -->
		<jsp:include page="xss/XSS.html" /><br>
		<html:link action="/prepareXSS">
		  <img src="../images/execute.gif" alt="" hspace="4" border="0"  align="top" class="inline" />
		</html:link>			
		<html:link href="../attacks/unsecure/prepareXSS.do">How to Perform Cross Site Scripting (XSS)</html:link><br />
	
	</body>
</html:html>