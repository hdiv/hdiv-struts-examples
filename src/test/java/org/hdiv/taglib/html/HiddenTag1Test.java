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
 * Suite of unit tests for the <code>org.hdiv.taglib.html.HiddenTagHDIV</code>
 * class.
 */
public class HiddenTag1Test extends JspTestCase {
	
	private IDataComposer dataComposer;
	
    /**
     * Defines the testcase name for JUnit.
     *
     * @param theName the testcase's name.
     */
    public HiddenTag1Test(String theName) {
        super(theName);
    }
    
    /**
     * Start the tests.
     *
     * @param theArgs the arguments. Not used
     */
    public static void main(String[] theArgs) {
        junit.awtui.TestRunner.main(new String[] {HiddenTag1Test.class.getName()});
    }

    /**
     * @return a test suite (<code>TestSuite</code>) that includes all methods
     *         starting with "test"
     */
    public static Test suite() {
        // All methods starting with "test" will be executed in the test suite.
        return new TestSuite(HiddenTag1Test.class);
    }

    protected void setUp() throws Exception {
    
    	super.setUp();
    	this.dataComposer = (IDataComposer) HDIVUtil.getDataComposer();    	
		this.dataComposer.beginRequest("POST", "/testFormTag.do");
    }
    
    private void runMyTest(String whichTest, String locale) {
    	
    	pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale), PageContext.SESSION_SCOPE);        	
    	pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("Test Value"), PageContext.REQUEST_SCOPE);    	
    	
		request.setAttribute("runTest", whichTest);
        try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestHiddenTag1.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
    }
    
    /*
     * Testing HiddenTagHDIV.
     */
    public void testHiddenProperty() {
		runMyTest("testHiddenProperty", "");
	}

	public void testHiddenPropertyAccesskey() {
		runMyTest("testHiddenPropertyAccesskey", "");
	}

	public void testHiddenPropertyAlt() {
		runMyTest("testHiddenPropertyAlt", "");
	}

	public void testHiddenPropertyAltKey1() {
		runMyTest("testHiddenPropertyAltKey1", "");
	}

	public void testHiddenPropertyAltKey2() {
		runMyTest("testHiddenPropertyAltKey2", "");
	}
	
    public void testHiddenPropertyAltKey3() throws Exception {
        runMyTest("testHiddenPropertyAltKey3", "");
    }	

	public void testHiddenPropertyAltKey_fr1() {
		runMyTest("testHiddenPropertyAltKey1_fr", "fr");
	}

	public void testHiddenPropertyAltKey_fr2() {
		runMyTest("testHiddenPropertyAltKey2_fr", "fr");
	}

	public void testHiddenPropertyOnblur() {
		runMyTest("testHiddenPropertyOnblur", "");
	}

	public void testHiddenPropertyOnchange() {
		runMyTest("testHiddenPropertyOnchange", "");
	}

	public void testHiddenPropertyOnclick() {
		runMyTest("testHiddenPropertyOnclick", "");
	}

	public void testHiddenPropertyOndblclick() {
		runMyTest("testHiddenPropertyOndblclick", "");
	}

	public void testHiddenPropertyOnfocus() {
		runMyTest("testHiddenPropertyOnfocus", "");
	}

	public void testHiddenPropertyOnkeydown() {
		runMyTest("testHiddenPropertyOnkeydown", "");
	}

	public void testHiddenPropertyOnkeypress() {
		runMyTest("testHiddenPropertyOnkeypress", "");
	}

	public void testHiddenPropertyOnkeyup() {
		runMyTest("testHiddenPropertyOnkeyup", "");
	}

	public void testHiddenPropertyOnmousedown() {
		runMyTest("testHiddenPropertyOnmousedown", "");
	}

	public void testHiddenPropertyOnmousemove() {
		runMyTest("testHiddenPropertyOnmousemove", "");
	}

	public void testHiddenPropertyOnmouseout() {
		runMyTest("testHiddenPropertyOnmouseout", "");
	}

	public void testHiddenPropertyOnmouseover() {
		runMyTest("testHiddenPropertyOnmouseover", "");
	}

	public void testHiddenPropertyOnmouseup() {
		runMyTest("testHiddenPropertyOnmouseup", "");
	}

}
