package com.rajorg;

import java.util.Scanner;

public class MainPojo {

	public static void main(String[] args) {
		PojoDemo pdemo = new PojoDemo();
		pdemo.setAge(29);
		pdemo.setFname("Raj");
		pdemo.setLname("sukh");
		pdemo.setSalary(4200.0f);
		pdemo.setTypeOfWork("Java Programmer");
		pdemo.setIsWorking(true);
		// System.out.println(pdemo.Age + " " + pdemo.Fname);

		ScCalculator scal = new ScCalculator();

		// System.out.println(scal.cube(5, 3, 5));
		// System.out.println(scal.Square(5, 3));

		RCalculator rcal = new RCalculator();
		// System.out.println(rcal.Add(2, 5, 6));

		// System.out.println(rcal.Mulitply(3, 4, 2));

		InputScan iscan = new InputScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your FName");
		String fname= scan.nextLine();
		System.out.println("Please enter your LName");
		String lname= scan.nextLine();
		System.out.println("Please enter your phoneNo");
		String pno= scan.nextLine();
		System.out.println("Please enter your address");
		String add= scan.nextLine();
		System.out.println("Program Ends");
		
		
	}

}
