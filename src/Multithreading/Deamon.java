package Multithreading;

//Daemon thread in java is a service provider thread that provides services to the user thread. Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically.
//
//There are many java daemon threads running automatically e.g. gc, finalizer etc.
public class Deamon extends Thread {

	public void run() {

		if (Thread.currentThread().isDaemon()) {
			System.out.println("Deamon thread");
		}

		else {
			System.out.println("User thread");
		}
	}
	
	public static void main (String [] args){
		
		Deamon d1 = new Deamon();
		Deamon d2 = new Deamon();
		Deamon d3 = new Deamon();
		
		d2.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();
		
		
		
	}

}
