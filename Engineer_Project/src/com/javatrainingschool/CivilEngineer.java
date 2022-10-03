package com.javatrainingschool;

public class CivilEngineer extends Engineer {

	public static final String DEPT = "CIVIL";

	@Override
	public String getDepartment() {
		return DEPT;
	}

	public CivilEngineer(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public CivilEngineer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
