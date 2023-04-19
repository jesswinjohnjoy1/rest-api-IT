package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class johnwick {
	@Value("${message}")
	private String msg;
	@Value("101")
	private int id;
	@RequestMapping("/jesswin")
	public String Hi()
	{
		return id+msg;
	}

}
