package TwoDimensionalArrayProgram;

import java.util.Scanner;

public class transporse_matrix {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("Which Dimensional Array You Want?");
		n = k.nextInt();

		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		System.out.println("Enter Number in" + n + " Dimensional Array");
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

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = a[j][i];
			}
		}

		System.out.println("Transporse Matrix is=");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
