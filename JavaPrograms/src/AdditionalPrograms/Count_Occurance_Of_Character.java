package AdditionalPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Count_Occurance_Of_Character {
	public static void main(String[] args) {
		String str;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any String");
		str = k.nextLine();
		String a[] = new String[str.length()];

		for (int i = 0; i < str.length(); i++)
			a[i] = Character.toString(str.charAt(i));

		System.out.println("String Converted in to array is=");

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();

		HashSet<String> removed_duplicate = new HashSet<String>();

		for (int i = 0; i < a.length; i++)
			removed_duplicate.add(Character.toString(str.charAt(i)));

		Iterator<String> iterator = removed_duplicate.iterator();

		while (iterator.hasNext()) {
			String value = iterator.next();
			int cnt = 0;
			for (int i = 0; i < a.length; i++) {
				if (value.equalsIgnoreCase(a[i]))
					cnt++;
			}
			System.out.println(value + " is occured at " + cnt + " times in array");
		}
	}

}
