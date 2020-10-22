//Input:-My Name is Sandesh
//Output:-hsednaS si emaN yM
package AdditionalPrograms;

import java.util.Scanner;

public class reverse_string_2 {
	public static void main(String[] args) {
		String str;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any String");
		str = k.nextLine();

		System.out.println("Reverse String is=");
		for (int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i));
	}

}
