/*
aA 
aA bB 
aA bB cC 
aA bB cC dD 
aA bB cC 
aA bB 
aA 
 */

package AdditionalPrograms;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		int alph = 65;
		int lower = 97;
		int n;
		Scanner k = new Scanner(System.in);
		System.out.println("How Many Rows You Want??");
		n = k.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((char) (lower + j));
				System.out.print((char) (alph + j) + " ");
			}
			System.out.println();
		}

		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print((char) (lower + j));
				System.out.print((char) (alph + j) + " ");
			}
			System.out.println();
		}
	}

}
