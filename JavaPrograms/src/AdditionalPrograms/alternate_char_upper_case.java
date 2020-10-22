package AdditionalPrograms;

import java.util.Scanner;

public class alternate_char_upper_case {
	public static void main(String[] args) {
		String str;
		int cnt = 0;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any String");
		str = k.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (cnt == 1) {
				System.out.print(Character.toLowerCase(str.charAt(i)));
				cnt = 0;
			} else if (cnt == 0) {
				System.out.print(Character.toUpperCase(str.charAt(i)));
				cnt = 1;
			}
		}
	}

}
