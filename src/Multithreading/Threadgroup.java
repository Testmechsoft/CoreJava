package Multithreading;

public class Threadgroup implements Runnable {
	//Java provides a convenient way to group multiple threads in a single object. 
	//In such way, we can suspend, resume or interrupt group of threads by a single method call.

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

	}

	public static void main(String[] args) {

		Threadgroup runnable = new Threadgroup();

		ThreadGroup tg1 = new ThreadGroup("parent thread group");

		Thread t1 = new Thread(tg1, runnable, "First");
		t1.start();
		
		Thread t2 = new Thread(tg1, runnable, "Second");
		t2.start();
		
		Thread t3 = new Thread(tg1, runnable, "Third");
		t3.start();
		
		   System.out.println("Thread Group Name: "+tg1.getName());  
	        tg1.list();  

	}

}
