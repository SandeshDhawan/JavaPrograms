/*
       *
      **
     ***
    ****
   *****
  ******
 *******

 */

package Patterns;

import java.util.Scanner;

public class pattern6 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Row you want?");
		n = k.nextInt();

		for (int i = 0; i < n; i++) {
			for (int x = n; x > i; x--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
