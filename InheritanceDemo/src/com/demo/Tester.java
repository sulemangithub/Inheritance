package com.demo;

public class Tester {

	public static void main(String[] args) {
		
		Doctor doctor1 = new Surgeon();
		doctor1.treatPatient();
		//compiler will check treatPatient in Doctor class because it is called on Doctor reference
		//At runtime treatPatient method on Surgeon object is called because doctor1 is surgeon class object
				
		Doctor doctor2 = new Dentist();
		doctor2.treatPatient();		
	}	
}
