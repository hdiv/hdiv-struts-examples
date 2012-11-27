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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.StringTokenizer;

import javax.servlet.jsp.PageContext;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.cactus.JspTestCase;
import org.apache.struts.Globals;
import org.hdiv.taglib.SimpleBeanForTesting;

/**
 * Suite of unit tests for the <code>org.hdiv.taglib.html.LinkTagHDIV</code> class.
 */
public class LinkTag3Test extends JspTestCase {

	/**
	 * Defines the testcase name for JUnit.
	 * 
	 * @param theName the testcase's name.
	 */
	public LinkTag3Test(String theName) {
		super(theName);
	}

	/**
	 * Start the tests.
	 * 
	 * @param theArgs the arguments. Not used
	 */
	public static void main(String[] theArgs) {
		junit.awtui.TestRunner.main(new String[] { LinkTag3Test.class.getName() });
	}

	/**
	 * @return a test suite (<code>TestSuite</code>) that includes all methods
	 *         starting with "test"
	 */
	public static Test suite() {
		// All methods starting with "test" will be executed in the test suite.
		return new TestSuite(LinkTag3Test.class);
	}

	private void runMyTest(String whichTest, String locale) {

		pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale),
									PageContext.SESSION_SCOPE);
		request.setAttribute("runTest", whichTest);
		try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestLinkTag3.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
	}

	/*
	 * Testing LinkTagHDIV. Testing attributes using forward
	 */

	public void testLinkAction() {
		runMyTest("testLinkAction", "");
	}

	public void testLinkActionAccesskey() {
		runMyTest("testLinkActionAccesskey", "");
	}

	public void testLinkActionAnchor() {
		runMyTest("testLinkActionAnchor", "");
	}

	public void testLinkActionIndexedArray() {
		ArrayList lst = new ArrayList();
		lst.add("Test Message");
		pageContext.setAttribute("lst", lst, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedArray", "");
	}

	public void testLinkActionIndexedArrayProperty() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting();
		ArrayList lst = new ArrayList();
		lst.add("Test Message");
		sbft.setList(lst);
		pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedArrayProperty", "");
	}

	public void testLinkActionIndexedMap() {
		HashMap map = new HashMap();
		map.put("tst1", "Test Message");
		pageContext.setAttribute("lst", map, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedMap", "");
	}

	public void testLinkActionIndexedMapProperty() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting();
		HashMap map = new HashMap();
		map.put("tst1", "Test Message");
		sbft.setMap(map);
		pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedMapProperty", "");
	}

	public void testLinkActionIndexedEnumeration() {
		StringTokenizer st = new StringTokenizer("Test Message");
		pageContext.setAttribute("lst", st, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedEnumeration", "");
	}

	public void testLinkActionIndexedEnumerationProperty() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting();
		StringTokenizer st = new StringTokenizer("Test Message");
		sbft.setEnumeration(st);
		pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedEnumerationProperty", "");
	}

	public void testLinkActionIndexedAlternateIdArray() {
		ArrayList lst = new ArrayList();
		lst.add("Test Message");
		pageContext.setAttribute("lst", lst, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedAlternateIdArray", "");
	}

	public void testLinkActionIndexedAlternateIdArrayProperty() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting();
		ArrayList lst = new ArrayList();
		lst.add("Test Message");
		sbft.setList(lst);
		pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedAlternateIdArrayProperty", "");
	}

	public void testLinkActionIndexedAlternateIdMap() {
		HashMap map = new HashMap();
		map.put("tst1", "Test Message");
		pageContext.setAttribute("lst", map, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedAlternateIdMap", "");
	}

	public void testLinkActionIndexedAlternateIdMapProperty() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting();
		HashMap map = new HashMap();
		map.put("tst1", "Test Message");
		sbft.setMap(map);
		pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedAlternateIdMapProperty", "");
	}

	public void testLinkActionIndexedAlternateIdEnumeration() {
		StringTokenizer st = new StringTokenizer("Test Message");
		pageContext.setAttribute("lst", st, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedAlternateIdEnumeration", "");
	}

	public void testLinkActionIndexedAlternateIdEnumerationProperty() {
		SimpleBeanForTesting sbft = new SimpleBeanForTesting();
		StringTokenizer st = new StringTokenizer("Test Message");
		sbft.setEnumeration(st);
		pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionIndexedAlternateIdEnumerationProperty", "");
	}

	public void testLinkActionLinkName() {
		runMyTest("testLinkActionLinkName", "");
	}

	public void testLinkActionNameNoScope() {
		HashMap map = new HashMap();
		map.put("param1", "value1");
		map.put("param2", "value2");
		map.put("param3", "value3");
		map.put("param4", "value4");
		pageContext.setAttribute("paramMap", map, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionNameNoScope", "");
	}

	public void testLinkActionNamePropertyNoScope() {
		HashMap map = new HashMap();
		map.put("param1", "value1");
		map.put("param2", "value2");
		map.put("param3", "value3");
		map.put("param4", "value4");
		SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
		pageContext.setAttribute("paramPropertyMap", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionNamePropertyNoScope", "");
	}

	public void testLinkActionNameApplicationScope() {
		HashMap map = new HashMap();
		map.put("param1", "value1");
		map.put("param2", "value2");
		map.put("param3", "value3");
		map.put("param4", "value4");
		pageContext.setAttribute("paramMap", map, PageContext.APPLICATION_SCOPE);
		runMyTest("testLinkActionNameApplicationScope", "");
	}

	public void testLinkActionNamePropertyApplicationScope() {
		HashMap map = new HashMap();
		map.put("param1", "value1");
		map.put("param2", "value2");
		map.put("param3", "value3");
		map.put("param4", "value4");
		SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
		pageContext.setAttribute("paramPropertyMap", sbft, PageContext.APPLICATION_SCOPE);
		runMyTest("testLinkActionNamePropertyApplicationScope", "");
	}

	public void testLinkActionNameSessionScope() {
		HashMap map = new HashMap();
		map.put("param1", "value1");
		map.put("param2", "value2");
		map.put("param3", "value3");
		map.put("param4", "value4");
		pageContext.setAttribute("paramMap", map, PageContext.SESSION_SCOPE);
		runMyTest("testLinkActionNameSessionScope", "");
	}

	public void testLinkActionNamePropertySessionScope() {
		HashMap map = new HashMap();
		map.put("param1", "value1");
		map.put("param2", "value2");
		map.put("param3", "value3");
		map.put("param4", "value4");
		SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
		pageContext.setAttribute("paramPropertyMap", sbft, PageContext.SESSION_SCOPE);
		runMyTest("testLinkActionNamePropertySessionScope", "");
	}

	public void testLinkActionNameRequestScope() {
		HashMap map = new HashMap();
		map.put("param1", "value1");
		map.put("param2", "value2");
		map.put("param3", "value3");
		map.put("param4", "value4");
		pageContext.setAttribute("paramMap", map, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionNameRequestScope", "");
	}

	public void testLinkActionNamePropertyRequestScope() {
		HashMap map = new HashMap();
		map.put("param1", "value1");
		map.put("param2", "value2");
		map.put("param3", "value3");
		map.put("param4", "value4");
		SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
		pageContext.setAttribute("paramPropertyMap", sbft, PageContext.REQUEST_SCOPE);
		runMyTest("testLinkActionNamePropertyRequestScope", "");
	}

}
