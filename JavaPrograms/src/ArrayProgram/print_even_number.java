package ArrayProgram;

import java.util.Scanner;

public class print_even_number {
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
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
		System.out.println("Even Number in Array are=");
		for(int i=0;i<n;i++)
			if(a[i]%2==0)
				System.out.print(a[i]+" ");

	}

}
