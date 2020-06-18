package SwitchCaseProgram;

import java.util.Scanner;

public class get_month_number_in_year {
	public static void main(String[] args) {
		String str;
		Scanner k = new Scanner(System.in);

		System.out.println("Enter Any Month");
		str = k.nextLine();

		switch (str) {
		case "Jan":
			System.out.println("First Month");
			break;

		case "Feb":
			System.out.println("Second Month");
			break;

		case "March":
			System.out.println("Third Month");
			break;

		case "April":
			System.out.println("Fourth Month");
			break;

		case "May":
			System.out.println("Five Month");
			break;

		case "June":
			System.out.println("Six Month");
			break;

		case "Jully":
			System.out.println("Seven Month");
			break;

		case "August":
			System.out.println("Eight Month");
			break;

		case "September":
			System.out.println("Nine Month");
			break;

		case "October":
			System.out.println("Ten Month");
			break;

		case "Nov":
			System.out.println("Eleven Month");
			break;

		case "Dec":
			System.out.println("Twelve Month");
			break;

		default:
			break;
		}

	}

}
