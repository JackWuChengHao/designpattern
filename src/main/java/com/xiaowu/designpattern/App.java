package com.xiaowu.designpattern;

import com.xiaowu.decorator.Decorator_1;
import com.xiaowu.decorator.Decoratored;

/**
 * 测试入口
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Decoratored  decoratored = new Decoratored();
    	decoratored.dosomething();
    	Decorator_1 decorator_1 = new Decorator_1(decoratored);
    	decorator_1.dosomething();
    	
    }
}
