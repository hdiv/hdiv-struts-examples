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

import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTagTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.hdiv.taglib.html");
		//$JUnit-BEGIN$
		suite.addTest(RadioTag2Test.suite());
		suite.addTest(LinkTag4Test.suite());
		suite.addTest(LinkTag1Test.suite());
		suite.addTest(MultiboxTag4Test.suite());
		suite.addTest(SelectTag2Test.suite());
		suite.addTest(HiddenTag2Test.suite());
		suite.addTest(MultiboxTag1Test.suite());
		suite.addTest(OptionsTag1Test.suite());
		suite.addTest(LinkTag6Test.suite());
		suite.addTest(LinkTag3Test.suite());
		suite.addTest(LinkTag2Test.suite());
		suite.addTest(MultiboxTag2Test.suite());
		suite.addTest(OptionTag1Test.suite());
		suite.addTest(FormTag1Test.suite());
		suite.addTest(LinkTag8Test.suite());
		suite.addTest(LinkTag5Test.suite());
		suite.addTest(HiddenTag1Test.suite());
		suite.addTest(MultiboxTag3Test.suite());
		suite.addTest(SelectTag1Test.suite());
		suite.addTest(LinkTag7Test.suite());
		suite.addTest(RadioTag1Test.suite());
		//$JUnit-END$
		return suite;
	}

}
