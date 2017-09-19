package com.howtodoinjava.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howtodoinjava.beans.BeanA;

public class BeanDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		Class clazz = Class.forName(BeanA.class.getName());
		BeanA beanA = (BeanA) app.getBean(clazz);
		beanA.getBeanA();
	}
}
