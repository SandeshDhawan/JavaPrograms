package ArrayProgram;

import java.util.Scanner;

public class descending_sorting {
	public static void main(String[] args) {
		int n, temp;
		Scanner k = new Scanner(System.in);
		System.out.println("How Many Number you want in Array");
		n = k.nextInt();

		int a[] = new int[n];
		System.out.println("Enter" + n + " Number in Array");
		for (int i = 0; i < n; i++)
			a[i] = k.nextInt();

		System.out.println("Number in Array are");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}

		System.out.println("Array in Descending order is=");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

}
