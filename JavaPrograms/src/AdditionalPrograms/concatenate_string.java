package AdditionalPrograms;

import java.util.Scanner;

public class concatenate_string {
	public static void main(String[] args) {
		String str1, str2, concatenate_string = "";
		int cnt = 0;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter First String");
		str1 = k.nextLine();

		System.out.println("Enter Second String");
		str2 = k.nextLine();

		char a[] = new char[str1.length()];
		char b[] = new char[str2.length()];
		char c[] = new char[str1.length() + str2.length()];

		for (int i = 0; i < str1.length(); i++)
			a[i] = str1.charAt(i);

		for (int i = 0; i < str2.length(); i++)
			b[i] = str2.charAt(i);

		System.out.println("First Array Converted in to array is=");
		for (int i = 0; i < a.length; i++)
			System.out.print(str1.charAt(i));
		System.out.println();

		System.out.println("First Array Converted in to array is=");
		for (int i = 0; i < b.length; i++)
			System.out.print(str2.charAt(i));
		System.out.println();

		for (int i = 0; i < a.length; i++)
			c[i] = a[i];

		for (int j = a.length; j < a.length + b.length; j++) {
			c[j] = b[cnt];
			cnt++;
		}

		System.out.println("Concatenate Array is=");
		for (int i = 0; i < a.length + b.length; i++)
			System.out.print(c[i]);
		System.out.println();

		for (int i = 0; i < a.length + b.length; i++)
			concatenate_string = concatenate_string + Character.toString(c[i]);

		System.out.println("Concatenate String is=" + concatenate_string);
	}
}
