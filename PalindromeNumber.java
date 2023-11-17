package MainPrograms;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// Palindrome means one number is same even if we written that number in reverse order.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while (num>0) {
			int last = num%10;
			num = num/10;
			rev = (rev * 10) + last;
		}
		if(rev == temp) {
			System.out.println("The given number is palindrome....");
		}
		else {
			System.out.println("The given number is not palindrome....");
		}
	}
}
