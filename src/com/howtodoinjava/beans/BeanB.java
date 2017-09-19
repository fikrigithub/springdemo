package com.howtodoinjava.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BeanB {
	public String getBeanB(){
		return "Get BeanB";
	}
}
