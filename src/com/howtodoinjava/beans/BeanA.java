package com.howtodoinjava.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BeanA{
	
	@Autowired
	BeanB b;
	
	public BeanA(){
		System.out.println("Creating BeanA");
	}
	
	public void getBeanA(){
		System.out.println("Get BeanA "+b.getBeanB());
	}
}
