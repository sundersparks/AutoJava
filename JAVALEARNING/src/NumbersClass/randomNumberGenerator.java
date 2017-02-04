package NumbersClass;

public class randomNumberGenerator {

	public static void main(String[] args) {
		
		Integer x = 5;
		Integer y = 10; 
		Integer z = 20;
		double a =30;
		double b = 40;
		double c = 50;
		// TODO Auto-generated method stub
		//1.Random class - This will generate random number between 0.0 to 1.0
		System.out.println(Math.random());
		
		//2.XXXnubertypeValue exp - intValue, doubleValue, floatValue 
		System.out.println(x.intValue());
		System.out.println(x.doubleValue());
		System.out.println(x.floatValue());
		System.out.println(x.byteValue());
		System.out.println(x.shortValue());
		System.out.println(x.longValue());
		
		//3.compareTo() class - returns 1,0 & -1
		System.out.println(x.compareTo(3)); // 1
		System.out.println(x.compareTo(5)); // 0
		System.out.println(x.compareTo(8));	// -1
		
		//4.equals() - Returns true for match & False for NoMatch
		System.out.println(x.equals(5)); // True
		System.out.println(x.equals(3)); // Falses
		
		//5. abs() gives the absolute value - only positive value 
		System.out.println(Math.abs(x));
		
		//6. min() , max();
		System.out.println(Math.max(x,y));
		System.out.println(Math.max(5,100));
		
		System.out.println(Math.min(x,y));
		System.out.println(Math.min(5,100));
		
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(100));
		
		System.out.println(Math.toDegrees(a));
		System.out.println(Math.toRadians(5));
		
		//Ramdom number generator 
		System.out.println("This is Random bumber1: " + Math.random()*5);
		System.out.println("This is Random bumber2: " + (int) (Math.random()*5));
		System.out.println("This is Random bumber3: " + ((int) (Math.random()*5)+1));
		
		System.out.println(Math.random()*(5)+1);
		System.out.println((int)(Math.random()*x)+1);
		int dice1 = (int)(Math.random()*x)+1; //  is min value
		System.out.println(dice1);
		int dice2 = (int)(5+(Math.random()*(10-5))); // Range between 5 to 10 value
		System.out.println(dice2);
		
		
		
	}

}
