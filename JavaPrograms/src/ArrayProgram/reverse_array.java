package ArrayProgram;

import java.util.Scanner;

public class reverse_array {
	public static void main(String[] args) {
		int n, cnt = 0;
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
		int b[] = new int[n];

		for (int i = n - 1; i >= 0; i--) {
			b[cnt] = a[i];
			cnt++;
		}

		System.out.println("Reverse Array is=");
		for (int i = 0; i < n; i++)
			System.out.print(b[i] + " ");
	}

}
