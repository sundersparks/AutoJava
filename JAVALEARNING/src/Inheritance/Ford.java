package Inheritance;

public class Ford extends Car {

	public static void main(String[] args) {
		// Extended Variables from Car class
		System.out.println(brand1);
		System.out.println(brand2);
		System.out.println(brand3);
		//Accessing the class from the Car class by creating an Object
		Car.speedlimit();
		Car.speedlimit1(45,55);
		//Extended class from the Car class - Using Inheritance
		speedlimit();
		speedlimit1(45,55);
	}

}
