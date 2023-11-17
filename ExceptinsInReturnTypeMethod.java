package Com.Practice;

public class ExceptinsInReturnTypeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java1 j = new Java1();
		j.m1();
		System.out.println(j.m1());
	}

}
class Java1 {
	public int m1() {
		//System.out.println(10/0);
		try {
			System.out.println(20/0);
			System.out.println("Next Line of code");
			return 10;
		}
		catch (ArithmeticException e) {
			System.out.println("Eception Handling");
			System.out.println("Second line of code");
			try {
				System.out.println(100/0);
			}
			catch (Exception a) {
				System.out.println("Second Exception");
			}
			e.printStackTrace();
			//System.exit(0);
			return 100;
		}
		finally {
			System.out.println("Finally block");
			
		}
		
	}
	public void m2() {
		System.out.println("Java developer");
	}
}
