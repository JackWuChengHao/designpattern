package com.xiaowu.decorator;

public class Decorator_1 extends Decorator{

	
	public Decorator_1(Decoratored decoratored) {
		super(decoratored);
	}

	public void dootherthing() {
		this.decoratored.setLine_var(this.decoratored.getLine_var()+1);
		System.out.println("the line_var is"+this.decoratored.getLine_var());
	}
	

}
