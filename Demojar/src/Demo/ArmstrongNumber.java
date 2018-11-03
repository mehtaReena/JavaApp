package Demo;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String args[]) {
		int n = 0, temp = 0, r = 0, s = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number ");
		if (in.hasNextInt()) {
			n = in.nextInt(); // if there is another number
		} else {
			n = 0;
		}
		temp = n;
		while (n != 0) {
			r = n % 10;
			s = s + (r * r * r);
			n = n / 10;
		}

		if (temp == s) {
			System.out.println(n + " is an Armstrong Number");
		} else {
			System.out.println(n + " is not an Armstrong Number");
		}
	}
}