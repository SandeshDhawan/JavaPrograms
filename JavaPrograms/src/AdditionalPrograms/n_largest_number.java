package AdditionalPrograms;

import java.util.Scanner;

public class n_largest_number {
	public static void main(String[] args) {
		int n, temp, large;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Number You Want in Array");
		n = k.nextInt();

		int a[] = new int[n];

		System.out.println("Enter Number in Array");
		for (int i = 0; i < n; i++)
			a[i] = k.nextInt();

		System.out.println("Which Largest Number you want in array");
		large = k.nextInt();

		System.out.println("Number in Array is=");
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

		System.out.println("Sorted Array is=");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		System.out.println(large + " Largest Number in Array is=" + a[large - 1]);
	}

}
