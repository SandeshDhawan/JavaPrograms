package ArrayProgram;

import java.util.Scanner;

public class sum_and_average {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Number you want in Array");
		n = k.nextInt();
		int a[] = new int[n];

		System.out.println("Enter " + n + " Number in Array");
		for (int i = 0; i < n; i++)
			a[i] = k.nextInt();

		System.out.println("Number in Array Are");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		for (int i = 0; i < n; i++)
			sum = sum + a[i];

		System.out.println("Sum is=" + sum);
		System.out.println("Avergae is=" + sum / n);

	}

}
