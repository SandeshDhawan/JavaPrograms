/*
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 

 */

package Patterns;

import java.util.Scanner;

public class pattern17 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Row You want?");
		n = k.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
