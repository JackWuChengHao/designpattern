package com.xiaowu.decorator;

public abstract class Decorator implements DecoratorInterface {
		
	protected Decoratored decoratored;
	
	public Decorator(Decoratored decoratored) {
		this.decoratored = decoratored;
	}

	public void dosomething() {
		this.decoratored.dosomething();
		this.dootherthing();
		System.out.println("==============================");
	}
	
	abstract protected void dootherthing();
	
}
