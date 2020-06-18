/*
A 
B B 
C C C 
D D D D 
E E E E E 

 */

package Patterns;

import java.util.Scanner;

public class pattern22 {
	public static void main(String[] args) {
		int n, alph = 65;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Rows You Want?");
		n = k.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alph + i) + " ");
			}
			System.out.println();
		}

	}

}
