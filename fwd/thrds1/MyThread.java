package thrds1;

public class MyThread extends Thread {
	// constr
	public MyThread(String nm) {
		super(nm);// NEW
		start();// RUNNABLE
	//	run();
	}

	@Override
	public void run() // throws InterruptedException
	{
		System.out.println("strted " + Thread.currentThread().getName());
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Counter " + i + " " + Thread.currentThread().getName());
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("err in " + getName() + " " + e);
		}
		System.out.println("over " + getName());

	}
}
