/*
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

 */

package Patterns;

import java.util.Scanner;

public class pattern11 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Row You want?");
		n = k.nextInt();

		for (int i = n; i > 0; i--) {
			for (int x = i; x < n; x++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = n; i > 0; i--) {
			for (int x = 0; x < i - 1; x++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
