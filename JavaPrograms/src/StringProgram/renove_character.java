package StringProgram;

import java.util.Scanner;

public class renove_character {
	public static void main(String[] args) {
		String str;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter any String");
		str = k.nextLine();

		System.out.println("Which Character you want to remove");
		char rem = k.next().charAt(0);

		str = str.replaceAll(Character.toString(rem), "");

		System.out.println("String after removing a character=" + str);

	}

}
