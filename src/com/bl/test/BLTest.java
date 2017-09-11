package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.Calculator;
import com.bl.beans.ShutdownHook;

public class BLTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bl/common/application-context.xml"));
		ShutdownHook sh = factory.getBean("shutdownHook", ShutdownHook.class);
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new Thread(sh));
		
		Calculator calc = factory.getBean("calculator", Calculator.class);
		System.exit(0);
		System.out.println(calc);
		System.out.println("Finish...");
	}

}
