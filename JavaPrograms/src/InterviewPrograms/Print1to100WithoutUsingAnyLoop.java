package InterviewPrograms;

public class Print1to100WithoutUsingAnyLoop {
	public static void main(String[] args) {
		printNum(1);
	}

	public static void printNum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}

}
