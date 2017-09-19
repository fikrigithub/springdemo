package com.howtodoinjava.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BeanC {
	public BeanC(){
		System.out.println("Creating BeanC");
	}
}
