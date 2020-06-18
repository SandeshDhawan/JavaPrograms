package ArrayProgram;

import java.util.Scanner;

public class find_number_in_array {
	public static void main(String[] args) {
		int i, n, find;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Number you want in Array");
		n = k.nextInt();
		int a[] = new int[n];

		System.out.println("Enter " + n + " Number in Array");
		for (i = 0; i < n; i++)
			a[i] = k.nextInt();

		System.out.println("Which Number you want to search in array");
		find = k.nextInt();

		System.out.println("Number in Array are");
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		for (i = 0; i < n; i++)
			if (a[i] == find)
				break;

		if (i == n)
			System.out.println(find + " is not present in array");
		else
			System.out.println(find + " is present at " + (i + 1) + " Position");

	}

}
