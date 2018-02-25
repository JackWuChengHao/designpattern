package com.xiaowu.factory;

public class factory {
	public product getproduct(Class<?> clas) throws InstantiationException, IllegalAccessException{
ss
		return (product)clas.newInstance();

	}
}
