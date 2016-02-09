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
		// System.out.println(pdemo.Age + " " + pdemo.Fname);

		ScCalculator scal = new ScCalculator();

		// System.out.println(scal.cube(5, 3, 5));
		// System.out.println(scal.Square(5, 3));

		RCalculator rcal = new RCalculator();
		// System.out.println(rcal.Add(2, 5, 6));

		// System.out.println(rcal.Mulitply(3, 4, 2));

	}

}
