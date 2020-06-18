package If_else_program;

import java.util.Scanner;

public class check_vowel {
	public static void main(String[] args) {
		String a;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Any String");
		a = k.next();
		a = a.toUpperCase();

		if (a.charAt(0) == 'A' || a.charAt(0) == 'E' || a.charAt(0) == 'I' || a.charAt(0) == 'O' || a.charAt(0) == 'U')
			System.out.println(a + " is a Vowel");
		else
			System.out.println(a + " is a Consonant");
	}

}