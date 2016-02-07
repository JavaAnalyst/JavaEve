package com.rajorg;

public class MainPojo {

	public static void main(String[] args) {
		PojoDemo pdemo = new PojoDemo();
		pdemo.setAge(29);
		pdemo.setFname("Raj");
		pdemo.setLname("sukh");
		pdemo.setSalary(4200.0f);
		pdemo.setTypeOfWork("Java Programmer");
		pdemo.setIsWorking(true);
		System.out.println(pdemo.Age+" "+pdemo.Fname);
	}
	

}
