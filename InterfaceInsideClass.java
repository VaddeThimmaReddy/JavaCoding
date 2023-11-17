package Com.Interface;

public class InterfaceInsideClass {

	public static void main(String[] args) {
		MyClass.m1();
		
	}

}
class MyClass {
	public interface MyInterface {
		 void run();
	}
	public static void m1() {
		MyInterface mi = new MyInterface() {
			public void run() {
				System.out.println("We can write the interface inside the class..");
			};
		};
		mi.run();
	}
	public static void m3() {
		m1();
	}
}