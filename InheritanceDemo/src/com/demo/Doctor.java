package com.demo;

//abstract class is a class which we cannot instantiated(object cannot be created)
//Doctor d = new Doctor();
//d.treatPatient(); ?? there is no implementation of treatPatient method in Doctor, 
//so it becomes invalid to create object of this class.

//What is a need of Abstract class?

//There are two types of Doctors, either Surgeon or Dentist.
//There is no entity called Doctor, but Surgeon and Dentist 
//have come common properties, instead of writing these common
//properties in both classes, we can create a super class and put
//these common properties in Doctor(superclass) and reuse them in
//Surgeon and Dentist class

abstract public class Doctor {

	/*public void treatPatient()
	{
		System.out.println("Basic Treatment");
	}*/
	
	abstract public void treatPatient(); //abstract method without a body
	
	//This abstract method will force the subclasses to implement their own treatPatient method
}
