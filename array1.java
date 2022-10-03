package arrayprograms.org;

import java.util.ArrayList;
import java.util.Arrays;

// 
public class array1 {

	double avarage;

	double avarageValue(int input[]) {
		// a method to return avarage value of elements in an array excluding first and
		// the last index
		Arrays.sort(input);
		// array1.arrayPrinter(input); doubt

		int sum = 0;
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != input[0] && input[i] != input[input.length - 1]) {
				sum += input[i];
				count++;
			}
		}

		for (int bb : input) {
			System.out.println(bb);
		}
		avarage = (double) sum / count;
		return avarage;
	}// avarageValue

	int[] sortingindescending(int input[]) {
		// a method to sort the elements in descending order
		int n = 0;
		int temp = 0;
		while (n < input.length) {

			for (int i = 0; i < input.length - 1; i++) {
				if (input[i] < input[i + 1]) {
					temp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = temp;
				} // if

			} // for
			n++;
		} // while
		return (input);
	}// method

	static void arrayPrinter(int get[]) {
		for (int print : get) {
			System.out.print(print + "  ");

		}
	}// arrayPrinter

	   int[] findcommon(int a[], int b[]) {
		   ArrayList al = new ArrayList();
		int[] c = new int[a.length < b.length ? (a.length) : (b.length)];
		// a method to determine common elements in both the array
		int length2 = ((a.length) > (b.length) ? a.length : b.length);
		int length1 = ((a.length) < (b.length) ? a.length : b.length);
		for (int i = 0; i < length1; i++) {
			for (int j = 0; j < length2; j++)
				if (a[i] == b[j]) {
					 al.add(a[i]);
					 // doubt why its is showing error
				}

		}

		return  int al [] ;
	}

	public static void main(String[] args) {
		

		int a[] = { 100, 200,1,20, 350, 400, 425 };
		int b[] = { -6, 101, 103, 104, 106, 110, 100, 30, 10, 1, -1, -5, -3, -2 };
		array1 object = new array1();
		object.findcommon(a, b);
		// System.out.println(" the avarage value excluding first and the last index" +
		// object.avarageValue(b));
		// System.out.println(" the avarage value excluding first and the last index" +
		// object.avarageValue(a));
		//array1.arrayPrinter(object.sortingindescending(a));

	}// main
}// class
