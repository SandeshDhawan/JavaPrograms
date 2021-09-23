package InterviewPrograms;

public class DivideByZero {
	public static void main(String[] args) {
//		If we Divide any Double or FLoating Number by 0 or 0.0 it will not give you Arithmetic Exception it will always give you a Infinity in output
//		Arithmetic Exception will come only with Integer not with FLoat and Double

		System.out.println(2.0 / 0);
		System.out.println(1.22f / 0);
		System.out.println(122 / 0.0);
		System.out.println(10.00000333d / 0.0);
	}

}
