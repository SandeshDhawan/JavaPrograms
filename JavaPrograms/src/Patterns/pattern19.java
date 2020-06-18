/*
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 

 */

package Patterns;

import java.util.Scanner;

public class pattern19 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Rows you want?");
		n = k.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}

	}

}
