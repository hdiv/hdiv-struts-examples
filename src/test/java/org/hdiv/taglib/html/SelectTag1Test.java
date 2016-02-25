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
import org.hdiv.dataComposer.IDataComposer;
import org.hdiv.taglib.SimpleBeanForTesting;
import org.hdiv.util.HDIVUtil;

/**
 * Suite of unit tests for the <code>org.hdiv.taglib.html.SelectTag</code> class.
 */
public class SelectTag1Test extends JspTestCase {

	private IDataComposer dataComposer;


	/**
	 * Defines the testcase name for JUnit.
	 * 
	 * @param theName the testcase's name.
	 */
	public SelectTag1Test(String theName) {
		super(theName);
	}

	/**
	 * Start the tests.
	 * 
	 * @param theArgs the arguments. Not used
	 */
	public static void main(String[] theArgs) {
		junit.awtui.TestRunner.main(new String[] { SelectTag1Test.class.getName() });
	}

	/**
	 * @return a test suite (<code>TestSuite</code>) that includes all methods
	 *         starting with "test"
	 */
	public static Test suite() {
		// All methods starting with "test" will be executed in the test suite.
		return new TestSuite(SelectTag1Test.class);
	}

	protected void setUp() throws Exception {

		super.setUp();
		this.dataComposer = (IDataComposer) HDIVUtil.getDataComposer(request);
		this.dataComposer.beginRequest("POST", "/testFormTag.do");
	}

	private void runMyTest(String whichTest, String locale) throws Exception {

		pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale),
									PageContext.SESSION_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("Test Value"),
									PageContext.REQUEST_SCOPE);
		request.setAttribute("runTest", whichTest);
		pageContext.forward("/test/org/hdiv/taglib/html/TestSelectTag1.jsp");
	}

	/*
	 * Testing SelectTagHDIV.
	 */
	public void testSelectPropertyAlt() throws Exception {
		runMyTest("testSelectPropertyAlt", "");
	}

	public void testSelectPropertyAltKey1() throws Exception {
		runMyTest("testSelectPropertyAltKey1", "");
	}

	public void testSelectPropertyAltKey2() throws Exception {
		runMyTest("testSelectPropertyAltKey2", "");
	}
	
    public void testSelectPropertyAltKey3() throws Exception {
        runMyTest("testSelectPropertyAltKey3", "");
    }	

	public void testSelectPropertyAltKey_fr1() throws Exception {
		runMyTest("testSelectPropertyAltKey1_fr", "fr");
	}

	public void testSelectPropertyAltKey_fr2() throws Exception {
		runMyTest("testSelectPropertyAltKey2_fr", "fr");
	}

	public void testSelectPropertyDisabled() throws Exception {
		runMyTest("testSelectPropertyDisabled", "");
	}

	public void testSelectPropertyMultiple() throws Exception {
		runMyTest("testSelectPropertyMultiple", "");
	}

	public void testSelectPropertyOnblur() throws Exception {
		runMyTest("testSelectPropertyOnblur", "");
	}

	public void testSelectPropertyOnchange() throws Exception {
		runMyTest("testSelectPropertyOnchange", "");
	}

	public void testSelectPropertyOnclick() throws Exception {
		runMyTest("testSelectPropertyOnclick", "");
	}

	public void testSelectPropertyOndblclick() throws Exception {
		runMyTest("testSelectPropertyOndblclick", "");
	}

	public void testSelectPropertyOnfocus() throws Exception {
		runMyTest("testSelectPropertyOnfocus", "");
	}

	public void testSelectPropertyOnkeydown() throws Exception {
		runMyTest("testSelectPropertyOnkeydown", "");
	}

	public void testSelectPropertyOnkeypress() throws Exception {
		runMyTest("testSelectPropertyOnkeypress", "");
	}

	public void testSelectPropertyOnkeyup() throws Exception {
		runMyTest("testSelectPropertyOnkeyup", "");
	}

	public void testSelectPropertyOnmousedown() throws Exception {
		runMyTest("testSelectPropertyOnmousedown", "");
	}

	public void testSelectPropertyOnmousemove() throws Exception {
		runMyTest("testSelectPropertyOnmousemove", "");
	}

	public void testSelectPropertyOnmouseout() throws Exception {
		runMyTest("testSelectPropertyOnmouseout", "");
	}

	public void testSelectPropertyOnmouseover() throws Exception {
		runMyTest("testSelectPropertyOnmouseover", "");
	}

	public void testSelectPropertyOnmouseup() throws Exception {
		runMyTest("testSelectPropertyOnmouseup", "");
	}

}
