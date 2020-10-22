package AdditionalPrograms;

import java.util.Scanner;

public class Minimum_and_Maximum_Number_In_Array {

	public static void main(String[] args) {
		int n, index = 0;
		Scanner k = new Scanner(System.in);

		System.out.println("Which Dimensional Array You Want?");
		n = k.nextInt();

		int a[][] = new int[n][n];
		System.out.println("Enter Number in Array");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = k.nextInt();
			}
		}

		System.out.println("Number in Array are");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int min = a[0][0];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					index = j;
				}
			}
		}

		System.out.println("Minimum Number in Array is=" + min);
		int max = a[0][index];
		for (int i = 0; i < n; i++) {
			if (a[i][index] > max)
				max = a[i][index];
		}

		System.out.println("Maximum Number in row " + index + " is " + max);

	}

}
