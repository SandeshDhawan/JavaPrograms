package ForLoopProgram;

import java.util.Scanner;

public class check_factorial_of_number {
	public static void main(String[] args) {
		int n, fact = 1;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Any Number");
		n = k.nextInt();

		for (int i = 1; i <= n; i++)
			fact = fact * i;

		System.out.println("Factorial of number " + n + " is =" + fact);

	}

}
