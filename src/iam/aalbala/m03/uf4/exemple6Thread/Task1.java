package iam.aalbala.m03.uf4.exemple6Thread;

public class Task1 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; ++i) {
			System.out.println("Han pasat " + i + " segon(s)");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println("Error: " + e.toString());
			}
		}
	}
}
