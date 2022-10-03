package arrayprograms.org;

import java.util.ArrayList;

public class ListInter {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		int a[] = { 100, 200, 350, 400, 425,106, 110, 0, 30, 10 };
		int b[] = { -6, 101, 103, 104, 106, 110, 100, 30, 10, 1, -1, -5, -3, -2 };
		int[] c = new int[a.length < b.length ? (a.length) : (b.length)];

		// a method to determine common elements in both the array
		int length2 = ((a.length) > (b.length) ? a.length : b.length);
		int length1 = ((a.length) < (b.length) ? a.length : b.length);
		for (int i = 0; i < length1; i++)
		{
			for (int j = 0; j < length2; j++)
				if (a[i] == b[j]) 
				{
					al.add(a[i]);
				}
		}//for
		System.out.println(al);

	}//main

}//class
