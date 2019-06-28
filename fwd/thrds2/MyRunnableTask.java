package thrds2;

public class MyRunnableTask implements Runnable {
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
			System.out.println("err in " + Thread.currentThread().getName() + " " + e);
		}
		System.out.println("over " +Thread.currentThread().getName());

	}
}
