package com.javatrainingschool;

public abstract class Engineer {
	
	protected int id;
	protected String name;
	
	public abstract String getDepartment();
	
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
	public Engineer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
