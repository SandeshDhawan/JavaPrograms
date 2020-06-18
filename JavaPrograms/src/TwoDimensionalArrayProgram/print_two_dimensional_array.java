package TwoDimensionalArrayProgram;

import java.util.Scanner;

public class print_two_dimensional_array {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("Which Dimensional Array You Want?");
		n = k.nextInt();

		int a[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = k.nextInt();
			}
		}

		System.out.println(n + " Dimensional Array is=");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
