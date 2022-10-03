package mint;

public class PatterUsingArray {

	public static void main(String[] args) {
		String s = " q6r4g7f4h9";
		int a[] = new int[s.length() / 2];
		
		char[] sgetter = s.toCharArray();
		for (int i = 1; i < sgetter.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < sgetter[i] - 48; j++) {
					;
					System.out.print(sgetter[i - 1]);
				}
			}

		} // for
	}// main
}
// class