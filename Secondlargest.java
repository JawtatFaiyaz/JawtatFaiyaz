package mint;

public class Secondlargest {
// sample program to find second maximum number in an array
	public static void main(String[] args) {
		int inputarray[] = { -6,2100,1, 2, 34, 45, 76, 98, 100, 200, 102, 199, 209, 500, 104 };
		int length = inputarray.length;
		int n = 0;
		int temp;
		while (n < length ) {
			for (int i = 0; i < length - 1; i++) {
				if (inputarray[i] > inputarray[i + 1]) {
					temp = inputarray[i];
					inputarray[i] = inputarray[i + 1];
					inputarray[i + 1] = temp;
				}

			} // for
			n++;
		} // while
		for (int k = 0; k < inputarray.length; k++) {

		}
		System.out.println("the second largest number in an array is " + inputarray[length - 2]);
	}// main
}// class
