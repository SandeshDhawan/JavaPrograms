package ForLoopProgram;

import java.util.Scanner;

public class fibonacci_number {
	public static void main(String[] args) {
		int n, t1 = 0, t2 = 1, t3;
		Scanner k = new Scanner(System.in);
		System.out.println("How Many Number you want in Fibonacci Series");
		n = k.nextInt();

		System.out.print(t1 + " ");
		System.out.print(t2 + " ");
		for (int i = 2; i < n; i++) {
			t3 = t1 + t2;
			System.out.print(t3 + " ");
			t1 = t2;
			t2 = t3;
		}
	}
}
