package com.javatrainingschool;

public class MechanicalEngineer extends Engineer {


	public static final String DEPT = "CIVIL";

	@Override
	public String getDepartment() {
		return DEPT;
	}

	public MechanicalEngineer(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public MechanicalEngineer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
