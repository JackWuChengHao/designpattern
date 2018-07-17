package MyTestCase;

import com.xiaowu.signleton.Init_Singleton;

import junit.framework.TestCase;

public class TestSingleton extends TestCase {
	
	
	public void testInitSingleton() {
		
		while(Boolean.TRUE)
			System.out.println(Init_Singleton.getOne());
	}
	
}
