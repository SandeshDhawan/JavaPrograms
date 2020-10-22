package AdditionalPrograms;
//Input:-My Name is Sandesh

//Output:-Sandesh is Name My

import java.util.Scanner;

public class reverse_string_1 {
	public static void main(String[] args) {
		String str;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any String");
		str = k.nextLine();

		String splitted_string[] = str.split(" ");

		for (int i = splitted_string.length - 1; i >= 0; i--)
			System.out.println(splitted_string[i]);
	}
}
