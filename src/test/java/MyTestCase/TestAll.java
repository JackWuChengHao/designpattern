package MyTestCase;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestAll {
	
	public static Test Testsuite() {
		TestSuite suite = new TestSuite("Run all tests ");
		suite.addTestSuite(TestDecorator.class);
		suite.addTest(new TestDecorator("testDecorator"));
		return suite;
	}
	
	public static void main(String[] args) {
		TestRunner.run(Testsuite());
	}
	
}
