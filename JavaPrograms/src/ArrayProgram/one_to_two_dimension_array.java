package ArrayProgram;

import java.util.Scanner;

public class one_to_two_dimension_array {
	public static void main(String[] args) {
		int n, cnt = 0;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Number you want in Array");
		n = k.nextInt();

		int a[] = new int[n];
		System.out.println("Enter " + n + " Number in Array");
		for (int i = 0; i < n; i++)
			a[i] = k.nextInt();

		System.out.println("Number in one dimensional array are");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		int b[][] = new int[n / 2][2];

		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < 2; j++) {
				b[i][j] = a[cnt];
				cnt++;
			}
		}
		System.out.println("Two Dimensional Array is=");
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < 2; j++)
				System.out.print(b[i][j] + " ");
			System.out.println();
		}
	}

}
