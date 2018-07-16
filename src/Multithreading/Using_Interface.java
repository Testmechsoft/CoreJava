package Multithreading;

public class Using_Interface implements Runnable {

	public void run() {

		System.out.println("current run methods thread id is:" + Thread.currentThread().getId());

		System.out.println("current run methods thread name is:" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		System.out.println("current main methods thread id is:" + Thread.currentThread().getId());

		System.out.println("current main methods thread name is:" + Thread.currentThread().getName());

		Using_Interface e = new Using_Interface();

		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		

		t1.start();
		t2.start();

	}
}
