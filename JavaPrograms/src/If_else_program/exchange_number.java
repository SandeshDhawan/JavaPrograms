package If_else_program;

import java.util.Scanner;

public class exchange_number {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);
		int a, b;
		System.out.println("Enter any two number");
		a = k.nextInt();
		b = k.nextInt();

		System.out.println("Numbers before swapping");
		System.out.println("A=" + a);
		System.out.println("B=" + b);

		// a=a+b;
		// b=a-b;
		// a=a-b;

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("Numbers after swapping");
		System.out.println("A=" + a);
		System.out.println("B=" + b);
	}

}
