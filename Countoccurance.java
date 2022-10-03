package mint;
// sop 
// step 1 - break the string to a character array (fromstring)
// step 2 - typecast the characters into unicode and store it in an new int array(copytypecasted)
// step 3 - create an array to manipulate the typecasted array(manipulation)
// step 4- create an array to store the frequency of the element 



public class Countoccurance {

	public static void main(String[] args) {
		String s = "ishwaryaa";
		System.out.println("input string   " + s);
		char[] fromstring = s.toCharArray();

		int[] copytypecasted = new int[fromstring.length];

		int[] manipulation = new int[fromstring.length];// created to manipulate the orginal array

		int[] frequency = new int[fromstring.length];// frequency finder

		// type casting an character array to a int array as unicode
		for (int i = 0; i < fromstring.length; i++) {
			copytypecasted[i] = (int) fromstring[i];
		}
		System.out.println(" printing an type casted array");
		// System.out.println(fromstring.length);
		for (int print1 : copytypecasted) {
			System.out.print(print1 + "   ");

		}
		System.out.println();
		// completed types casting and stored in an integer array

		for (int j = 0; j < fromstring.length; j++) {
			if (manipulation[j] >= 0) {
				int count = 1;
				for (int k = j + 1; k < fromstring.length ; k++) {
					if (copytypecasted[j] == copytypecasted[k]) {
						manipulation[j] = -1;
						count++;

					} // nestedif
				} // nestedfor
				frequency[j] = count;

			} // if

		} // firstfor
		System.out.println(" printing manipulation array");
		for (int print : manipulation) {
			System.out.print(print + "   ");
		}
		System.out.println(" printing frequency array");
		for (int print2 : frequency) {
			System.out.print(print2 + "   ");
		}
		// review this program
		System.out.println();
		for (int z = 0; z < fromstring.length-2; z++) {
			System.out.println(fromstring[z] + "  " + "the word  has  occured  " + frequency[z]);
		}
	}// main
}// class
