package ForLoopProgram;

import java.util.Scanner;

public class verify_prime_number {
	public static void main(String[] args) {
		int n, i;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any Number");
		n = k.nextInt();

		for (int j = 2; j <= n; j++) {
			for (i = 2; i < j; i++)
				if (j % i == 0)
					break;
			if (i == j)
				System.out.println(j + " is a prime number");
			else
				System.out.println(j + " is not a prime number");
		}
	}

}
