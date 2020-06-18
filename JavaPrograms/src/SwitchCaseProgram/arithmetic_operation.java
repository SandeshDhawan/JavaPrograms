package SwitchCaseProgram;

import java.util.Scanner;

public class arithmetic_operation {
	public static void main(String[] args) {
		int n, a, b, c, x;
		Scanner k = new Scanner(System.in);

		do {
			System.out.println("Enter Two Number");
			a = k.nextInt();
			b = k.nextInt();

			System.out.println("Which Arithmetic Operation you want to perform");
			System.out.println("Selct below options");
			System.out.println("1-->Addition");
			System.out.println("2-->Substraction");
			System.out.println("3-->Multiplication");
			System.out.println("4-->Divison");

			n = k.nextInt();

			switch (n) {
			case 1:
				c = a + b;
				System.out.println("Adddition is=" + c);
				System.out.println("Do you want to continue");
				System.out.println("Press 1 for yes");
				System.out.println("Press 0 for No");
				x = k.nextInt();
				break;

			case 2:
				c = a - b;
				System.out.println("Substraction is=" + c);
				System.out.println("Do you want to continue");
				System.out.println("Press 1 for yes");
				System.out.println("Press 0 for No");
				x = k.nextInt();
				break;

			case 3:
				c = a * b;
				System.out.println("Multiplication is=" + c);
				System.out.println("Do you want to continue");
				System.out.println("Press 1 for yes");
				System.out.println("Press 0 for No");
				x = k.nextInt();
				break;

			case 4:
				c = a / b;
				System.out.println("Division is=" + c);
				System.out.println("Do you want to continue");
				System.out.println("Press 1 for yes");
				System.out.println("Press 0 for No");
				x = k.nextInt();
				break;

			default:
				System.out.println("Wrong Option please slect below option for continue");
				System.out.println("Press 1 for yes");
				System.out.println("Press 0 for No");
				x = k.nextInt();
				break;
			}
		} while (x == 1);
	}

}
