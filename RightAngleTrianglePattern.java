package MainPrograms;

public class RightAngleTrianglePattern {

	public static void main(String[] args) {
		// Right angle triangle pattern
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=10;i++) {
			for(int j=10;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}