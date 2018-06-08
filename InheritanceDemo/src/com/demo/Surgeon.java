package com.demo;

public class Surgeon extends Doctor{

	//Surgeon is a Doctor
	
	//overriding treatPatient method from Doctor
	public void treatPatient()
	{
		//super.treatPatient();
		System.out.println("Surgeon's treatment");
	}	
}
