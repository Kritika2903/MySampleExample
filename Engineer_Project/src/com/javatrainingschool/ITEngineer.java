package com.javatrainingschool;

public class ITEngineer extends Engineer {

	public static final String DEPT = "CIVIL";

	@Override
	public String getDepartment() {
		return DEPT;
	}

	public ITEngineer(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public ITEngineer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
