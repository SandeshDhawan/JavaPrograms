/*          
         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * 
*/
//https://www.edureka.co/blog/30-pattern-programs-in-java/

package Patterns;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("How Many Rows you want?");
		n = k.nextInt();

		for (int i = 0; i < n; i++) {
			for (int x = n; x > i; x--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
