package MainPrograms;

public class WithOutUsingLoopsPrintNumbers {

	public static void main(String[] args) {
		// Print the 1 to 100 numbers with out using loops ....
		MyClass mc = new MyClass();
		mc.m1();
	}
}
class MyClass {
	int num = 1;
	public void m1() {
		System.out.println(num);
		this.m2();
	}
	public void m2() {
		num++;
		if(num>0 && num<=100) {
			this.m1();
		}
	}
}