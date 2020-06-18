/*
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 

 */

package Patterns;

import java.util.Scanner;

public class pattern16 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many row You want?");
		n = k.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
