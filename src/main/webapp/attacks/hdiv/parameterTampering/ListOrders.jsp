<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ page import="org.apache.struts.webapp.examples.attacks.bean.Order" %>

<html:html xhtml="true">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>SQL Injection Example</title>
		<html:base />
		<link rel="stylesheet" type="text/css" href="../../../css/example.css" />
	</head>
	<body>
		<html:link action="/secure/prepareHiddenFieldTampering">
			<html:img src="../../../images/return.gif" width="24" height="24" alt="Return to hidden field tampering page" styleClass="icon" />
		</html:link>
	
		<h1>How to Exploit Hidden Fields</h1>
		<hr noshade="noshade"/>

		<center><font size="4"><b>"My" Orders</b></font></center>
		<table align="center" border="1" cellspacing="2">
			<tr bgcolor="#CCCCCC">
				<td><b>Order ID</b></td>
				<td><b>User ID</b></td>
				<td><b>Order Date</b></td>				
				<td><b>Ship Adress 1</b></td>
				<td><b>Ship Adress 2</b></td>				
				<td><b>Ship City</b></td>
				<td><b>Ship State</b></td>
				<td><b>Ship Zip</b></td>
				<td><b>Ship Country</b></td>
				<td><b>Creadit Card</b></td>
				<td><b>Expiry Date</b></td>
				<td><b>Card type</b></td>
			</tr>
		
			<logic:iterate name="listOrdersForm" property="orderList" id="order" indexId="indice" type="Order">
				<tr align="center"> 
					<td><bean:write name="order" property="orderId"/></td>
					<td><bean:write name="order" property="username"/></td>
					<td><bean:write name="order" property="orderDate"/></td>					
					<td><bean:write name="order" property="shipAddress1"/></td>
					<td><bean:write name="order" property="shipAddress2"/></td>
					<td><bean:write name="order" property="shipCity"/></td>
					<td><bean:write name="order" property="shipState"/></td>
					<td><bean:write name="order" property="shipZip"/></td>
					<td><bean:write name="order" property="shipCountry"/></td>					
					<td><bean:write name="order" property="creditCard"/></td>
					<td><bean:write name="order" property="expiryDate"/></td>
					<td><bean:write name="order" property="cardType"/></td>										
				</tr>
			</logic:iterate>
		</table>	
	</body>
</html:html>