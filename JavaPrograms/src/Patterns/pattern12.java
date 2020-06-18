/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 

 */

package Patterns;

import java.util.Scanner;

public class pattern12 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Rows you want?");
		n = k.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
