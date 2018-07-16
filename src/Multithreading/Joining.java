package Multithreading;

public class Joining extends Thread {

	public void run() {
		for (int i = 0; i < 2; i++) {

			System.out.println("Current Thread: " + Thread.currentThread().getName() + "---" + i);
		}

	}

	public static void main(String[] args) throws InterruptedException {

		Joining t1 = new Joining();
		Joining t2 = new Joining();
		Joining t3 = new Joining();

		t1.setName("first");
		t2.setName("second");
		t3.setName("third");
		
		t2.start();
		t1.join();
		
		t1.start();
		t3.start();

	

	

	}

}
