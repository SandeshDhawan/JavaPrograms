package WhileLoopProgram;

import java.util.Scanner;

public class check_armstrong_number {
	public static void main(String[] args) {
		int n, p, rev = 0, m;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any Number");
		n = k.nextInt();
		m = n;
		while (n != 0) {
			p = n % 10;
			rev = rev + (p * p * p);
			n = n / 10;
		}
		System.out.println("Reverse is=" + rev);
		if (m == rev)
			System.out.println(m + " is a Armstrong Number");
		else
			System.out.println(m + " is not a Armstrong Number");
	}

}
