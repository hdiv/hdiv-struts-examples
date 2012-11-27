<%@ taglib uri="/tags/struts-html" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta name="generator" content="HTML Tidy for Windows (vers 1st July 2003), see www.w3.org" />

  <title>Struts Test Application</title>
</head>

<body bgcolor="white">
  <div align="center">
    <h1>Struts Taglib Exercises (test pages)</h1>
  </div>

  <h3>BEAN Tags</h3>

  <ul>
    <li><html:link href="bean-cookie.jsp">&lt;bean:cookie&gt;</html:link></li>

    <li><html:link href="bean-define.jsp">&lt;bean:define&gt;</html:link></li>

    <li><html:link href="bean-header.jsp">&lt;bean:header&gt;</html:link></li>

    <li><html:link href="bean-include.jsp">&lt;bean:include&gt;</html:link></li>

    <li>&lt;bean:page&gt; [:TODO:]</li>

    <li><html:link href="bean-parameter.jsp?param1=value1&amp;param2=value2">&lt;bean:parameter&gt;</html:link></li>

    <li><html:link href="bean-resource.jsp">&lt;bean:resource&gt;</html:link></li>

    <li><html:link href="bean-size.jsp">&lt;bean:size&gt;</html:link></li>

    <li>&lt;bean:struts&gt; [:TODO:]</li>

    <li><html:link href="bean-write.jsp">&lt;bean:write&gt;</html:link></li>

  </ul>

  <h3>HTML Tags</h3>

  <ul>
    <li><html:link href="html-cancel.do">&lt;html:cancel&gt;</html:link></li>

    <li><html:link href="html-img.do">&lt;html:img&gt;</html:link></li>

    <li><html:link href="html-link.do">&lt;html:link&gt;</html:link></li>

    <li><html:link href="html-multibox.do">&lt;html:multibox&gt;</html:link></li>

    <li>&lt;html:rewrite&gt; [:TODO:]</li>

    <li><html:link href="html-select.do">&lt;html:select&gt;</html:link></li>

    <li><html:link href="html-setters.do">Scalar Setters</html:link></li>

    <li><html:link href="html-messages.do">Errors and Messages</html:link></li>

    <li>Other html tags [:TODO:]</li>

  </ul>

  <h3>LOGIC Tags</h3>

  <ul>
    <li><html:link href="logic-compare.jsp">Comparison Tags</html:link></li>

    <li><html:link href="logic-compare-numeric.jsp">Comparison Tags (Numeric)</html:link></li>

    <li><html:link href="logic-empty.jsp">Emptiness Tags</html:link></li>

    <li><html:link href="logic-forward.do">&lt;logic:forward&gt; and &lt;logic:redirect&gt; Tags</html:link></li>

    <li><html:link href="logic-iterate.jsp">Iterate Tag</html:link></li>

    <li><html:link href="logic-match.jsp?param1=value1">Match Tags</html:link></li>

    <li><html:link href="logic-present.jsp?param1=value1">Presence Tags</html:link></li>
  </ul>

  <h3>NESTED Tags</h3>

  <p>[:TODO:]</p>

  <h3>Other tests</h3>

  <ul>
    <li><html:link href="forward-redirect-default.do">Use an ActionForward to redirect to the default page for the application ("/")</html:link></li>
    <li><html:link href="forward-redirect-default-module.do">Use an ActionForward to redirect to the default page for this module ("/$module/")</html:link></li>
    <li><html:link href="forward-redirect-path.do">Use an ActionForward to redirect another path ("/html-link.do")</html:link></li>
  </ul>

</body>
</html>
