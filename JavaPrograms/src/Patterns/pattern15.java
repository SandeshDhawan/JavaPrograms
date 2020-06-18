/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

 */

package Patterns;

import java.util.Scanner;

public class pattern15 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Row you want?");
		n = k.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
