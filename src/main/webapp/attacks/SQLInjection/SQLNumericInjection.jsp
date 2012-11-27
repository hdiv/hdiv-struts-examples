<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html xhtml="true">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>SQL Injection Example</title>
		<html:base />
		<link rel="stylesheet" type="text/css" href="../../css/example.css" />
	</head>
	<body>
		<html:link action="/attacks">
			<html:img src="../../images/return.gif" width="24" height="24" alt="Return to examples page" styleClass="icon" />
		</html:link>
	
		<h1>How to perform Numeric SQL Injection</h1>
		<hr noshade="noshade"/>
		<p><b>General Goal(s):</b></p>
		<p>The form below allows a user to view the pets that belong to a certain category.</p> 
		<p>Try to inject a SQL string that results in all the pets of any category. To do this, 
		you must modify the category parameter of the post request and set it to: <b>BIRDS' or 
		category='CATS' or category='DOGS' or category='FISH' or category='REPTILES</b></p>

		<html:form action="/processSQLNumericInjection">
			<p>Select a category:		
				<html:select property="category">
					<html:options name="categories" />
				</html:select>
				<br>
		    </p>
			<html:submit value="View Pets" />

		</html:form>
	</body>
</html:html>