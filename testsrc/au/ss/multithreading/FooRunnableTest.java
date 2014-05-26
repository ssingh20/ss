package au.ss.multithreading;

import org.junit.Test;

public class FooRunnableTest {

	@Test
	public void testRun() throws InterruptedException
	{
		FooRunnable foo = new FooRunnable();
		Thread[] threads = new Thread[10];
		
		for(int i=0; i<10; i++)
		{
			threads[i] = new Thread(foo, "Thread_" + i);
			threads[i].start();
		}
		
		for(int i=0; i<10; i++)
		{
			threads[i].join();
		}
		
		System.out.println("End");
		
	}
}
