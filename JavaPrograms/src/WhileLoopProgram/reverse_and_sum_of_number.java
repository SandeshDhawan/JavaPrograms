package WhileLoopProgram;

import java.util.Scanner;

public class reverse_and_sum_of_number {
	public static void main(String[] args) {
		int n, p, rev = 0, sum = 0;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Any Number");
		n = k.nextInt();

		while (n != 0) {
			p = n % 10;
			rev = rev * 10 + p;
			sum = sum + p;
			n = n / 10;
		}
		System.out.println("Reverse is=" + rev);
		System.out.println("Sum is=" + sum);
	}

}
