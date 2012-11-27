<%@ taglib uri="/tags/struts-html" prefix="html" %>
<html>
  <head>
    <title>Test struts-html:img Tag</title>
  </head>
  <body>
    <div align="center">
      <h1>Test struts-html:img Tag</h1>
    </div>
        <table border="1" cellspacing="2" cellpadding="4" align="center">
        <tr>
            <td>Standard image tag</td>
            <td>
                <input type="image" src="struts-power.gif">
            </td>
        </tr>
        <tr>
            <td>Struts image tag via page attribute</td>
            <td>
                <html:image page="/struts-power.gif" />
            </td>
        </tr>
        <tr>
            <td>Struts image tag via page attribute, current module</td>
            <td>
                <html:image page="/struts-power.gif"/>
            </td>
         </tr>
         <tr>
            <td>Struts image tag via page attribute, default module</td>
            <td>
                <html:image page="/struts-power.gif" module="/exercise"/>
            </td>
         </tr>
  </body>
</html>
