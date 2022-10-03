package mint;

import java.util.Scanner;

public class Stringpractise {

	void splitter(String a) {
		int vowels = 0;
		int space = 0;
		int consonants = 0;
		int digit = 0;
		char spliter[] = a.toCharArray();
		for (int i = 0; i < a.length(); i++) {
			if (spliter[i] == 'a' || spliter[i] == 'e' || spliter[i] == 'i' || spliter[i] == 'o' || spliter[i] == 'u') {
				vowels++;
			} else if (spliter[i] >= 'a' && spliter[i] <= 'z') {
				consonants++;
			} else if (spliter[i] >= '0' && spliter[i] <= '9') {
				digit++;
			} else if (spliter[i] == ' ') {
				space++;
			} else {
				System.out.println(" special characters");
			}
		} // for
		System.out.println("the count of vowels " + "=" + vowels);
		System.out.println("the count of space " + "=" + space);
		System.out.println("the count of consonants " + "=" + consonants);
		System.out.println("the count of digit " + "=" + digit);

	}// methodz

	public static void main(String[] args) {
		// count the number of vowels consonants and digits in an given string
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the input");
		String s = sc.nextLine();
		Stringpractise sp = new Stringpractise();
		sp.splitter(s);

	}// main
}// class
