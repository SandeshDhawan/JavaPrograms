/*
 
* * * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

 */

package Patterns;

import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);
		System.out.println("How Mant Row you want?");
		n = k.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
