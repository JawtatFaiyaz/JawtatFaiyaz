package mint;

public class elementFinder {
// a program to find the frequency of each element in an array 
	public static void main(String[] args) {
		int orginal[] = { 10, 20, 30, 40 ,10,20,30 ,40,10,50,80,90};
		int manipulate[] = new int[orginal.length];
		int frequency[] = new int[orginal.length];
		for (int j = 0; j < orginal.length; j++) {
			if (manipulate[j] >= 0) {
				int count = 1;
				for (int k = j + 1; k < orginal.length ; k++) {
					if (orginal[j] == orginal[k]) {
						manipulate[j] = -1;
						count++;

					} // nestedif
				} // nestedfor
				frequency[j] = count;

			} // if

		} // firstfor
		 
		for (int i =0;i<orginal.length;i++)
			if (frequency[i] >=1) {
		System.out.println(frequency[i]+" this element has occured"+frequency[i]);
		}

	}// main
}// class
