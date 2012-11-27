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
public class LinkTag6Test extends JspTestCase {

	/**
	 * Defines the testcase name for JUnit.
	 * 
	 * @param theName the testcase's name.
	 */
	public LinkTag6Test(String theName) {
		super(theName);
	}

	/**
	 * Start the tests.
	 * 
	 * @param theArgs the arguments. Not used
	 */
	public static void main(String[] theArgs) {
		junit.awtui.TestRunner.main(new String[] { LinkTag6Test.class.getName() });
	}

	/**
	 * @return a test suite (<code>TestSuite</code>) that includes all methods
	 *         starting with "test"
	 */
	public static Test suite() {
		// All methods starting with "test" will be executed in the test suite.
		return new TestSuite(LinkTag6Test.class);
	}

	private void runMyTest(String whichTest, String locale) {

		pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale),
									PageContext.SESSION_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("Test Value"),
									PageContext.REQUEST_SCOPE);
		request.setAttribute("runTest", whichTest);
		try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestLinkTag6.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
	}

	/*
	 * Testing LinkTagHDIV.
	 */

	// --------Testing attributes using forward------
	public void testLinkHrefOnblur() {
		runMyTest("testLinkHrefOnblur", "");
	}

	public void testLinkHrefOnclick() {
		runMyTest("testLinkHrefOnclick", "");
	}

	public void testLinkHrefOndblclick() {
		runMyTest("testLinkHrefOndblclick", "");
	}

	public void testLinkHrefOnfocus() {
		runMyTest("testLinkHrefOnfocus", "");
	}

	public void testLinkHrefOnkeydown() {
		runMyTest("testLinkHrefOnkeydown", "");
	}

	public void testLinkHrefOnkeypress() {
		runMyTest("testLinkHrefOnkeypress", "");
	}

	public void testLinkHrefOnkeyup() {
		runMyTest("testLinkHrefOnkeyup", "");
	}

	public void testLinkHrefOnmousedown() {
		runMyTest("testLinkHrefOnmousedown", "");
	}

	public void testLinkHrefOnmousemove() {
		runMyTest("testLinkHrefOnmousemove", "");
	}

	public void testLinkHrefOnmouseout() {
		runMyTest("testLinkHrefOnmouseout", "");
	}

	public void testLinkHrefOnmouseover() {
		runMyTest("testLinkHrefOnmouseover", "");
	}

	public void testLinkHrefOnmouseup() {
		runMyTest("testLinkHrefOnmouseup", "");
	}

	public void testLinkHrefParamIdParamNameNoScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.REQUEST_SCOPE);
		runMyTest("testLinkHrefParamIdParamNameNoScope", "");
	}

	public void testLinkHrefParamIdParamNameParamPropertyNoScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkHrefParamIdParamNameParamPropertyNoScope", "");
	}

	public void testLinkHrefParamIdParamNameApplicationScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.APPLICATION_SCOPE);
		runMyTest("testLinkHrefParamIdParamNameApplicationScope", "");
	}

	public void testLinkHrefParamIdParamNameParamPropertyApplicationScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.APPLICATION_SCOPE);
		runMyTest("testLinkHrefParamIdParamNameParamPropertyApplicationScope", "");
	}

	public void testLinkHrefParamIdParamNameSessionScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.SESSION_SCOPE);
		runMyTest("testLinkHrefParamIdParamNameSessionScope", "");
	}

	public void testLinkHrefParamIdParamNameParamPropertySessionScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.SESSION_SCOPE);
		runMyTest("testLinkHrefParamIdParamNameParamPropertySessionScope", "");
	}

	public void testLinkHrefParamIdParamNameRequestScope() {
		pageContext.setAttribute("paramName", "paramValue", PageContext.REQUEST_SCOPE);
		runMyTest("testLinkHrefParamIdParamNameRequestScope", "");
	}

	public void testLinkHrefParamIdParamNameParamPropertyRequestScope() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("paramPropertyValue");
		pageContext.setAttribute("testingParamProperty", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkHrefParamIdParamNameParamPropertyRequestScope", "");
	}

	public void testLinkHrefStyle() {
		runMyTest("testLinkHrefStyle", "");
	}

	public void testLinkHrefStyleClass() {
		runMyTest("testLinkHrefStyleClass", "");
	}

	public void testLinkHrefStyleId() {
		runMyTest("testLinkHrefStyleId", "");
	}

	public void testLinkHrefTabIndex() {
		runMyTest("testLinkHrefTabIndex", "");
	}

	public void testLinkHrefTarget() {
		runMyTest("testLinkHrefTarget", "");
	}

	public void testLinkHrefTitle() {
		runMyTest("testLinkHrefTitle", "");
	}

	public void testLinkHrefTitleKey() {
		runMyTest("testLinkHrefTitleKey", "");
	}

	public void testLinkHrefTransaction() {
		pageContext.setAttribute(Globals.TRANSACTION_TOKEN_KEY, "Some_Token_Here",
									PageContext.SESSION_SCOPE);
		runMyTest("testLinkHrefTransaction", "");
	}

}
