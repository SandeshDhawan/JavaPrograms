/*
      *
     **
    ***
   ****
  *****
 ******
*******
 ******
  *****
   ****
    ***
     **
      *

 */

package Patterns;

import java.util.Scanner;

public class pattern10 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Row you want?");
		n = k.nextInt();

		for (int i = n; i > 0; i--) {
			for (int x = 1; x < i; x++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n - 1; i > 0; i--) {
			for (int x = n; x > i; x--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
