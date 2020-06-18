package If_else_program;

import java.util.Scanner;

public class check_even_odd_number {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Any Number");
		n = k.nextInt();

		if (n % 2 == 0)
			System.out.println(n + " is a even number");
		else
			System.out.println(n + " is a odd number");

	}

}
