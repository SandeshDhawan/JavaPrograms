package ForLoopProgram;

import java.util.Scanner;

public class multiplication_table {
	public static void main(String[] args) {
		int n;
		Scanner k = new Scanner(System.in);
		System.out.println("Which Multiplication Table You Want?");
		n = k.nextInt();

		for (int i = 1; i <= 10; i++)
			System.out.println(n + "*" + i + "=" + n * i);

	}

}
