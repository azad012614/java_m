package thrds3;

public class Task2 implements Runnable {
	private Thread t1;

	public Task2(Thread t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		System.out.println("Thrd " + Thread.currentThread().getName() + " strted");
		try {
			
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " waiting for t1 to finish exec ");
			t1.join();//t2 : Blocked on join
			System.out.println("t1 : over ...");
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + " " + e);
		}
		System.out.println("Thrd " + Thread.currentThread().getName() + " over");

	}

}
