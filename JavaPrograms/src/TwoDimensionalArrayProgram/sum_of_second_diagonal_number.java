package TwoDimensionalArrayProgram;

import java.util.Scanner;

public class sum_of_second_diagonal_number {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner k = new Scanner(System.in);

		System.out.println("Which Dimensional Array You Want?");
		n = k.nextInt();

		int a[][] = new int[n][n];

		System.out.println("Enter Number in " + n + " Dimensional Array");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = k.nextInt();
			}
		}

		System.out.println("Number in " + n + " Dimensional Array");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1)
					sum = sum + a[i][j];
			}
		}
		System.out.println("Sum of Second Diagonal Number is=" + sum);
	}

}
