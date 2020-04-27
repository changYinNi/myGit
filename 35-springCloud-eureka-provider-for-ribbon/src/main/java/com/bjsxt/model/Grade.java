package com.bjsxt.model;

public class Grade {

	private int id;
	private String name;
	private int classNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public Grade(int id, String name, int classNumber) {
		super();
		this.id = id;
		this.name = name;
		this.classNumber = classNumber;
	}
	
	public Grade() {}
	
}
