/*
 
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********

 
 */

package Patterns;

import java.util.Scanner;

public class pattern3 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);
		System.out.println("How Many Row tou want?");
		n = k.nextInt();

		for (int i = 1; i < n; i++) {
			for (int x = n; x > i; x--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
