<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="junit.framework.Assert"%>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<logic:equal name="runTest" value="testMultiboxBodyPropertyTrue">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked">
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueAccesskey">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" accesskey="a">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" accesskey="a" value="value1" checked="checked">
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueAlt">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" alt="Testing alt attribute">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" alt="Testing alt attribute">
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueAltKey1">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" altKey="default.bundle.message">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" alt="Testing Message">
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueAltKey2">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" altKey="no.such.key">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked">
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueAltKey1_fr">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" altKey="default.bundle.message">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" alt="Message D'Essai">
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueAltKey2_fr">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" altKey="no.such.key">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked">
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueDisabled_True">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" disabled="true">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" disabled="disabled">
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueDisabled_False1">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" disabled="false">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked">
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueDisabled_False2">
	<!--  This was changed recently by overwhelming consensus.  The prior functionality
	      was very counter-intuitive.  It used to be that putting disabled="false"
	      was the same as putting disabled="true".  Craig sited the confusion is due
	      to the HTML spec.
	-->
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" disabled="anything but true">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked">
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnblur">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onblur="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onblur="Put script here">
	</bean:define>
</logic:equal>



<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnchange">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onchange="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onchange="Put script here">
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnclick">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onclick="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onclick="Put script here">
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOndblclick">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" ondblclick="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" ondblclick="Put script here">
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnfocus">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onfocus="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onfocus="Put script here">
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnkeydown">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onkeydown="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onkeydown="Put script here">
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnkeypress">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onkeypress="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onkeypress="Put script here">
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnkeyup">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onkeyup="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onkeyup="Put script here">
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnmousedown">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onmousedown="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onmousedown="Put script here">
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnmousemove">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onmousemove="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onmousemove="Put script here">
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnmouseout">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onmouseout="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onmouseout="Put script here">
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnmouseover">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onmouseover="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onmouseover="Put script here">
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testMultiboxBodyPropertyTrueOnmouseup">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:multibox property="stringArray" onmouseup="Put script here">
		value1
		</html:multibox>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<input type="checkbox" name="stringArray" value="value1" checked="checked" onmouseup="Put script here">
	</bean:define>
</logic:equal>


<%
String expected = "";
String compareTo = "";

if (pageContext.getAttribute("EXPECTED_RESULTS") == null){
    throw new javax.servlet.jsp.JspException("No tests on this page were called.  Please verify that you've setup the tests correctly.");
}else{
	expected=pageContext.getAttribute("EXPECTED_RESULTS").toString();
}
if (pageContext.getAttribute("TEST_RESULTS") != null){
	compareTo=pageContext.getAttribute("TEST_RESULTS").toString();
}

Assert.assertEquals(expected, compareTo);
%>
