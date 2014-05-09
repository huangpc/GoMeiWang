package com.gomei.util;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMvcUtil {
	private static BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml"); 
	
	public static BeanFactory getFactory(){
		return factory;
	}
}
