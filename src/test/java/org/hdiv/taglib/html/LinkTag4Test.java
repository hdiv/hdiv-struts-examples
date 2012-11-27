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
public class LinkTag4Test extends JspTestCase {

	/**
	 * Defines the testcase name for JUnit.
	 * 
	 * @param theName the testcase's name.
	 */
	public LinkTag4Test(String theName) {
		super(theName);
	}

	/**
	 * Start the tests.
	 * 
	 * @param theArgs the arguments. Not used
	 */
	public static void main(String[] theArgs) {
		junit.awtui.TestRunner.main(new String[] { LinkTag4Test.class.getName() });
	}

	/**
	 * @return a test suite (<code>TestSuite</code>) that includes all methods
	 *         starting with "test"
	 */
	public static Test suite() {
		// All methods starting with "test" will be executed in the test suite.
		return new TestSuite(LinkTag4Test.class);
	}

	private void runMyTest(String whichTest, String locale) {

		pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale),
									PageContext.SESSION_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("Test Value"),
									PageContext.REQUEST_SCOPE);
		request.setAttribute("runTest", whichTest);
		try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestLinkTag4.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
	}

	/*
	 * Testing LinkTagHDIV. Testing attributes using forward
	 */

	public void testLinkActionOnblur() {
		runMyTest("testLinkActionOnblur", "");
	}

	public void testLinkActionOnclick() {
		runMyTest("testLinkActionOnclick", "");
	}

	public void testLinkActionOndblclick() {
		runMyTest("testLinkActionOndblclick", "");
	}

	public void testLinkActionOnfocus() {
		runMyTest("testLinkActionOnfocus", "");
	}

	public void testLinkActionOnkeydown() {
		runMyTest("testLinkActionOnkeydown", "");
	}

	public void testLinkActionOnkeypress() {
		runMyTest("testLinkActionOnkeypress", "");
	}

	public void testLinkActionOnkeyup() {
		runMyTest("testLinkActionOnkeyup", "");
	}

	public void testLinkActionOnmousedown() {
		runMyTest("testLinkActionOnmousedown", "");
	}

	public void testLinkActionOnmousemove() {
		runMyTest("testLinkActionOnmousemove", "");
	}

	public void testLinkActionOnmouseout() {
		runMyTest("testLinkActionOnmouseout", "");
	}

	public void testLinkActionOnmouseover() {
		runMyTest("testLinkActionOnmouseover", "");
	}

	public void testLinkActionOnmouseup() {
		runMyTest("testLinkActionOnmouseup", "");
	}

	public void testLinkActionParamIdParamNameNoScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionParamIdParamNameNoScope", "");
	}

	public void testLinkActionParamIdParamNameParamPropertyNoScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionParamIdParamNameParamPropertyNoScope", "");
	}

	public void testLinkActionParamIdParamNameApplicationScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.APPLICATION_SCOPE);
		runMyTest("testLinkActionParamIdParamNameApplicationScope", "");
	}

	public void testLinkActionParamIdParamNameParamPropertyApplicationScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.APPLICATION_SCOPE);
		runMyTest("testLinkActionParamIdParamNameParamPropertyApplicationScope", "");
	}

	public void testLinkActionParamIdParamNameSessionScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.SESSION_SCOPE);
		runMyTest("testLinkActionParamIdParamNameSessionScope", "");
	}

	public void testLinkActionParamIdParamNameParamPropertySessionScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.SESSION_SCOPE);
		runMyTest("testLinkActionParamIdParamNameParamPropertySessionScope", "");
	}

	public void testLinkActionParamIdParamNameRequestScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionParamIdParamNameRequestScope", "");
	}

	public void testLinkActionParamIdParamNameParamPropertyRequestScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionParamIdParamNameParamPropertyRequestScope", "");
	}

	public void testLinkActionStyle() {
		runMyTest("testLinkActionStyle", "");
	}

	public void testLinkActionStyleClass() {
		runMyTest("testLinkActionStyleClass", "");
	}

	public void testLinkActionStyleId() {
		runMyTest("testLinkActionStyleId", "");
	}

	public void testLinkActionTabIndex() {
		runMyTest("testLinkActionTabIndex", "");
	}

	public void testLinkActionTarget() {
		runMyTest("testLinkActionTarget", "");
	}

	public void testLinkActionTitle() {
		runMyTest("testLinkActionTitle", "");
	}

	public void testLinkActionTitleKey() {
		runMyTest("testLinkActionTitleKey", "");
	}

	public void testLinkActionTransaction() {
		pageContext.setAttribute(Globals.TRANSACTION_TOKEN_KEY, "Some_Token_Here",
									PageContext.SESSION_SCOPE);
		runMyTest("testLinkActionTransaction", "");
	}

}
