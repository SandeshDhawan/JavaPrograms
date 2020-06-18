package ArrayProgram;

import java.util.Scanner;

public class two_to_one_dimensional_array {
	public static void main(String[] args) {
		int n, cnt = 0;
		Scanner k = new Scanner(System.in);

		System.out.println("Which Dimensional Arry you want?");
		n = k.nextInt();

		int a[][] = new int[n][n];
		System.out.println("Enter Number in " + n + " Dimensional Array");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = k.nextInt();
			}
		}

		System.out.println("Numbers in " + n + " Dimensional Arry are");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int b[] = new int[n * n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[cnt] = a[i][j];
				cnt++;
			}
		}
		System.out.println("One Dimensional Array is=");
		for (int i = 0; i < n * n; i++)
			System.out.print(b[i] + " ");
	}

}
