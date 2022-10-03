package arrayprograms.org;

import java.util.Scanner;

public class Finder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the size of an array");
		int length1 = sc.nextInt();
		int arr[] = new int[length1];
		System.out.println(" enter the array elements");
		for (int i = 0; i < length1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("please enter the given number");
		int number = sc.nextInt();
       for (int i = 0; i < length1; i++) 
       {
			for (int j = 1; j < length1 - 1; j++) 
			{
           if (arr[i]+arr[j]== number) {
        	   System.out.println("the index are"+i+(j));
        	   
           }
           
			}//inner
		}//outer
	}// main
}// classs
/*
 * else { System.out.println(" please enter another number"); number =
 * sc.nextInt(); }
 */