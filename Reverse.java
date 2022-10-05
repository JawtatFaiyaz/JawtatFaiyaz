package stringpractise;

public class Reverse {

	char[] reversal(String a) {
		// by using an array
		char ch []= a.toCharArray();
		char reverse []= new char [ch.length];
		
		for (int i = ch.length-1;i>=0;i--) {
			 
			System.out.print(ch[i]);
		for (int j =0 ;j<reverse.length;j++) {
			 reverse [j]=ch[i];
		}
		}
		System.out.println();
			return ch;
			
	}// method 
	// reversing a string and returning an reverse string
	String reversal1(String a) {
		
		char ch[] = a.toCharArray();
		String reverse= "";
		
		for (int i = ch.length-1;i>=0;i--) {
			reverse = reverse + ch[i];
		}
		
		
		return reverse;	
	}
	
	
	
	public static void main(String[] args) {
		Reverse a  =  new Reverse();
		System.out.println(a.reversal("india"));
		System.out.println(a.reversal1("desi"));

	}

}
