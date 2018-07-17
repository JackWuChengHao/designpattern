package com.xiaowu.signleton;

public class Init_Singleton {
	
	private Init_Singleton(){};
	
	private final static Init_Singleton init_Singleton = new Init_Singleton();
	
	public static Init_Singleton getOne() {
		return init_Singleton;
	}
	
	
}
