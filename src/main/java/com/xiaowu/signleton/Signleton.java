package com.xiaowu.signleton;

public  class Signleton {

	private static volatile Signleton signleton; //保证一致性

	private Signleton() {};

	public static Signleton getOne() {
		if(null == signleton) {
			
			synchronized (Signleton.class) { //保证原子性
				
				if(null == signleton) {

					signleton = new Signleton();
				}
				
				return signleton;
			}

		}else {
			return signleton;
		}

	}

}
