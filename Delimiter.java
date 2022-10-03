package mint;

public class Delimiter {

	public static void main(String[] args) {
		/*
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * 
		 * System.out.println("the orginal string"); System.out.println(s);
		 * //System.out.println(s.trim()); String [] s1=s.split(""); for (int i =
		 * 0;i<s.length();i++ ) { StringBuilder s2= sb.append(s1[i]); } //String
		 * s3[]=s2.split();
		 * 
		 * 
		 * System.out.println( s2); //for (String k : s2) { //System.out.println(k);
		 */	
		
		String s = "abi ram ravi raja rani";
		s= s.replaceAll("\\s","");
		System.out.println(s);

	}//main

}//class
