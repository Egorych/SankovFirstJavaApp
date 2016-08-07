package DeadLockHW;

	public class ThreadOne extends Thread {
		Thread t2;

		public ThreadOne() {
		System.out.println("ThreadOne create");

		}

		public void run() {
		System.out.println("ThreadOne start");
		try {
		sleep(1000);
		} catch (Exception e) {
		}
		try {
		System.out.println("ThreadOne waiting ThreadTwo finish…");
		t2.join();

		} catch (Exception e) {e.printStackTrace();}
		System.out.println("ThreadOne finished");
		}

		public void setThread2(Thread t) {
		this.t2 = t;
		}
		}