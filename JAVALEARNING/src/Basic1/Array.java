package Basic1;

public class Array {
	public static void main(String[] args) {
		//Declaring an  Array
		String myarray[];
		int[] myarray1;
		//Creating an array and Assigning 
		myarray = new String[5];
		myarray1 = new int[5];
		//Declearing and creating an array 
		int[] Array1 = new int[10];
		String[] Array2 = new String[3];
		//Creating an Array with array elements 
		int[] Array3 = {1, 2, 3,4};
		String[] Array4 = {"String1", "String2", "String3"};
		//Accessing the Array Elements 
	System.out.println("Array Element one: "+ Array3[0]);
	System.out.println("Array Element one: "+ Array4[0]);
	System.out.println("Array Element length "+ Array3.length);
	System.out.println("Array Element length "+ Array4.length);
	
	for (int i=0;i<Array3.length;i++) {
		System.out.println("This the arrya element : " + i +" has a value of : " + Array3[i]);
	}
	
	}

}
