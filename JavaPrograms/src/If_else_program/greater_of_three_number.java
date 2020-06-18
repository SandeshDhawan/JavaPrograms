package If_else_program;

import java.util.Scanner;

public class greater_of_three_number {
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Any Three Number");
		a = k.nextInt();
		b = k.nextInt();
		c = k.nextInt();

		if (a > b)
			d = a;
		else
			d = b;

		if (d > c)
			System.out.println("Largest Number is=" + d);
		else
			System.out.println("Largest Number is=" + c);

	}

}
