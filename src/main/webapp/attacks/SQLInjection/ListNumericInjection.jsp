<%@ page contentType="text/html; charset=ISO-8859-1" language="java"
	errorPage=""%>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page import="org.apache.struts.webapp.examples.attacks.bean.Product" %>

<html:html xhtml="true">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>SQL Injection Example</title>
<html:base />
<link rel="stylesheet" type="text/css" href="../../css/example.css" />
</head>
<body>
	<html:link action="/prepareSQLNumericInjection">
		<html:img src="../../images/return.gif" width="24" height="24"
			alt="Return to SQL Numeric Injection page" styleClass="icon" />
	</html:link>
	
	<h1>User account</h1>
	<hr noshade="true" />
	
	<table align="center" border="1" cellspacing="2">
		<tr bgcolor="#CCCCCC">
			<td><b>Product</b></td>
			<td><b>Category</b></td>
			<td><b>Name</b></td>
			<td><b>Description</b></td>
		</tr>
	
		<logic:iterate name="sqlNumericInjectionForm" property="products"
			id="product" indexId="indice" type="Product">
			<tr align="center">
				<td><bean:write name="product" property="productId" /></td>
				<td><bean:write name="product" property="categoryId" /></td>
				<td><bean:write name="product" property="name" /></td>
				<td><bean:write name="product" property="description" /></td>
			</tr>
		</logic:iterate>
	</table>
</body>
</html:html>
