package InterviewPrograms;

public class IntegerCatching {
	public static void main(String[] args) {

		Integer num1 = 100;
		Integer num2 = 100;

		Integer num3 = 130;
		Integer num4 = 130;
		// Integer Catching Range is -128 t0 127, it will be equal if it is in this
		// range else for other numbers this are not equal

		if (num1 == num2) {
			System.out.println("Both Are Equal");
		} else {
			System.out.println("Both Are Not Equal");
		}

		if (num3 == num4) {
			System.out.println("Both Are Equal");
		} else {
			System.out.println("Both Are Not Equal");
		}
	}

}
