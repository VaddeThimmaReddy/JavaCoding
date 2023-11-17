package MainPrograms;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		//Prime number means a number which is divisable by one and itself..
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("This is Prime number: "+num);
		}
		else {
			System.out.println("This is non prime number: "+num);
		}
	}
}
