package com.javatrainingschool;

public class EngineerMain {
	
	public static void main(String[] args) {
		
		Engineer eng1 = EngineerFactory.getEngineer("IT");
		eng1.setId(1);
		eng1.setName("Meera");
		
		System.out.println("Engineer Name : " + eng1.getName());
		System.out.println("Department : " + eng1.getDepartment());
		
		Engineer eng2 = EngineerFactory.getEngineer("Civil");
		eng2.setId(2);
		eng2.setName("Arjun");
		
		System.out.println("Engineer Name : " + eng2.getName());
		System.out.println("Department : " + eng2.getDepartment());
		
		
	}

}
