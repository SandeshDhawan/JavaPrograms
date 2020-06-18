package StringProgram;

import java.util.Scanner;

public class palindrome_string {
	public static void main(String[] args) {
		String str, rev = "";
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any String");
		str = k.next();

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Revrese String is=" + rev);

		if (str.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}

}
