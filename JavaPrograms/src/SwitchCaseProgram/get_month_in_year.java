package SwitchCaseProgram;

import java.util.Scanner;

public class get_month_in_year {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any Month Number");
		n = k.nextInt();

		switch (n) {
		case 1:
			System.out.println("Jan");
			break;

		case 2:
			System.out.println("Feb");
			break;

		case 3:
			System.out.println("March");
			break;

		case 4:
			System.out.println("April");
			break;

		case 5:
			System.out.println("May");
			break;

		case 6:
			System.out.println("June");
			break;

		case 7:
			System.out.println("Jully");
			break;

		case 8:
			System.out.println("August");
			break;

		case 9:
			System.out.println("September");
			break;

		case 10:
			System.out.println("October");
			break;

		case 11:
			System.out.println("November");
			break;

		case 12:
			System.out.println("December");
			break;

		default:
			break;
		}

	}

}
