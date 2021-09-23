package InterviewPrograms;

public class NAN_NotANumber {
	public static void main(String[] args) {

		System.out.println(2.0 / 0.0);// Infinity
		System.out.println(0.0 / 0.0);// NaN
		System.out.println(0.0 / 0); //NaN
		System.out.println(Math.sqrt(-1));// NaN

		// We can't compare to NaN Numbers,because this are undefined number and it will
		// always give you false
		System.out.println(Float.NaN == Float.NaN);// False, because both this numbers are not defined that's why it is
													// giving False

	}
}
