package Multithreading;

public class Priority implements Runnable {

	@Override
	public void run() {

		System.out.println("current run methods thread id is:" + Thread.currentThread().getId()
				+ "----"+ "name is:" + Thread.currentThread().getName());

	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("current main methods thread id is:" + Thread.currentThread().getId()
				+ "-----"+" name is:" + Thread.currentThread().getName());

		Priority p = new Priority();

		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
	

		t3.setName("first thread");
		t2.setName("Second thread");
		t1.setName("Third thread");

		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		Thread.sleep(2000);
		t2.start();
		Thread.sleep(2000);
		t3.start();

	}

}
