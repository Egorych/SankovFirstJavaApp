package ThreadHomework;

import java.util.Scanner;

public class MainThreadHW {

	public static void main(String[] args) {
		
		ThreadHW thwone = new ThreadHW();
		ThreadHW thwtwo = new ThreadHW();
		thwone.setName("Thread 1");
		thwtwo.setName("Thread 2");
		System.out.println("Enter 'start' for starting the streams");
		try (Scanner sc = new Scanner(System.in)) {
			String s1;
			s1 = sc.nextLine();
			if (s1.equals("start")) {
				thwone.start();
				thwtwo.start();
			} else {
				System.out.println("Exception!!! You must enter 'start' ");
			}
		}

	}
}
