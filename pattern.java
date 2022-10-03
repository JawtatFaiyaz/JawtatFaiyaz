package mint;

public class pattern {

	public static void main(String[] args) {
		String s = "a2v3b1c2";
		System.out.println("input string" + " " + s);
		for (int i = 0; i < s.length() - 1; i++) {
			if (i % 2 == 0) {
				// System.out.println('a'-30);
				for (int j = 0; j < s.charAt(i + 1) - 48; j++) // aasci value for 0 is 48

				{
					// System.out.println(s.charAt(i));
				}
			}
		}
	}// main
}// class

/*
 * -------------------------------------------------------------- package mint;
 * 
 * public class pattern {
 * 
 * public static void main(String[] args) { String s = "a2v3b1c2";
 * System.out.println("input string"+" "+s); char[] sgetter = s.toCharArray();
 * int a[] = new int[sgetter.length];
 * 
 * for (int i = 0; i < s.length(); i++) { a[i] = (int) sgetter[i];
 * 
 * } // for System.out.println(" printing into an array"); for (int aa : a) {
 * System.out.print("["+(char) aa+" "+"]"); } System.out.println();
 * System.out.println("the split array");
 * 
 * for (int z = 0; z < a.length; z++) { int limit[]= new int [a.length/2]; if (z
 * % 2 != 0) {
 * 
 * for(int j =0;j<a.length/2;j++) { //
 * 
 * System.out.println((char) a[z]); //limit[j]=a[z]; // System.out.println(
 * limit[j]=(char) a[z]);
 * 
 * }
 * 
 * }
 * 
 * 
 * else { int count=0; char printer[]= new char [a.length/2]; for(int j
 * =0;j<a.length/2;j++) { printer[j] =(char) a[z]; count++; if( limit[j]==count)
 * System.out.println(printer); } //System.out.println((char) a[z]);
 * 
 * }
 * 
 * } // for }// main }// class
 * 
 */
//----------------------
/*
 * char[] sgetter = s.toCharArray(); int a[] = new int[sgetter.length];
 * 
 * for (int i = 0; i < s.length(); i++) { a[i] = (int) sgetter[i];
 * 
 * } // for System.out.println(" printing into an array"); for (int aa : a) {
 * System.out.print("["+(char) aa+" "+"]"); } System.out.println();
 * System.out.println("the split array");
 * 
 * for (int z = 0; z < a.length; z++) { int limit[]= new int [a.length/2]; if (z
 * % 2 != 0) {
 * 
 * 
 * //
 * 
 * System.out.println((char) a[z]); limit[z]=a[z]; // System.out.println(
 * limit[z]=(char) a[z]);
 * 
 * }
 * 
 * 
 * 
 * 
 * else { int count=0; char printer[]= new char [a.length/2]; for(int j
 * =0;j<a.length/2;j++) { printer[j] =(char) a[z]; count++; if( limit[j]==count)
 * System.out.println(printer); } //System.out.println((char) a[z]);
 * 
 * }
 * 
 * } // for
 */