package mint;

// thread
public class Add extends Thread {
	public  void run () {
		for (int i =0;i<6;i++) {
			System.out.println(i);
		}
	}

}
