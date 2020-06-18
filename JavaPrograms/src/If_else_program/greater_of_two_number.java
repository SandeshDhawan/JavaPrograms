package If_else_program;

import java.util.Scanner;

public class greater_of_two_number {
	public static void main(String[] args) {
		int a, b;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any Two Number");
		a = k.nextInt();
		b = k.nextInt();

		if (a > b)
			System.out.println("Largest Number is=" + a);
		else
			System.out.println("Largest Numer is=" + b);

	}

}
