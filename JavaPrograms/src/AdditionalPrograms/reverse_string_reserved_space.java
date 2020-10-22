package AdditionalPrograms;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class reverse_string_reserved_space {
	public static void main(String[] args) {
		String str;
		String str1 = "";
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any String");
		str = k.nextLine();

		char input_array[] = str.toCharArray();
		char new_array[] = new char[input_array.length];

		for (int i = 0; i < input_array.length; i++) {
			if (input_array[i] == ' ')
				new_array[i] = ' ';
		}

		int j = new_array.length - 1;
		for (int i = 0; i < input_array.length; i++) {
			if (input_array[i] != ' ') {

				if (new_array[j] == ' ')
					j--;
				new_array[j] = input_array[i];
				j--;

			}

		}

		System.out.println(String.valueOf(new_array));
	}

}
