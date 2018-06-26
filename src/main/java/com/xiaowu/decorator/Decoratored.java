package com.xiaowu.decorator;

public class Decoratored implements DecoratorInterface{
	
	public Decoratored() {
		// TODO Auto-generated constructor stub
	}
	
	private int line_var = 0;
	
	public void dosomething() {
		System.out.println("line_var" + line_var);
		System.out.println("==============================");
	}

	public int getLine_var() {
		return line_var;
	}

	public void setLine_var(int line_var) {
		this.line_var = line_var;
	}

}
