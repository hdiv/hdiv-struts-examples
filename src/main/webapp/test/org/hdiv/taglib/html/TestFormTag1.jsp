<%@page import="junit.framework.Assert"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="org.apache.oro.text.perl.Perl5Util"%>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>


<logic:equal name="runTest" value="testFormAction">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="post" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>">
		</form>
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testFormActionEnctype">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" enctype="multipart/form-data">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="post" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>" enctype="multipart/form-data">
		</form>
	</bean:define>
</logic:equal>
 
<logic:equal name="runTest" value="testFormActionAcceptCharset">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" acceptCharset="UTF-8">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="post" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>" accept-charset="UTF-8">
		</form>
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testFormActionFocus">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" focus="string">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="post" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>">
		</form>
<script type="text/javascript" language="JavaScript">
  <!--
  var focusControl = document.forms["testFormBean"].elements["string"];

  if (focusControl.type != "hidden" && !focusControl.disabled && focusControl.style.display != "none") {
     focusControl.focus();
  }
  // -->
</script>
	</bean:define>
</logic:equal>
 

<logic:equal name="runTest" value="testFormActionFocusIndexed">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" focus="stringIndexed" focusIndex="2">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="post" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>">
		</form>
<script type="text/javascript" language="JavaScript">
  <!--
  var focusControl = document.forms["testFormBean"].elements["stringIndexed"];

  if (focusControl.type != "hidden" && !focusControl.disabled && focusControl.style.display != "none") {
     focusControl[2].focus();
  }
  // -->
</script>
	</bean:define>
</logic:equal>
 

<logic:equal name="runTest" value="testFormActionMethod1">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="post">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="post" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>">
		</form>
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testFormActionMethod2">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="Post">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="Post" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>">
		</form>
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testFormActionMethod3">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="get">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="get" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>">
		</form>
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testFormActionMethod4">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="Get">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="Get" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>">
		</form>
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testFormActionMethod5">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="GET">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="GET" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>">
		</form>
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testFormActionMethod6">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="misc">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="misc" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>">
		</form>
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testFormActionOnreset">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="misc" onreset="script goes here">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="misc" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>" onreset="script goes here">
		</form>
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testFormActionOnsubmit">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="misc" onsubmit="script goes here">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="misc" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>" onsubmit="script goes here">
		</form>
	</bean:define>
</logic:equal>


<logic:equal name="runTest" value="testFormActionStyle">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="misc" style="style.goes.here">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="misc" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>" style="style.goes.here">
		</form>
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testFormActionStyleClass">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="misc" styleClass="style.goes.here">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="misc" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>" class="style.goes.here">
		</form>
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testFormActionStyleId">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="misc" styleId="id.goes.here">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" id="id.goes.here" method="misc" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>">
		</form>
	</bean:define>
</logic:equal>

<logic:equal name="runTest" value="testFormActionTarget">
	<bean:define id="TEST_RESULTS" toScope="page">
		<html:form action="/testFormTag" method="misc" target="_new">
		</html:form>
	</bean:define>
	<bean:define id="EXPECTED_RESULTS" toScope="page">
		<form name="testFormBean" method="misc" action="<%=response.encodeURL( request.getContextPath() + "/testFormTag.do")%>" target="_new">
		</form>
	</bean:define>
</logic:equal>


<% 
String expected  = (String) pageContext.getAttribute("EXPECTED_RESULTS");
String compareTo = (String) pageContext.getAttribute("TEST_RESULTS");

if ((expected == null) || (expected == null)){
    Assert.fail("An invalid (or mispelled) test on this page was called.  Please verify that you've setup the tests (and spellings) correctly.");
}

Assert.assertEquals(expected, compareTo);
%>
