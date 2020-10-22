package AdditionalPrograms;

import java.util.Scanner;

public class remove_duplicates {

	public static void main(String[] args) {
		int n, temp, cnt = 0;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Number You Want in Array");
		n = k.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];

		System.out.println("Enter " + n + " Number in Array");
		for (int i = 0; i < n; i++)
			a[i] = k.nextInt();

		System.out.println("Number in Array are");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
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

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[cnt] = a[i];
				cnt++;
			}
		}

		b[cnt] = a[n - 1];

		System.out.println("Array After Removing a Duplicate Number");
		for (int i = 0; i <= cnt; i++)
			System.out.print(b[i] + " ");

	}

}
