package MainPrograms;

public class FebonacciSeries {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int n = 20;
		while(sum <= n) {
			sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		}
	}
}
