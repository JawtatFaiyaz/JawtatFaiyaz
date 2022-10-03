package mint;

public class iinterface {
// thread
	public static void main(String[] args) throws InterruptedException {
		Add a = new Add();
		subract s = new subract();
		
		a.setPriority(7);
		s.setPriority(10);
		System.out.println(" started");
		a.start();
		Thread.sleep(1000);
		s.start();
		System.out.println(" ended");
	}

}
