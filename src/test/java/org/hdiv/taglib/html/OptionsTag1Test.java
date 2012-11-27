/*
 * Copyright 1999-2004 The Apache Software Foundation.
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
import org.hdiv.dataComposer.IDataComposer;
import org.hdiv.taglib.SimpleBeanForTesting;
import org.hdiv.util.HDIVUtil;
import org.apache.struts.taglib.html.Constants;
import org.apache.struts.util.LabelValueBean;

/**
 * Suite of unit tests for the <code>org.hdiv.taglib.html.OptionsTagHDIV</code>
 * class.
 */
public class OptionsTag1Test extends JspTestCase {

	private IDataComposer dataComposer;


	/**
	 * Defines the testcase name for JUnit.
	 * 
	 * @param theName the testcase's name.
	 */
	public OptionsTag1Test(String theName) {
		super(theName);
	}

	/**
	 * Start the tests.
	 * 
	 * @param theArgs the arguments. Not used
	 */
	public static void main(String[] theArgs) {
		junit.awtui.TestRunner.main(new String[] { OptionsTag1Test.class.getName() });
	}

	/**
	 * @return a test suite (<code>TestSuite</code>) that includes all methods
	 *         starting with "test"
	 */
	public static Test suite() {
		return new TestSuite(OptionsTag1Test.class);
	}

	protected void setUp() throws Exception {

		super.setUp();
		this.dataComposer = (IDataComposer) HDIVUtil.getDataComposer();
		this.dataComposer.beginRequest("/testFormTag.do");
	}

	private void runTest(String whichTest, String locale) throws Exception {
		pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale),
									PageContext.SESSION_SCOPE);

		pageContext.setAttribute("runTest", whichTest, PageContext.REQUEST_SCOPE);
		pageContext.forward("/test/org/hdiv/taglib/html/TestOptionsTag1.jsp");
	}

	private LabelValueBean[] createArrayOfLVB() {
		LabelValueBean[] labelValueBeans = new LabelValueBean[5];
		for (int i = 0; i < 5; i++) {
			labelValueBeans[i] = new LabelValueBean("key" + i, "Test Message " + i);
		}
		return labelValueBeans;
	}

	private String[] createArrayofStrings() {
		String[] stringValues = new String[5];
		for (int i = 0; i < 5; i++) {
			stringValues[i] = "val" + i;
		}
		return stringValues;
	}

	public void testOptionsCollectionArrayItemValueInCollectionProperty() throws Exception {
		pageContext.setAttribute("arrayOfLVB", createArrayOfLVB(), PageContext.REQUEST_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("key1"),
									PageContext.REQUEST_SCOPE);
		runTest("testOptionsCollectionArrayItemValueInCollectionProperty", "");
	}

	public void testOptionsCollectionArrayItemValueNotInCollectionProperty() throws Exception {
		pageContext.setAttribute("arrayOfLVB", createArrayOfLVB(), PageContext.REQUEST_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("key15"),
									PageContext.REQUEST_SCOPE);
		runTest("testOptionsCollectionArrayItemValueNotInCollectionProperty", "");
	}

	public void testOptionsCollectionArrayItemValueInCollectionPropertyLabelProperty()
			throws Exception {
		pageContext.setAttribute("arrayOfLVB", createArrayOfLVB(), PageContext.REQUEST_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("key1"),
									PageContext.REQUEST_SCOPE);
		runTest("testOptionsCollectionArrayItemValueInCollectionPropertyLabelProperty", "");
	}

	public void testOptionsCollectionArrayItemValueNotInCollectionPropertyLabelProperty()
			throws Exception {
		pageContext.setAttribute("arrayOfLVB", createArrayOfLVB(), PageContext.REQUEST_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("key15"),
									PageContext.REQUEST_SCOPE);
		runTest("testOptionsCollectionArrayItemValueNotInCollectionPropertyLabelProperty", "");
	}

	public void testOptionsNameArrayItemValueInCollection() throws Exception {
		pageContext.setAttribute("stringValues", createArrayofStrings(), PageContext.REQUEST_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("val1"),
									PageContext.REQUEST_SCOPE);
		runTest("testOptionsNameArrayItemValueInCollection", "");
	}

	public void testOptionsNameArrayItemValueNotInCollection() throws Exception {
		pageContext.setAttribute("stringValues", createArrayofStrings(), PageContext.REQUEST_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("val15"),
									PageContext.REQUEST_SCOPE);
		runTest("testOptionsNameArrayItemValueNotInCollection", "");
	}

	public void testOptionsPropertyArrayItemValueInCollection() throws Exception {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("val1");
		sbft.setStringArray(createArrayofStrings());
		pageContext.setAttribute(Constants.BEAN_KEY, sbft, PageContext.REQUEST_SCOPE);
		runTest("testOptionsPropertyArrayItemValueInCollection", "");
	}

	public void testOptionsPropertyArrayItemValueNotInCollection() throws Exception {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting("val15");
		sbft.setStringArray(createArrayofStrings());
		pageContext.setAttribute(Constants.BEAN_KEY, sbft, PageContext.REQUEST_SCOPE);
		runTest("testOptionsPropertyArrayItemValueNotInCollection", "");
	}

	public void testOptionsNamePropertyArrayItemValueInCollection() throws Exception {
		pageContext.setAttribute("stringValues", new SimpleBeanForTesting(createArrayofStrings()),
									PageContext.REQUEST_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("val1"),
									PageContext.REQUEST_SCOPE);
		runTest("testOptionsNamePropertyArrayItemValueInCollection", "");
	}

	public void testOptionsNamePropertyArrayItemValueNotInCollection() throws Exception {
		pageContext.setAttribute("stringValues", new SimpleBeanForTesting(createArrayofStrings()),
									PageContext.REQUEST_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("val15"),
									PageContext.REQUEST_SCOPE);
		runTest("testOptionsNamePropertyArrayItemValueNotInCollection", "");
	}
}
