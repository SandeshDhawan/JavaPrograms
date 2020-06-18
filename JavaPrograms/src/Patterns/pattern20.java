/*
1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 

 */

package Patterns;

import java.util.Scanner;

public class pattern20 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Rows You Want?");
		n = k.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int x = 1; x < i; x++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int x = 1; x < i; x++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
