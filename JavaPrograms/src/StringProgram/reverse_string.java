package StringProgram;

import java.util.Scanner;

public class reverse_string {
	public static void main(String[] args) {
		String str;
		String[] split_string;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any String");
		str = k.nextLine();

		System.out.println("Enterd String is= " + str);
		split_string = str.split(" ");

		System.out.println("Splitted String is=");
		for (int i = 0; i < split_string.length; i++)
			System.out.println(split_string[i]);

		System.out.println("Reverse String is=");
		for (int i = split_string.length - 1; i >= 0; i--)
			System.out.println(split_string[i]);

	}

}
