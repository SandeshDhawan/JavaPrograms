package AdditionalPrograms;

import java.util.Scanner;

public class Capital_First_Number {
	public static void main(String[] args) {
		String str, caps = "";
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any String");
		str = k.nextLine();

		String splitted_string[] = str.split(" ");

		for (int i = 0; i < splitted_string.length; i++) {
			caps = caps + Character.toUpperCase(splitted_string[i].charAt(0)) + splitted_string[i].substring(1);
			caps = caps + " ";
		}

		System.out.println("First Upper Case = " + caps);

	}

}
