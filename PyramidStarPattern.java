package MainPrograms;

public class PyramidStarPattern {

	public static void main(String[] args) {
		// Pyramid star pattarn.
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10+i-1;j++) {
				if(i+j<=10) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=10;i++) {
			for(int j=10+i-1;j<=100;j--) {
				if(i+j<=10) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
