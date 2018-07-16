package Multithreading;

public class run_insteadof_start extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {

		run_insteadof_start r1 = new run_insteadof_start();
		run_insteadof_start r2 = new run_insteadof_start();

		//r1.start();
		//r2.start();//context  switching
		
		r1.run();//NO context  switching
		r2.run();
	}

}
