package Basic1;

public class Method {

//Main class Definition
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("This Second class");
//Calling the methods with no Return value 
		method1();
//Calling the methods with Return value 
		method2();
//Calling the method by passing the value to the Method
		CallingMethod(20);
//Methodoverloading 
		Methodoverloaging1(10);
		Methodoverloaging2(20, 20);
		Methodoverloaging3(30.5);
//calling method from other class MethodClass()
		MethodClass.classone(40, 50);
	}
//------------------------------------------------------------------------------------------------
//Calling the methods with no Return value 	
	public static void method1 () {
		System.out.println("This is inside Method2");
	}

	//Calling the methods with Return value
	public static int method2(){
		int a =10;
		System.out.println("This is method one: "+a);
		return a;
	}
	
//Called method with the value 
	public static int CallingMethod(int value) {
		System.out.println("This is the value :" + value);
		return value;
	}
//Method Overloading - Same method with different parameters 
	public static int Methodoverloaging1(int b){
		System.out.println("This the methodoverloading : " + b);
		return b;
	}
	public static int Methodoverloaging2(int b, int c){
		System.out.println("This the methodoverloading : " + b + "&" + c);
		return b;
	}
	public static double Methodoverloaging3(double d){
		System.out.println("This the methodoverloading : " + d);
		return d;
	}
//Method Overriding - Same Method with same parameters 	
}


	
	
