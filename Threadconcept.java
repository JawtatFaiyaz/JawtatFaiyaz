package mint;

public class Threadconcept extends Thread {
	public void run() 
	{
		System.out.println(" thread is started");
		for(int i=0;i<5;i++) {
			System.out.println(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Threadconcept t = new Threadconcept();
		int i = t.getPriority();
		System.out.println(" the priority of main method" + i);
		System.out.println(t.getName());
		t.setName(" main ");
		System.out.println(" renamed thread" + t.getName());

		t.start();
	}// main
}// class
