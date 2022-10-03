package arrayprograms.org;

  public class Bank {
	int balance;

	void credit() {
		balance = balance + 100;
	}
 }
	class myThread {
		Bank obj;

		myThread(Bank obj) {
			this.obj = obj;
		}

	}

	 class SyncDemo
	{

		public static void main(String[] args) {
			Bank b = new Bank();
			myThread m = new myThread(b);
			Thread t = new Thread(new Runnable() {
				public void run() {
					for(int i=0;i<5;i++) {
						b.credit();
					
					}//for
				}//method
			}); // constructor

		}//main
	}
// class
