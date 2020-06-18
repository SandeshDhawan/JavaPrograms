package SwitchCaseProgram;

import java.util.Scanner;

public class convert_number_to_words {
	public static void main(String[] args) {
		int n, p, rev = 0;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any Number");
		n = k.nextInt();

		while (n != 0) {
			p = n % 10;
			rev = rev * 10 + p;
			n = n / 10;
		}
		while (rev != 0) {
			p = rev % 10;
			switch (p) {
			case 1:
				System.out.println("One");
				break;

			case 2:
				System.out.println("Two");
				break;

			case 3:
				System.out.println("Three");
				break;

			case 4:
				System.out.println("Four");
				break;

			case 5:
				System.out.println("Five");
				break;

			case 6:
				System.out.println("Six");
				break;

			case 7:
				System.out.println("Seven");
				break;

			case 8:
				System.out.println("Eight");
				break;

			case 9:
				System.out.println("Nine");
				break;

			case 0:
				System.out.println("Zero");
				break;

			default:
				break;
			}
			rev = rev / 10;
		}

	}

}
