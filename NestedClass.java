package Com.Practice;

public class NestedClass {

	public static void main(String[] args) {
		Program p = new Program();
	
		Program.Test pt =p.new Test();
		Program.Test.Reddy ptr=pt.new Reddy();
		ptr.m1();
		pt.m2();
		p.m3();
	}
}
class Program {
	 class Test {
	   class Reddy {
		 public void m1() {
			 System.out.println("Hiiiiiiiii");
		 }
	 }
	 public void m2() {
		 System.out.println("Hello");
	 }
	}
	public void m3() {
		System.out.println("Wowww");
	}
}
