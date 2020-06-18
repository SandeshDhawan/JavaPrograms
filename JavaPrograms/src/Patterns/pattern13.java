/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

 */

package Patterns;

import java.util.Scanner;

public class pattern13 {
	public static void main(String[] args) {
		int n, x = 1;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Row you want?");
		n = k.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(x++ + " ");
			}
			System.out.println();
		}

	}

}
