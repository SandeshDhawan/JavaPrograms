/*
    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1

 */

package Patterns;

import java.util.Scanner;

public class pattern14 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Rows you want?");
		n = k.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int x = n; x > i; x--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for (int y = 2; y <= i; y++) {
				System.out.print(y);
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int x = n; x > i; x--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for (int x = 2; x <= i; x++) {
				System.out.print(x);
			}
			System.out.println();
		}

	}

}
