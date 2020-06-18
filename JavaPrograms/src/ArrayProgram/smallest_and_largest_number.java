package ArrayProgram;

import java.util.Scanner;

public class smallest_and_largest_number {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Number you want in Array");
		n = k.nextInt();

		int a[] = new int[n];
		System.out.println("Enter " + n + " number in array");
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
	}

}
