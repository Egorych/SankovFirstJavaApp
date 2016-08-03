package ThreadHomework;

public class ThreadHW extends Thread {

	synchronized public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + ":" + (i * 10 + 1) + " " + (i * 10 + 2) + " " + (i * 10 + 3) + " " + (i * 10 + 4) + " "
					+ (i * 10 + 5) + " " + (i * 10 + 6) + " " + (i * 10 + 7) + " " + (i * 10 + 8) + " " + (i * 10 + 9)
					+ " " + (i * 10 + 10));
		}
	}
}