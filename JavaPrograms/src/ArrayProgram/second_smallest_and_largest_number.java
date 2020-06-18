package ArrayProgram;

import java.util.Scanner;

public class second_smallest_and_largest_number {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Number you want in Array");
		n = k.nextInt();

		int a[] = new int[n];

		System.out.println("Enter " + n + " Number in Array");
		for (int i = 0; i < n; i++)
			a[i] = k.nextInt();

		System.out.println("Number in Array are");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		int small = a[0];
		int large = a[0];

		for (int i = 0; i < n; i++) {
			if (a[i] < small)
				small = a[i];
			if (a[i] > large)
				large = a[i];
		}

		System.out.println("Smallest Number is=" + small);
		System.out.println("Largest Number is=" + large);

		int second_small = large;
		int second_large = small;

		for (int i = 0; i < n; i++) {
			if (a[i] < large && a[i] > second_large)
				second_large = a[i];

			if (a[i] > small && a[i] < second_small)
				second_small = a[i];
		}

		System.out.println("Second Smallest Number is=" + second_small);
		System.out.println("Second Largest Number is=" + second_large);
	}

}
