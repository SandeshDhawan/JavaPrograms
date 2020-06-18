/*

* * * * * * == == == == == == == == == == 
 * * * * *  == == == == == == == == == ==
* * * * * * == == == == == == == == == == 
 * * * * *  == == == == == == == == == ==
* * * * * * == == == == == == == == == == 
 * * * * *  == == == == == == == == == ==
* * * * * * == == == == == == == == == == 
 * * * * *  == == == == == == == == == ==
* * * * * * == == == == == == == == == == 
== == == == == == == == == == == == == == 
== == == == == == == == == == == == == == 
== == == == == == == == == == == == == == 
== == == == == == == == == == == == == == 
== == == == == == == == == == == == == == 

 */

package Patterns;

import java.util.Scanner;

public class pattern26 {
	public static void main(String[] args) {
		int x = 1;

		for (int i = 1; i <= 9; i++) {
			if (x == 1) {
				// System.out.print(" ");
				x = 0;
			} else {
				System.out.print(" ");
				x = 1;
			}
			if (x == 1) {
				for (int j = 1; j <= 5; j++) {
					System.out.print("* ");
				}
				for (int y = 1; y <= 10; y++) {
					System.out.print(" ==");
				}
			} else {
				for (int j = 1; j <= 6; j++) {
					System.out.print("* ");
				}
				for (int y = 1; y <= 10; y++)
					System.out.print("== ");
			}

			System.out.println();
		}

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 14; i++) {
				System.out.print("== ");
			}
			System.out.println();
		}

	}

}
