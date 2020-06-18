/*
A B C D E 
A B C D 
A B C 
A B 
A 
A B 
A B C 
A B C D 
A B C D E 

 */

package Patterns;

import java.util.Scanner;

public class pattern24 {
	public static void main(String[] args) {
		int n, alph = 65;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Rows You Want?");
		n = k.nextInt();

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alph + j) + " ");
			}
			System.out.println();
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alph + j) + " ");
			}
			System.out.println();
		}

	}

}
