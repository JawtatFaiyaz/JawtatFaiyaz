package stringpractise;

import java.util.Scanner;

public class FirstLetter {
// this program will take an input string from an user and convert all the 
	//values to lowercase and the first and the last value will be in upper case
	String changer(String s) {
		
		 String s1= s.substring(0,1);
		 System.out.println(s1);
		String s2 = s.substring(1, s.length()-1).toLowerCase();
		System.out.println(s2);
		String s3= s.substring(4);
		System.out.println(s3);
		String s4 = s1.toUpperCase()+s2.toLowerCase()+s3.toUpperCase();
		System.out.println(s4);
		return s4;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(" enter a string");
	String a = s.next();
	s.close();
		FirstLetter al=new FirstLetter();
		al.changer(a);
		
	
	}

}
