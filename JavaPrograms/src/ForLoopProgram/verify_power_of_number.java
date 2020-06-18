package ForLoopProgram;

import java.util.Scanner;

public class verify_power_of_number {
	public static void main(String[] args) {
		int n, x, result = 1;
		Scanner k = new Scanner(System.in);
		System.out.println("Enter Base");
		x = k.nextInt();
		System.out.println("Enter Power");
		n = k.nextInt();

		for (int i = 1; i <= n; i++)
			result = result * x;

		System.out.println(x + " Power of " + n + " is =" + result);
	}

}
