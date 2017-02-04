package Basic1;

public class MethodClass {
	public static int one = 10;
	public String two = "StringValue";
	public static void main(String[] args) {
		System.out.println("Mainclass");
		classone(10,20);
		classtwo();
		classthree();
	}
	
//Child Methods 
	
	public static int classone(int a, int b) {
		int sum;
		sum=a+b;
		System.out.println("classone :" + one);
		System.out.println(sum);
		return sum;
	}
	public static void classtwo() {
		System.out.println("classtwo");
	}
	public static void classthree() {
		System.out.println("ClassThree");
	}

}
