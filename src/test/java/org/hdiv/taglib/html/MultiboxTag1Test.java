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
 */
public class MultiboxTag1Test extends JspTestCase {

	private IDataComposer dataComposer;

	/**
	 * Defines the testcase name for JUnit.
	 *
	 * @param theName the testcase's name.
	 */
	public MultiboxTag1Test(final String theName) {
		super(theName);
	}

	/**
	 * Start the tests.
	 *
	 * @param theArgs the arguments. Not used
	 */
	public static void main(final String[] theArgs) {
		junit.awtui.TestRunner.main(new String[] { MultiboxTag1Test.class.getName() });
	}

	/**
	 * @return a test suite (<code>TestSuite</code>) that includes all methods starting with "test"
	 */
	public static Test suite() {
		// All methods starting with "test" will be executed in the test suite.
		return new TestSuite(MultiboxTag1Test.class);
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
			pageContext.forward("/test/org/hdiv/taglib/html/TestMultiboxTag1.jsp");
		}
		catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
	}

	/*
	 * Testing MultiboxTag.
	 */
	public void testMultiboxPropertyTrue() {
		runMyTest("testMultiboxPropertyTrue", "");
	}

	public void testMultiboxPropertyTrueAccesskey() {
		runMyTest("testMultiboxPropertyTrueAccesskey", "");
	}

	public void testMultiboxPropertyTrueAlt() {
		runMyTest("testMultiboxPropertyTrueAlt", "");
	}

	public void testMultiboxPropertyTrueAltKey1() {
		runMyTest("testMultiboxPropertyTrueAltKey1", "");
	}

	public void testMultiboxPropertyTrueAltKey2() {
		runMyTest("testMultiboxPropertyTrueAltKey2", "");
	}

	public void testMultiboxPropertyTrueAltKey3() throws Exception {
		runMyTest("testMultiboxPropertyTrueAltKey3", "");
	}

	public void testMultiboxPropertyTrueAltKey_fr1() {
		runMyTest("testMultiboxPropertyTrueAltKey1_fr", "fr");
	}

	public void testMultiboxPropertyTrueAltKey_fr2() {
		runMyTest("testMultiboxPropertyTrueAltKey2_fr", "fr");
	}

	public void testMultiboxPropertyTrueDisabled_True() {
		runMyTest("testMultiboxPropertyTrueDisabled_True", "");
	}

	public void testMultiboxPropertyTrueDisabled_False1() {
		runMyTest("testMultiboxPropertyTrueDisabled_False1", "");
	}

	public void testMultiboxPropertyTrueDisabled_False2() {
		runMyTest("testMultiboxPropertyTrueDisabled_False2", "");
	}

	public void testMultiboxPropertyTrueOnblur() {
		runMyTest("testMultiboxPropertyTrueOnblur", "");
	}

	public void testMultiboxPropertyTrueOnchange() {
		runMyTest("testMultiboxPropertyTrueOnchange", "");
	}

	public void testMultiboxPropertyTrueOnclick() {
		runMyTest("testMultiboxPropertyTrueOnclick", "");
	}

	public void testMultiboxPropertyTrueOndblclick() {
		runMyTest("testMultiboxPropertyTrueOndblclick", "");
	}

	public void testMultiboxPropertyTrueOnfocus() {
		runMyTest("testMultiboxPropertyTrueOnfocus", "");
	}

	public void testMultiboxPropertyTrueOnkeydown() {
		runMyTest("testMultiboxPropertyTrueOnkeydown", "");
	}

	public void testMultiboxPropertyTrueOnkeypress() {
		runMyTest("testMultiboxPropertyTrueOnkeypress", "");
	}

	public void testMultiboxPropertyTrueOnkeyup() {
		runMyTest("testMultiboxPropertyTrueOnkeyup", "");
	}

	public void testMultiboxPropertyTrueOnmousedown() {
		runMyTest("testMultiboxPropertyTrueOnmousedown", "");
	}

	public void testMultiboxPropertyTrueOnmousemove() {
		runMyTest("testMultiboxPropertyTrueOnmousemove", "");
	}

	public void testMultiboxPropertyTrueOnmouseout() {
		runMyTest("testMultiboxPropertyTrueOnmouseout", "");
	}

	public void testMultiboxPropertyTrueOnmouseover() {
		runMyTest("testMultiboxPropertyTrueOnmouseover", "");
	}

	public void testMultiboxPropertyTrueOnmouseup() {
		runMyTest("testMultiboxPropertyTrueOnmouseup", "");
	}

}
