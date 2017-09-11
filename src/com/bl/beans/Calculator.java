package com.bl.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Calculator implements BeanFactoryAware {
	private int a;
	private int b;
	private int sum;

	public Calculator(int a) {
		System.out.println("Calculator(a)");
		this.a = a;
	}

	public void setB(int b) {
		System.out.println("setB(b)");
		this.b = b;
	}

	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("setBeanFactory");
	}

	public void init() {
		System.out.println("init()");
		sum = a + b;
	}

	public void cleanUp() {
		System.out.println("cleanUp()");
	}

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}

}
