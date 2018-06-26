package MyTestCase;

import com.xiaowu.decorator.Decorator_1;
import com.xiaowu.decorator.Decoratored;

import junit.framework.TestCase;

public class TestDecorator extends TestCase{
	
	
	public TestDecorator(String arg) {
		super(arg);
	}
	
	public void testDecorator(){
		
		Decoratored  decoratored = new Decoratored();
    	decoratored.dosomething();
    	Decorator_1 decorator_1 = new Decorator_1(decoratored);
    	decorator_1.dosomething(); 
		
	}
	
}
