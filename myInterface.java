package mint;

public class myInterface extends iinterface
implements Runnable {
// in this class we cannot extend more than one class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myInterface r = new myInterface ();
		Thread t = new Thread();
		t.start();
	}

	@Override
	public void run() {
		System.out.println(" run");
		
	}

}
