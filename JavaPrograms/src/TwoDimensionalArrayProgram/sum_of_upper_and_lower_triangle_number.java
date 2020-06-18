package TwoDimensionalArrayProgram;

import java.util.Scanner;

public class sum_of_upper_and_lower_triangle_number {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("Which Dimensional Arry You Want?");
		n = k.nextInt();

		int a[][] = new int[n][n];
		System.out.println("Enter Number in " + n + " Dimensional Array");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = k.nextInt();
			}
		}

		System.out.println("Number in " + n + " Dimensional Array are");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				sum = sum + a[i][j];
			}
		}

		System.out.println("Sum of Upper Triangular Number is=" + sum);

		sum = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				sum = sum + a[i][j];
			}
		}

		System.out.println("Sum of Lower Triangular Number is=" + sum);

		sum = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				sum = sum + a[i][j];
			}
		}

		System.out.println("Sum of Second Upper Triangular Number is=" + sum);

		sum = 0;
		for (int i = 1; i < n; i++) {
			for (int j = n - i; j < n; j++) {
				sum = sum + a[i][j];
			}
		}

		System.out.println("Sum of Second Lower Triangular Number is=" + sum);

	}

}
