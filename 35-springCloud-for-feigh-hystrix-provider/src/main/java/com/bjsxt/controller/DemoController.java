package com.bjsxt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value = "/feignHystrix" , method = RequestMethod.GET)
	public String method(@RequestParam String username) {
		String information = username + " :  35-springCloud-for-feigh-hystrix-provider 项目 : feign接口实现Hystrix熔断器";
		
		return information;
	}
	
}
