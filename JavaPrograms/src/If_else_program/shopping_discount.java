package If_else_program;

import java.util.Scanner;

public class shopping_discount {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Shopping Amount");
		n = k.nextInt();

		if (n >= 5000)
			System.out.println("Customer get a 50% discount i.e " + (n * 50) / 100);
		else if (n < 5000 && n >= 4000)
			System.out.println("Customer get a 40% discount i.e " + (n * 40) / 100);
		else if (n < 4000 && n >= 3000)
			System.out.println("Customer get a 30% discount i.e " + (n * 30) / 100);
		else if (n < 3000 && n >= 2000)
			System.out.println("Customer get a 20% discount i.e " + (n * 20) / 100);
		else if (n < 2000 && n >= 1000)
			System.out.println("Customer get a 10% discount i.e " + (n * 10) / 100);
		else
			System.out.println("No Discount");
	}

}
