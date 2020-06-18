package StringProgram;

import java.util.Scanner;

public class count_char_in_string {
	public static void main(String[] args) {
		String str;
		int letter = 0, number = 0, space = 0, other = 0;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any String");
		str = k.nextLine();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLetter(str.charAt(i)))
				letter++;
			else if (Character.isDigit(str.charAt(i)))
				number++;
			else if (Character.isSpace(str.charAt(i)))
				space++;
			else
				other++;

		}

		System.out.println("Letters in String are=" + letter);
		System.out.println("Number in String are=" + number);
		System.out.println("Space in String are=" + space);
		System.out.println("Other Character in String are=" + other);
	}

}
