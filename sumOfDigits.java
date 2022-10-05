package numbers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

// sum of digits program variations
public class sumOfDigits {

	static int singledigit(int num) {
		// a method to change sum of the digits into single digits
		System.out.println(" the processed number is ");
		int sum = 0;
		while (num > 0) {
			int num1 = num % 10;
			sum = sum + num1;
			num = num / 10;
		}
		System.out.println(sum);
		return sum;
	}

	private int n3;

// a program to sum the digits untill single digits

	// method 1

	int findsum(int number) {
		int sum = 0;
		while (number > 0) {
			while (number > 0) {
				int number1 = number % 10;
				sum = sum + number1;
				number = number / 10;
			}
			System.out.println(" the sum" + sum);
			if (sum > 10) {
				number = sum;
				sum = 0;
			}
		}
		System.out.println(" the processed sum   " + sum);
		return sum;
	}// method

	// method 2
	// a method to determine the sum of even digits
	int evensumfinder(int number) {
		int sum = 0;
		while (number > 0) {

			int number1 = number % 10;
			sum = sum + number1;
			number = number / 100;
		}
		System.out.println("the orginal sum of digits" + sum);
		if (sum > 9) {
			sumOfDigits.singledigit(sum);
		}
		return sum;
	}

	// method 3

	String pallindrome(int number) {
		int sum = 0;
		int orginal = number;
		while (number > 0) {
			int number1 = number % 10;
			sum = sum * 10 + number1;
			number = number / 10;
		} // while

		if (orginal == sum) {
			return "the number is a pallindreome";
			// System.out.println("the number is a pallindreome");;
		} else {
			return "the number is not a pallindrome";
			// System.out.println("the number is not a pallindrome");;
		}
	}// method

	// method 4
	// a program to demonstrate fibanocci numbners

	LinkedList findfibanochi(int n1, int n2, int n) {
		LinkedList al = new LinkedList();
		al.add(n1);
		al.add(n2);
		for (int i = 0; i < n; i++) {
			int n3 = n1 + n2;
			al.add(n3);
			n1 = n2;
			n2 = n3;

		}
		return al;
	}

	// happy number
	void HappyNumberFind(int number) {
		int sum = 0;
		int n = number % 10;
		int n1 = number / 10;
		int happynumber = n1 * n1 + n * n;
		
		while (happynumber > 0) {
			
			while (happynumber > 0) {
				int n2 = happynumber % 10;
				sum = sum + n2;
				happynumber = happynumber / 10;

			} // while

			System.out.println();
			if (sum >=9) {
				happynumber = sum;
				sum = 0;
			}
		} // while1
		if (sum==1)

		{
			System.out.println("the number is happy");
		} else {
			System.out.println("not a happy number");
		}
	}
	// method

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" please enter the number ");
		int number = sc.nextInt();
		sumOfDigits sd = new sumOfDigits();

		// sd.findsum(number); // method 1
		// sd.evensumfinder(number);// method2 output
		// System.out.println(sd.pallindrome(number));;// method3 output
		// System.out.println(sd.findfibanochi(1,0,10));
		sd.HappyNumberFind(number);
	}

}
