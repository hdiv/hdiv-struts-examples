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
 * Suite of unit tests for the
 * <code>org.hdiv.taglib.html.FormTag</code> class.
 */
public class FormTag1Test extends JspTestCase {

    /**
     * Defines the testcase name for JUnit.
     *
     * @param theName the testcase's name.
     */
    public FormTag1Test(String theName) {
        super(theName);
    }

    /**
     * Start the tests.
     *
     * @param theArgs the arguments. Not used
     */
    public static void main(String[] theArgs) {
        junit.awtui.TestRunner.main(new String[] {FormTag1Test.class.getName()});
    }

    /**
     * @return a test suite (<code>TestSuite</code>) that includes all methods
     *         starting with "test"
     */
    public static Test suite() {
        // All methods starting with "test" will be executed in the test suite.
        return new TestSuite(FormTag1Test.class);
    }
    
    private void runMyTest(String whichTest, String locale){
    	
    	pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale), PageContext.SESSION_SCOPE);
    	pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("Test Value"), PageContext.REQUEST_SCOPE);
		request.setAttribute("runTest", whichTest);
        try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestFormTag1.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
    }

    /*
     * Testing FormTagHDIV.
     */
    public void testFormAction() {
		runMyTest("testFormAction", "");
	}

	public void testFormActionEnctype() {
		runMyTest("testFormActionEnctype", "");
	}

	public void testFormActionFocus() {
		runMyTest("testFormActionFocus", "");
	}

	public void testFormActionFocusIndexed() {
		runMyTest("testFormActionFocusIndexed", "");
	}

	public void testFormActionMethod1() {
		runMyTest("testFormActionMethod1", "");
	}

	public void testFormActionMethod2() {
		runMyTest("testFormActionMethod2", "");
	}

	public void testFormActionMethod3() {
		runMyTest("testFormActionMethod3", "");
	}

	public void testFormActionMethod4() {
		runMyTest("testFormActionMethod4", "");
	}

	public void testFormActionMethod5() {
		runMyTest("testFormActionMethod5", "");
	}

	public void testFormActionOnreset() {
		runMyTest("testFormActionOnreset", "");
	}

	public void testFormActionOnsubmit() {
		runMyTest("testFormActionOnsubmit", "");
	}

	public void testFormActionStyle() {
		runMyTest("testFormActionStyle", "");
	}

	public void testFormActionStyleClass() {
		runMyTest("testFormActionStyleClass", "");
	}

	public void testFormActionStyleId() {
		runMyTest("testFormActionStyleId", "");
	}

	public void testFormActionTarget() {
		runMyTest("testFormActionTarget", "");
	}
}
