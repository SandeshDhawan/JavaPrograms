package AdditionalPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class add_zero_at_start {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Number You Want in Array");
		n = k.nextInt();
		int a[] = new int[n];

		System.out.println("Enter Number in Array");
		for (int i = 0; i < n; i++)
			a[i] = k.nextInt();

		System.out.println("Number in Array are = ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		Arrays.sort(a);
		System.out.println("Sorted Array is=");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
