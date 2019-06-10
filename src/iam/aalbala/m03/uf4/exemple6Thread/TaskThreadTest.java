package iam.aalbala.m03.uf4.exemple6Thread;

public class TaskThreadTest {

	public static void main(String[] args) {
		Task1 task1 = new Task1();
		Thread thread1 = new Thread(task1);
		System.out.println("Abans Start");
		thread1.start();
		
		System.out.println("En paralel");
		for (int i = 0; i < 10; ++i) {
			System.out.println("Han pasat " + i + " segon(s) test");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.err.println("Error: " + e.toString());
			}
		}
	}
}
