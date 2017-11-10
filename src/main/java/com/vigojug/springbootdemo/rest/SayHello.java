package com.vigojug.springbootdemo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vigojug.springbootdemo.model.Person;

@RestController
public class SayHello {
	
	@RequestMapping(value="/sayHello", method=RequestMethod.GET)
	public Person sayHello(String name) {
		return new Person("12345678Z", "vitor", "1231231");
	}
}
