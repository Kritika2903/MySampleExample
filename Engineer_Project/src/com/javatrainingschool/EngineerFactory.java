package com.javatrainingschool;

public class EngineerFactory {
	
	private static Engineer engineer;
	
	public static Engineer getEngineer(String type) {
		
		if(type.equalsIgnoreCase("IT")) {
			engineer = new ITEngineer();
		}
		else if(type.equalsIgnoreCase("Mechanical")) {
			engineer = new MechanicalEngineer();
		}
		else if(type.equalsIgnoreCase("Civil")) {
			engineer = new CivilEngineer();
		}
		return engineer;
		
	}

}








