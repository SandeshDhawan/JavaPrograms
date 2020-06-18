package TwoDimensionalArrayProgram;

import java.util.Scanner;

public class sum_of_columns {
	public static void main(String[] args) {
		int n;
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

		System.out.println("Numbers in " + n + " Dimensional Array are");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Sum Of Columns are");

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum = sum + a[i][j];
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" = " + sum);
		}
	}

}
