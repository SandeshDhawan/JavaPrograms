package If_else_program;

import java.util.Scanner;

public class positive_negative_number {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any Number");
		n = k.nextInt();

		if (n < 0)
			System.out.println(n + " is a negative number");
		else
			System.out.println(n + " is a positive number");

	}

}
