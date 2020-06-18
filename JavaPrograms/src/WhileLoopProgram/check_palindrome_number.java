package WhileLoopProgram;

import java.util.Scanner;

public class check_palindrome_number {
	public static void main(String[] args) {
		int n, p, rev = 0, m;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Any Number");
		n = k.nextInt();
		m = n;
		while (n != 0) {
			p = n % 10;
			rev = rev * 10 + p;
			n = n / 10;
		}

		System.out.println("Reverse is=" + rev);

		if (m == rev)
			System.out.println(m + " is a Palindrome Number");
		else
			System.out.println(m + " is not a Palindrome Number");
	}

}
