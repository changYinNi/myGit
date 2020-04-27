package com.bjsxt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bjsxt.pojo.Grade;

@RestController
public class GradeController {
	
	@RequestMapping("/visit")
	public List<Grade> method() {
		List<Grade> grades = new ArrayList<Grade>();
		grades.add(new Grade(1 , "一年级" , 3));
		grades.add(new Grade(2 , "二年级" , 3));
		grades.add(new Grade(3 , "三年级" , 3));
		return grades;
	}
	
	@RequestMapping(value = "/feignHystrix" , method = RequestMethod.GET)
	public String method(@RequestParam String username) {
		String information = username + " :  35-springCloud-eureka-provider 项目 : feign接口实现Hystrix熔断器";
		return information;
	}
	
	
}
