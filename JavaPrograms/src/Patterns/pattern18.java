/*
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 

 */

package Patterns;

import java.util.Scanner;

public class pattern18 {
	public static void main(String[] args) {
		int n, x = 1;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many rows you want?");
		n = k.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (x == 1) {
					System.out.print("1 ");
					x = 0;
				} else {
					System.out.print("0 ");
					x = 1;
				}
			}
			System.out.println();
		}

	}

}
