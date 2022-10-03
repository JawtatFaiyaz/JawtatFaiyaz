
public class pattern2 {
	public static void main(String[] args) 
	{
		String s = " a2v3b1";
	int limit;
	char[] sgetter = s.toCharArray();
	/*int a[] = new int[sgetter.length];
	char b []=new char[sgetter.length];*/
	for(int i =0;i<sgetter.length-1;i++)
	{
		
		if(i%2==0)
			 limit =sgetter[i+1];
		for (int j =0;j<= limit;j++) 
		{
			System.out.println(sgetter[i]);
		}
		
	}//for
	}// main
}
// class
