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
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.Globals;
import org.apache.struts.taglib.html.Constants;
import org.hdiv.dataComposer.IDataComposer;
import org.hdiv.taglib.SimpleBeanForTesting;
import org.hdiv.util.HDIVUtil;

/**
 * Suite of unit tests for the
 * <code>org.hdiv.taglib.html.HiddenTagHDIV</code> class.
 */
public class HiddenTag2Test extends JspTestCase {

	private IDataComposer dataComposer;
	
	private static Log log = LogFactory.getLog(HiddenTag2Test.class);
	
    /**
     * Defines the testcase name for JUnit.
     *
     * @param theName the testcase's name.
     */
    public HiddenTag2Test(String theName) {
        super(theName);
    }

    /**
     * Start the tests.
     *
     * @param theArgs the arguments. Not used
     */
    public static void main(String[] theArgs) {
        junit.awtui.TestRunner.main(new String[] {HiddenTag2Test.class.getName()});
    }

    /**
     * @return a test suite (<code>TestSuite</code>) that includes all methods
     *         starting with "test"
     */
    public static Test suite() {
        // All methods starting with "test" will be executed in the test suite.
        return new TestSuite(HiddenTag2Test.class);
    }

    protected void setUp() throws Exception {
        
    	super.setUp();
    	this.dataComposer = (IDataComposer) HDIVUtil.getDataComposer();
		this.dataComposer.beginRequest("POST", "/testFormTag.do");
    }    
    
    private void runMyTest(String whichTest, String locale){
    	
    	pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale), PageContext.SESSION_SCOPE);
    	pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("Test Value"), PageContext.REQUEST_SCOPE);
		request.setAttribute("runTest", whichTest);
        try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestHiddenTag2.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
    }

    /*
     * Testing HiddenTagHDIV.
     */

    public void testHiddenPropertyStyle(){ 
    	runMyTest("testHiddenPropertyStyle", "");
	}

    public void testHiddenPropertyStyleClass(){ 
    	runMyTest("testHiddenPropertyStyleClass", "");
	}

    public void testHiddenPropertyStyleId(){ 
    	runMyTest("testHiddenPropertyStyleId", "");
	}

    public void testHiddenPropertyTitle(){ 
    	runMyTest("testHiddenPropertyTitle", "");
	}

    public void testHiddenPropertyTitleKey(){ 
    	runMyTest("testHiddenPropertyTitleKey", "");
	}

    public void testHiddenPropertyTitleKey_fr(){ 
    	runMyTest("testHiddenPropertyTitleKey_fr", "fr");
	}

    public void testHiddenPropertyValue(){ 
    	runMyTest("testHiddenPropertyValue", "");
	}

    public void testHiddenPropertyIndexedArray(){ 
    	ArrayList lst = new ArrayList();
    	lst.add("Test Message");
    	pageContext.setAttribute("lst", lst, PageContext.REQUEST_SCOPE);
    	runMyTest("testHiddenPropertyIndexedArray", "");
	}

    public void testHiddenPropertyIndexedArrayProperty(){ 
    	SimpleBeanForTesting sbft = new SimpleBeanForTesting();
    	ArrayList lst = new ArrayList();
    	lst.add("Test Message");
    	sbft.setList(lst);
    	pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
    	runMyTest("testHiddenPropertyIndexedArrayProperty", "");
	}

    public void testHiddenPropertyIndexedMap(){ 
    	HashMap map = new HashMap();
    	map.put("tst1", "Test Message");
    	pageContext.setAttribute("lst", map, PageContext.REQUEST_SCOPE);
    	runMyTest("testHiddenPropertyIndexedMap", "");
	}

    public void testHiddenPropertyIndexedMapProperty(){ 
    	SimpleBeanForTesting sbft = new SimpleBeanForTesting();
    	HashMap map = new HashMap();
    	map.put("tst1", "Test Message");
    	sbft.setMap(map);
    	pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
    	runMyTest("testHiddenPropertyIndexedMapProperty", "");
	}

    public void testHiddenPropertyIndexedEnumeration(){ 
    	StringTokenizer st = new StringTokenizer("Test Message");
    	pageContext.setAttribute("lst", st, PageContext.REQUEST_SCOPE);
    	runMyTest("testHiddenPropertyIndexedEnumeration", "");
	}

    public void testHiddenPropertyIndexedEnumerationProperty(){ 
    	SimpleBeanForTesting sbft = new SimpleBeanForTesting();
    	StringTokenizer st = new StringTokenizer("Test Message");
    	sbft.setEnumeration(st);
    	pageContext.setAttribute("lst", sbft, PageContext.REQUEST_SCOPE);
    	runMyTest("testHiddenPropertyIndexedEnumerationProperty", "");
	}

}
