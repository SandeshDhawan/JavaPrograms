package AdditionalPrograms;

public class Number_Combination {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if (i != j && j != k && i != k) {
						System.out.println(i + "" + j + "" + k);
						cnt++;
					}
				}
			}
		}

		System.out.println("Number Of Combination is=" + cnt);
	}
}
