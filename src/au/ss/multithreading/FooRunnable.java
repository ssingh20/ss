package au.ss.multithreading;

public class FooRunnable implements Runnable {

	@Override
	public void run() {

		System.out.println("Running thread with id[" + Thread.currentThread().getId() + "] name[" + Thread.currentThread().getName() + "]");

	}

}
