package Basic1;

public class creatingobjectClass {
	
	public static void main(String[] args) {
		System.out.println("this Main class");
		creatingobjectClass Objclass = new creatingobjectClass();
		System.out.println("this Main class:"+ Objclass);
		
	}
	
	public creatingobjectClass() {
		System.out.println("This is the method with class name");
	}
}
