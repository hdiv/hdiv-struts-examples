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
public class LinkTag8Test extends JspTestCase {

	/**
	 * Defines the testcase name for JUnit.
	 * 
	 * @param theName the testcase's name.
	 */
	public LinkTag8Test(String theName) {
		super(theName);
	}

	/**
	 * Start the tests.
	 * 
	 * @param theArgs the arguments. Not used
	 */
	public static void main(String[] theArgs) {
		junit.awtui.TestRunner.main(new String[] { LinkTag8Test.class.getName() });
	}

	/**
	 * @return a test suite (<code>TestSuite</code>) that includes all methods
	 *         starting with "test"
	 */
	public static Test suite() {
		// All methods starting with "test" will be executed in the test suite.
		return new TestSuite(LinkTag8Test.class);
	}

	private void runMyTest(String whichTest, String locale) {

		pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale),
									PageContext.SESSION_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("Test Value"),
									PageContext.REQUEST_SCOPE);
		request.setAttribute("runTest", whichTest);
		try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestLinkTag8.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
	}

	/*
	 * Testing LinkTagHDIV.
	 */

	public void testLinkPageOnblur() {
		runMyTest("testLinkPageOnblur", "");
	}

	public void testLinkPageOnclick() {
		runMyTest("testLinkPageOnclick", "");
	}

	public void testLinkPageOndblclick() {
		runMyTest("testLinkPageOndblclick", "");
	}

	public void testLinkPageOnfocus() {
		runMyTest("testLinkPageOnfocus", "");
	}

	public void testLinkPageOnkeydown() {
		runMyTest("testLinkPageOnkeydown", "");
	}

	public void testLinkPageOnkeypress() {
		runMyTest("testLinkPageOnkeypress", "");
	}

	public void testLinkPageOnkeyup() {
		runMyTest("testLinkPageOnkeyup", "");
	}

	public void testLinkPageOnmousedown() {
		runMyTest("testLinkPageOnmousedown", "");
	}

	public void testLinkPageOnmousemove() {
		runMyTest("testLinkPageOnmousemove", "");
	}

	public void testLinkPageOnmouseout() {
		runMyTest("testLinkPageOnmouseout", "");
	}

	public void testLinkPageOnmouseover() {
		runMyTest("testLinkPageOnmouseover", "");
	}

	public void testLinkPageOnmouseup() {
		runMyTest("testLinkPageOnmouseup", "");
	}

	public void testLinkPageParamIdParamNameNoScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.REQUEST_SCOPE);
		runMyTest("testLinkPageParamIdParamNameNoScope", "");
	}

	public void testLinkPageParamIdParamNameParamPropertyNoScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkPageParamIdParamNameParamPropertyNoScope", "");
	}

	public void testLinkPageParamIdParamNameApplicationScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.APPLICATION_SCOPE);
		runMyTest("testLinkPageParamIdParamNameApplicationScope", "");
	}

	public void testLinkPageParamIdParamNameParamPropertyApplicationScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.APPLICATION_SCOPE);
		runMyTest("testLinkPageParamIdParamNameParamPropertyApplicationScope", "");
	}

	public void testLinkPageParamIdParamNameSessionScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.SESSION_SCOPE);
		runMyTest("testLinkPageParamIdParamNameSessionScope", "");
	}

	public void testLinkPageParamIdParamNameParamPropertySessionScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.SESSION_SCOPE);
		runMyTest("testLinkPageParamIdParamNameParamPropertySessionScope", "");
	}

	public void testLinkPageParamIdParamNameRequestScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.REQUEST_SCOPE);
		runMyTest("testLinkPageParamIdParamNameRequestScope", "");
	}

	public void testLinkPageParamIdParamNameParamPropertyRequestScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkPageParamIdParamNameParamPropertyRequestScope", "");
	}

	public void testLinkPageStyle() {
		runMyTest("testLinkPageStyle", "");
	}

	public void testLinkPageStyleClass() {
		runMyTest("testLinkPageStyleClass", "");
	}

	public void testLinkPageStyleId() {
		runMyTest("testLinkPageStyleId", "");
	}

	public void testLinkPageTabIndex() {
		runMyTest("testLinkPageTabIndex", "");
	}

	public void testLinkPageTarget() {
		runMyTest("testLinkPageTarget", "");
	}

	public void testLinkPageTitle() {
		runMyTest("testLinkPageTitle", "");
	}

	public void testLinkPageTitleKey() {
		runMyTest("testLinkPageTitleKey", "");
	}

	public void testLinkPageTransaction() {
		pageContext.setAttribute(Globals.TRANSACTION_TOKEN_KEY, "Some_Token_Here",
									PageContext.SESSION_SCOPE);
		runMyTest("testLinkPageTransaction", "");
	}

}
