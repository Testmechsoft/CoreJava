package Multithreading;

public class Using_class extends Thread{
	

	public void run() {

		System.out.println("current run methods thread id is:" + Thread.currentThread().getId());

		System.out.println("current run methods thread name is:" + Thread.currentThread().getName());
	}
	

	public static void main(String[] args) {
		
		System.out.println("current main methods thread id is:" + Thread.currentThread().getId());

		System.out.println("current main methods thread name is:" + Thread.currentThread().getName());
		
		Using_class u = new Using_class();
		
		u.start();
		

	}

}
