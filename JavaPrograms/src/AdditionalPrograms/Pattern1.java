/*
1 2 3 4 *
1 2 3 * 5
1 2 * 4 5
1 * 3 4 5
* 2 3 4 5 
 */

package AdditionalPrograms;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Rows You Want??");
		n = k.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n - i+1)
					System.out.print("* ");
				else
					System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
