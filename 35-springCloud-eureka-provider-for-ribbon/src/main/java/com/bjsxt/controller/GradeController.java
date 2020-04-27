package com.bjsxt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjsxt.model.Grade;

@RestController
public class GradeController {

	@RequestMapping("/visit")
	public List<Grade> method() {
		List<Grade> grades = new ArrayList<Grade>();
		grades.add(new Grade(4 , "四年级" , 3));
		grades.add(new Grade(5 , "五年级" , 3));
		grades.add(new Grade(6 , "六年级" , 3));
		return grades;
	}
	
}
