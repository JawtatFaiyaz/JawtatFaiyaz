package numbers;

import java.util.TreeSet;

public class EvenNumbers {
// a method to print numbers
	TreeSet number() {
		TreeSet ts = new TreeSet();
		for (int i = 1; i < 100; i++) {

			ts.add(i);

		}

		return ts;
	}
//--------------------------------------------------------------------------------------------------------------------------------

	// a method to print even numbers

	TreeSet finder() {
		TreeSet ts = new TreeSet();
		for (int i = 2; i < 100; i++) {
			if (i % 2 == 0)
				ts.add(i);

		}

		return ts;
	}

//---------------------------------------------------------------------------------------------------------
	// a method to print odd numbers
	TreeSet finderodd() {
		TreeSet ts1 = new TreeSet();
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0)
				ts1.add(i);

		}

		return ts1;
	}
//-------------------------------------------------------------------------------------------------------

	// a method to print prime numbers

	TreeSet prime() {
		TreeSet ts2 = new TreeSet();
		TreeSet ts3 = new TreeSet();
		for (int i = 2; i < 100; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			} // for 2

			if (count == 1) {

				ts2.add(i);
			} else
				ts3.add(i);

		} // for
		System.out.println(" the non- prime numbers are");
		System.out.println(ts3);
		System.out.println(" the  prime numbers are");
		return ts2;

	}//
		// --------------------------------------------------------------------------------------------------------------------
		// the product of the number

	int productOfNumber(int n) {
		int product = 1;
		for (int i = 1; i <= n; i++) {
			{
				product = product * i;
			}
		}
		return product;
	}

	// ----------------------------------------------------------------------------------------------

	int productOfTheEvenNumber(int n) {
		int product = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				product = product * i;
			}
		}
		return product;
	}
	// -------------------------------------------------------------------------------------------------------------------------

	int productOfTheoddNumber(int n) {
		int product = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				product = product * i;
			}
		}
		return product;
	}

	public static void main(String[] args) {
		EvenNumbers en = new EvenNumbers();

		// System.out.println(" the number list"); System.out.println(en.number());
		// System.out.println("the odd number list");
		// System.out.println(en.finderodd());
		// System.out.println("the even number list"); System.out.println(en.finder());
		// System.out.println(en.prime());;
		System.out.println(en.productOfTheEvenNumber(10));

	}// main
}// class
