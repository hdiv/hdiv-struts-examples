/*
 * Copyright 2004-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hdiv.taglib.html;

import java.util.Locale;

import javax.servlet.jsp.PageContext;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.cactus.JspTestCase;
import org.apache.struts.Globals;
import org.apache.struts.taglib.html.Constants;
import org.hdiv.taglib.SimpleBeanForTesting;

/**
 * Suite of unit tests for the <code>org.hdiv.taglib.html.LinkTagHDIV</code> class.
 */
public class LinkTag2Test extends JspTestCase {

	/**
	 * Defines the testcase name for JUnit.
	 * 
	 * @param theName the testcase's name.
	 */
	public LinkTag2Test(String theName) {
		super(theName);
	}

	/**
	 * Start the tests.
	 * 
	 * @param theArgs the arguments. Not used
	 */
	public static void main(String[] theArgs) {
		junit.awtui.TestRunner.main(new String[] { LinkTag2Test.class.getName() });
	}

	/**
	 * @return a test suite (<code>TestSuite</code>) that includes all methods
	 *         starting with "test"
	 */
	public static Test suite() {
		// All methods starting with "test" will be executed in the test suite.
		return new TestSuite(LinkTag2Test.class);
	}

	private void runMyTest(String whichTest, String locale) {

		pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale),
									PageContext.SESSION_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("Test Value"),
									PageContext.REQUEST_SCOPE);
		request.setAttribute("runTest", whichTest);
		try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestLinkTag2.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
	}

	/*
	 * Testing LinkTagHDIV. Testing attributes using forward
	 */

	public void testLinkForwardOnblur() {
		runMyTest("testLinkForwardOnblur", "");
	}

	public void testLinkForwardOnclick() {
		runMyTest("testLinkForwardOnclick", "");
	}

	public void testLinkForwardOndblclick() {
		runMyTest("testLinkForwardOndblclick", "");
	}

	public void testLinkForwardOnfocus() {
		runMyTest("testLinkForwardOnfocus", "");
	}

	public void testLinkForwardOnkeydown() {
		runMyTest("testLinkForwardOnkeydown", "");
	}

	public void testLinkForwardOnkeypress() {
		runMyTest("testLinkForwardOnkeypress", "");
	}

	public void testLinkForwardOnkeyup() {
		runMyTest("testLinkForwardOnkeyup", "");
	}

	public void testLinkForwardOnmousedown() {
		runMyTest("testLinkForwardOnmousedown", "");
	}

	public void testLinkForwardOnmousemove() {
		runMyTest("testLinkForwardOnmousemove", "");
	}

	public void testLinkForwardOnmouseout() {
		runMyTest("testLinkForwardOnmouseout", "");
	}

	public void testLinkForwardOnmouseover() {
		runMyTest("testLinkForwardOnmouseover", "");
	}

	public void testLinkForwardOnmouseup() {
		runMyTest("testLinkForwardOnmouseup", "");
	}

	public void testLinkForwardParamIdParamNameNoScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.REQUEST_SCOPE);
		runMyTest("testLinkForwardParamIdParamNameNoScope", "");
	}

	public void testLinkForwardParamIdParamNameParamPropertyNoScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkForwardParamIdParamNameParamPropertyNoScope", "");
	}

	public void testLinkForwardParamIdParamNameApplicationScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.APPLICATION_SCOPE);
		runMyTest("testLinkForwardParamIdParamNameApplicationScope", "");
	}

	public void testLinkForwardParamIdParamNameParamPropertyApplicationScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.APPLICATION_SCOPE);
		runMyTest("testLinkForwardParamIdParamNameParamPropertyApplicationScope", "");
	}

	public void testLinkForwardParamIdParamNameSessionScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.SESSION_SCOPE);
		runMyTest("testLinkForwardParamIdParamNameSessionScope", "");
	}

	public void testLinkForwardParamIdParamNameParamPropertySessionScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.SESSION_SCOPE);
		runMyTest("testLinkForwardParamIdParamNameParamPropertySessionScope", "");
	}

	public void testLinkForwardParamIdParamNameRequestScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.REQUEST_SCOPE);
		runMyTest("testLinkForwardParamIdParamNameRequestScope", "");
	}

	public void testLinkForwardParamIdParamNameParamPropertyRequestScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkForwardParamIdParamNameParamPropertyRequestScope", "");
	}

	public void testLinkForwardStyle() {
		runMyTest("testLinkForwardStyle", "");
	}

	public void testLinkForwardStyleClass() {
		runMyTest("testLinkForwardStyleClass", "");
	}

	public void testLinkForwardStyleId() {
		runMyTest("testLinkForwardStyleId", "");
	}

	public void testLinkForwardTabIndex() {
		runMyTest("testLinkForwardTabIndex", "");
	}

	public void testLinkForwardTarget() {
		runMyTest("testLinkForwardTarget", "");
	}

	public void testLinkForwardTitle() {
		runMyTest("testLinkForwardTitle", "");
	}

	public void testLinkForwardTitleKey() {
		runMyTest("testLinkForwardTitleKey", "");
	}
	
    public void testLinkForwardTitleKeyAlt() throws Exception {
        runMyTest("testLinkForwardTitleKeyAlt", "");
    }	

	public void testLinkForwardTransaction() {
		pageContext.setAttribute(Globals.TRANSACTION_TOKEN_KEY, "Some_Token_Here",
									PageContext.SESSION_SCOPE);
		runMyTest("testLinkForwardTransaction", "");
	}

}
