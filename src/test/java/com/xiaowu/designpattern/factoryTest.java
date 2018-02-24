package com.xiaowu.designpattern;

import com.xiaowu.factory.factory;
import com.xiaowu.factory.product_A;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class factoryTest extends TestCase{

	public void  factoryTest() {
		
		factory fac = new factory();
		try {
			product_A pro = (product_A) fac.getproduct(product_A.class);
			System.out.println(pro.getClass().getName());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
