package com.jair.controller;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@ResultMap("add")
	public String add(){
		return "测试";
		
	}
}
