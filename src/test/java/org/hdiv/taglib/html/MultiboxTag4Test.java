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

import org.apache.cactus.JspTestCase;
import org.apache.struts.Globals;
import org.apache.struts.taglib.html.Constants;
import org.hdiv.dataComposer.IDataComposer;
import org.hdiv.taglib.SimpleBeanForTesting;
import org.hdiv.util.HDIVUtil;
import org.hdiv.util.Method;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Suite of unit tests for the <code>org.apache.struts.taglib.html.MultiboxTag</code> class. NOTE - These tests were separated into 4 files
 * each because of the size of the jsp. (not playing well with Tomcat 3.3
 *
 * These tests are numbered as such:
 *
 * 1 thru 4 test a single checkbox TestMultiboxTag1 - These test validate true (a value was in the array) on our form. TestMultiboxTag2 -
 * Same as 1, but using BodyContent instead of value attribute
 *
 * TestMultiboxTag3 - These test validate true (a value was in the array) on our form. TestMultiboxTag4 - Same as 3, but using BodyContent
 * instead of value attribute
 * 
 * 5 thru 8 test multiple checkboxes TestMultiboxTag5 - These test validate true (a value was in the array) on our form. TestMultiboxTag6 -
 * Same as 5, but using BodyContent instead of value attribute
 *
 * TestMultiboxTag7 - These test validate true (a value was in the array) on our form. TestMultiboxTag8 - Same as 7, but using BodyContent
 * instead of value attribute
 *
 * @author Aritz Rabadan
 * @author Gorka Vicente
 */
public class MultiboxTag4Test extends JspTestCase {

	private IDataComposer dataComposer;

	/**
	 * Defines the testcase name for JUnit.
	 *
	 * @param theName the testcase's name.
	 */
	public MultiboxTag4Test(final String theName) {
		super(theName);
	}

	/**
	 * Start the tests.
	 *
	 * @param theArgs the arguments. Not used
	 */
	public static void main(final String[] theArgs) {
		junit.awtui.TestRunner.main(new String[] { MultiboxTag4Test.class.getName() });
	}

	/**
	 * @return a test suite (<code>TestSuite</code>) that includes all methods starting with "test"
	 */
	public static Test suite() {
		// All methods starting with "test" will be executed in the test suite.
		return new TestSuite(MultiboxTag4Test.class);
	}

	@Override
	protected void setUp() throws Exception {

		super.setUp();
		dataComposer = HDIVUtil.getDataComposer(request);
		dataComposer.beginRequest(Method.POST, "/testFormTag.do");
	}

	private void runMyTest(final String whichTest, final String locale) {

		pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale), PageContext.SESSION_SCOPE);

		String[] s = new String[7];
		for (int i = 1; i < 7; i++) {
			s[i] = "value" + i;
		}
		SimpleBeanForTesting sbft = new SimpleBeanForTesting(s);

		pageContext.setAttribute(Constants.BEAN_KEY, sbft, PageContext.REQUEST_SCOPE);
		request.setAttribute("runTest", whichTest);
		try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestMultiboxTag4.jsp");
		}
		catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
	}

	/*
	 * Testing MultiboxTag.
	 */
	public void testMultiboxBodyPropertyFalse() {
		runMyTest("testMultiboxBodyPropertyFalse", "");
	}

	public void testMultiboxBodyPropertyFalseAccesskey() {
		runMyTest("testMultiboxBodyPropertyFalseAccesskey", "");
	}

	public void testMultiboxBodyPropertyFalseAlt() {
		runMyTest("testMultiboxBodyPropertyFalseAlt", "");
	}

	public void testMultiboxBodyPropertyFalseAltKey1() {
		runMyTest("testMultiboxBodyPropertyFalseAltKey1", "");
	}

	public void testMultiboxBodyPropertyFalseAltKey2() {
		runMyTest("testMultiboxBodyPropertyFalseAltKey2", "");
	}

	public void testMultiboxBodyPropertyFalseAltKey_fr1() {
		runMyTest("testMultiboxBodyPropertyFalseAltKey1_fr", "fr");
	}

	public void testMultiboxBodyPropertyFalseAltKey_fr2() {
		runMyTest("testMultiboxBodyPropertyFalseAltKey2_fr", "fr");
	}

	public void testMultiboxBodyPropertyFalseDisabled_False() {
		runMyTest("testMultiboxBodyPropertyFalseDisabled_True", "");
	}

	public void testMultiboxBodyPropertyFalseDisabled_False1() {
		runMyTest("testMultiboxBodyPropertyFalseDisabled_False1", "");
	}

	public void testMultiboxBodyPropertyFalseDisabled_False2() {
		runMyTest("testMultiboxBodyPropertyFalseDisabled_False2", "");
	}

	public void testMultiboxBodyPropertyFalseOnblur() {
		runMyTest("testMultiboxBodyPropertyFalseOnblur", "");
	}

	public void testMultiboxBodyPropertyFalseOnchange() {
		runMyTest("testMultiboxBodyPropertyFalseOnchange", "");
	}

	public void testMultiboxBodyPropertyFalseOnclick() {
		runMyTest("testMultiboxBodyPropertyFalseOnclick", "");
	}

	public void testMultiboxBodyPropertyFalseOndblclick() {
		runMyTest("testMultiboxBodyPropertyFalseOndblclick", "");
	}

	public void testMultiboxBodyPropertyFalseOnfocus() {
		runMyTest("testMultiboxBodyPropertyFalseOnfocus", "");
	}

	public void testMultiboxBodyPropertyFalseOnkeydown() {
		runMyTest("testMultiboxBodyPropertyFalseOnkeydown", "");
	}

	public void testMultiboxBodyPropertyFalseOnkeypress() {
		runMyTest("testMultiboxBodyPropertyFalseOnkeypress", "");
	}

	public void testMultiboxBodyPropertyFalseOnkeyup() {
		runMyTest("testMultiboxBodyPropertyFalseOnkeyup", "");
	}

	public void testMultiboxBodyPropertyFalseOnmousedown() {
		runMyTest("testMultiboxBodyPropertyFalseOnmousedown", "");
	}

	public void testMultiboxBodyPropertyFalseOnmousemove() {
		runMyTest("testMultiboxBodyPropertyFalseOnmousemove", "");
	}

	public void testMultiboxBodyPropertyFalseOnmouseout() {
		runMyTest("testMultiboxBodyPropertyFalseOnmouseout", "");
	}

	public void testMultiboxBodyPropertyFalseOnmouseover() {
		runMyTest("testMultiboxBodyPropertyFalseOnmouseover", "");
	}

	public void testMultiboxBodyPropertyFalseOnmouseup() {
		runMyTest("testMultiboxBodyPropertyFalseOnmouseup", "");
	}

}
