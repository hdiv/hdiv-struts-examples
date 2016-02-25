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
 * Suite of unit tests for the
 * <code>org.hdiv.taglib.html.MultiboxTagHDIV</code> class.
 *  NOTE - These tests were separated into 4 files each because of the
 *         size of the jsp.
 *
 *  These tests are numbered as such:
 *
 *  1 thru 4 test a single checkbox
 *  TestOptionTag1 - These test validate true (a value was in the array) on our form.
 *  TestMultiboxTag2 - Same as 1, but using BodyContent instead of value attribute
 *
 *  TestMultiboxTag3 - These test validate true (a value was in the array) on our form.
 *  TestMultiboxTag4 - Same as 3, but using BodyContent instead of value attribute
 * 
 *  5 thru 8 test multiple checkboxes
 *  TestMultiboxTag5 - These test validate true (a value was in the array) on our form.
 *  TestMultiboxTag6 - Same as 5, but using BodyContent instead of value attribute
 *
 *  TestMultiboxTag7 - These test validate true (a value was in the array) on our form.
 *  TestMultiboxTag8 - Same as 7, but using BodyContent instead of value attribute
 */
public class OptionTag1Test extends JspTestCase {

	private IDataComposer dataComposer;
	
    /** 
     * Defines the testcase name for JUnit.
     *
     * @param theName the testcase's name.
     */
    public OptionTag1Test(String theName) {
        super(theName);
    }

    /**
     * Start the tests.
     *
     * @param theArgs the arguments. Not used
     */
    public static void main(String[] theArgs) {
        junit.awtui.TestRunner.main(new String[] {OptionTag1Test.class.getName()});
    }

    /**
     * @return a test suite (<code>TestSuite</code>) that includes all methods
     *         starting with "test"
     */
    public static Test suite() {
        // All methods starting with "test" will be executed in the test suite.
        return new TestSuite(OptionTag1Test.class);
    }

    protected void setUp() throws Exception {
        
    	super.setUp();
    	this.dataComposer = (IDataComposer) HDIVUtil.getDataComposer(request);
		this.dataComposer.beginRequest("POST", "/testFormTag.do");
    }       
    
    private void runMyTest(String whichTest, String locale) {    	                
    	
    	pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale), PageContext.SESSION_SCOPE);

		SimpleBeanForTesting sbft = new SimpleBeanForTesting("SelectMe");    	
    	pageContext.setAttribute(Constants.BEAN_KEY, sbft, PageContext.REQUEST_SCOPE);
    	
		request.setAttribute("runTest", whichTest);
        try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestOptionTag1.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
    }
    
    /*
     * Testing MultiboxTag.
     */
    public void testOptionBodySelected() { 	   	
    	runMyTest("testOptionBodySelected", "");
	}

    public void testOptionBodyNotSelected(){
    	runMyTest("testOptionBodyNotSelected", "");
	}

    public void testOptionBodySelectedDisabled_true(){
    	runMyTest("testOptionBodySelectedDisabled_true", "");
	}

    public void testOptionBodyNotSelectedDisabled_true(){
    	runMyTest("testOptionBodyNotSelectedDisabled_true", "");
	}

    public void testOptionBodySelectedDisabled_false(){
    	runMyTest("testOptionBodySelectedDisabled_false", "");
	}

    public void testOptionBodyNotSelectedDisabled_false(){
    	runMyTest("testOptionBodyNotSelectedDisabled_false", "");
	}

    public void testOptionBodySelectedDisabled_other(){
    	runMyTest("testOptionBodySelectedDisabled_other", "");
	}

    public void testOptionBodyNotSelectedDisabled_other(){
    	runMyTest("testOptionBodyNotSelectedDisabled_other", "");
	}

    public void testOptionKeySelected(){
    	runMyTest("testOptionKeySelected", "");
	}

    public void testOptionKeyNotSelected(){
    	runMyTest("testOptionKeyNotSelected", "");
	}

    public void testOptionKeySelectedAlternateBundle(){
    	runMyTest("testOptionKeySelectedAlternateBundle", "");
	}

    public void testOptionKeyNotSelectedAlternateBundle(){
    	runMyTest("testOptionKeyNotSelectedAlternateBundle", "");
	}

    public void testOptionKeySelectedLocale_fr(){
    	runMyTest("testOptionKeySelectedLocale_fr", "fr");
	}

    public void testOptionKeyNotSelectedLocale_fr(){
    	runMyTest("testOptionKeyNotSelectedLocale_fr", "fr");
	}

    public void testOptionKeySelectedAlternateBundleLocale_fr(){
    	runMyTest("testOptionKeySelectedAlternateBundleLocale_fr", "fr");
	}

    public void testOptionKeyNotSelectedAlternateBundleLocale_fr(){
    	runMyTest("testOptionKeyNotSelectedAlternateBundleLocale_fr", "fr");
	}

}
