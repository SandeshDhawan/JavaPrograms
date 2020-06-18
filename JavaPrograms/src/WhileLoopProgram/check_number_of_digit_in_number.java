package WhileLoopProgram;

import java.util.Scanner;

public class check_number_of_digit_in_number {
	public static void main(String[] args) {
		int n, cnt = 0;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Any Number");
		n = k.nextInt();

		while (n != 0) {
			cnt++;
			n = n / 10;
		}
		System.out.println("Number of Digit is=" + cnt);
	}

}
