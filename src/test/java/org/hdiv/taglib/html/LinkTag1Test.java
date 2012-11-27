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
 * Suite of unit tests for the
 * <code>org.hdiv.taglib.html.LinkTagHDIV</code> class.
 */
public class LinkTag1Test extends JspTestCase {

    /**
     * Defines the testcase name for JUnit.
     *
     * @param theName the testcase's name.
     */
    public LinkTag1Test(String theName) {
        super(theName);
    }

    /**
     * Start the tests.
     *
     * @param theArgs the arguments. Not used
     */
    public static void main(String[] theArgs) {
        junit.awtui.TestRunner.main(new String[] {LinkTag1Test.class.getName()});
    }

    /**
     * @return a test suite (<code>TestSuite</code>) that includes all methods
     *         starting with "test"
     */
    public static Test suite() {
        // All methods starting with "test" will be executed in the test suite.
        return new TestSuite(LinkTag1Test.class);
    }

    private void runMyTest(String whichTest, String locale) {
    	
    	pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale), PageContext.SESSION_SCOPE);
		request.setAttribute("runTest", whichTest);
        try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestLinkTag1.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
    }

    /*
     * Testing LinkTagHDIV.
     * Testing attributes using forward
     */

    public void testLinkForward(){
        runMyTest("testLinkForward", "");
    }

    public void testLinkForwardAccesskey(){
        runMyTest("testLinkForwardAccesskey", "");
    }

    public void testLinkForwardAnchor(){
        runMyTest("testLinkForwardAnchor", "");
    }

    public void testLinkForwardIndexedArray(){ 
    	ArrayList lst = new ArrayList();
    	lst.add("Test Message");
    	pageContext.setAttribute("lst", lst, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedArray", "");
	}

    public void testLinkForwardIndexedArrayProperty(){ 
    	SimpleBeanForTesting sbft = new SimpleBeanForTesting();
    	ArrayList lst = new ArrayList();
    	lst.add("Test Message");
    	sbft.setList(lst);
    	pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedArrayProperty", "");
	}

    public void testLinkForwardIndexedMap(){ 
    	HashMap map = new HashMap();
    	map.put("tst1", "Test Message");
    	pageContext.setAttribute("lst", map, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedMap", "");
	}

    public void testLinkForwardIndexedMapProperty(){ 
    	SimpleBeanForTesting sbft = new SimpleBeanForTesting();
    	HashMap map = new HashMap();
    	map.put("tst1", "Test Message");
    	sbft.setMap(map);
    	pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedMapProperty", "");
	}

    public void testLinkForwardIndexedEnumeration(){ 
    	StringTokenizer st = new StringTokenizer("Test Message");
    	pageContext.setAttribute("lst", st, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedEnumeration", "");
	}

    public void testLinkForwardIndexedEnumerationProperty(){ 
    	SimpleBeanForTesting sbft = new SimpleBeanForTesting();
    	StringTokenizer st = new StringTokenizer("Test Message");
    	sbft.setEnumeration(st);
    	pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedEnumerationProperty", "");
	}


    public void testLinkForwardIndexedAlternateIdArray(){ 
    	ArrayList lst = new ArrayList();
    	lst.add("Test Message");
    	pageContext.setAttribute("lst", lst, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedAlternateIdArray", "");
	}

    public void testLinkForwardIndexedAlternateIdArrayProperty(){ 
    	SimpleBeanForTesting sbft = new SimpleBeanForTesting();
    	ArrayList lst = new ArrayList();
    	lst.add("Test Message");
    	sbft.setList(lst);
    	pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedAlternateIdArrayProperty", "");
	}

    public void testLinkForwardIndexedAlternateIdMap(){ 
    	HashMap map = new HashMap();
    	map.put("tst1", "Test Message");
    	pageContext.setAttribute("lst", map, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedAlternateIdMap", "");
	}

    public void testLinkForwardIndexedAlternateIdMapProperty(){ 
    	SimpleBeanForTesting sbft = new SimpleBeanForTesting();
    	HashMap map = new HashMap();
    	map.put("tst1", "Test Message");
    	sbft.setMap(map);
    	pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedAlternateIdMapProperty", "");
	}

    public void testLinkForwardIndexedAlternateIdEnumeration(){ 
    	StringTokenizer st = new StringTokenizer("Test Message");
    	pageContext.setAttribute("lst", st, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedAlternateIdEnumeration", "");
	}

    public void testLinkForwardIndexedAlternateIdEnumerationProperty(){ 
    	SimpleBeanForTesting sbft = new SimpleBeanForTesting();
    	StringTokenizer st = new StringTokenizer("Test Message");
    	sbft.setEnumeration(st);
    	pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
    	runMyTest("testLinkForwardIndexedAlternateIdEnumerationProperty", "");
	}

    public void testLinkForwardLinkName(){
       runMyTest("testLinkForwardLinkName", "");
    }

    public void testLinkForwardNameNoScope(){
 		HashMap map = new HashMap();
		map.put("param1","value1");
		map.put("param2","value2");
		map.put("param3","value3");
		map.put("param4","value4");
		pageContext.setAttribute("paramMap", map, PageContext.REQUEST_SCOPE);
       runMyTest("testLinkForwardNameNoScope", "");
    }

    public void testLinkForwardNamePropertyNoScope(){
 		HashMap map = new HashMap();
		map.put("param1","value1");
		map.put("param2","value2");
		map.put("param3","value3");
		map.put("param4","value4");
		SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
		pageContext.setAttribute("paramPropertyMap", sbft, PageContext.REQUEST_SCOPE);
       runMyTest("testLinkForwardNamePropertyNoScope", "");
    }

    public void testLinkForwardNameApplicationScope(){
 		HashMap map = new HashMap();
		map.put("param1","value1");
		map.put("param2","value2");
		map.put("param3","value3");
		map.put("param4","value4");
		pageContext.setAttribute("paramMap", map, PageContext.APPLICATION_SCOPE);
       runMyTest("testLinkForwardNameApplicationScope", "");
    }

    public void testLinkForwardNamePropertyApplicationScope(){
 		HashMap map = new HashMap();
		map.put("param1","value1");
		map.put("param2","value2");
		map.put("param3","value3");
		map.put("param4","value4");
		SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
		pageContext.setAttribute("paramPropertyMap", sbft, PageContext.APPLICATION_SCOPE);
       runMyTest("testLinkForwardNamePropertyApplicationScope", "");
    }

    public void testLinkForwardNameSessionScope(){
 		HashMap map = new HashMap();
		map.put("param1","value1");
		map.put("param2","value2");
		map.put("param3","value3");
		map.put("param4","value4");
		pageContext.setAttribute("paramMap", map, PageContext.SESSION_SCOPE);
       runMyTest("testLinkForwardNameSessionScope", "");
    }

    public void testLinkForwardNamePropertySessionScope(){
 		HashMap map = new HashMap();
		map.put("param1","value1");
		map.put("param2","value2");
		map.put("param3","value3");
		map.put("param4","value4");
		SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
		pageContext.setAttribute("paramPropertyMap", sbft, PageContext.SESSION_SCOPE);
       runMyTest("testLinkForwardNamePropertySessionScope", "");
    }

    public void testLinkForwardNameRequestScope(){
 		HashMap map = new HashMap();
		map.put("param1","value1");
		map.put("param2","value2");
		map.put("param3","value3");
		map.put("param4","value4");
		pageContext.setAttribute("paramMap", map, PageContext.REQUEST_SCOPE);
       runMyTest("testLinkForwardNameRequestScope", "");
    }

    public void testLinkForwardNamePropertyRequestScope(){
 		HashMap map = new HashMap();
		map.put("param1","value1");
		map.put("param2","value2");
		map.put("param3","value3");
		map.put("param4","value4");
		SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
		pageContext.setAttribute("paramPropertyMap", sbft, PageContext.REQUEST_SCOPE);
       runMyTest("testLinkForwardNamePropertyRequestScope", "");
    }

}
