package thrds2;

public class Tester {

	public static void main(String[] args) throws Exception {
		System.out.println(Thread.currentThread());
		// create child thrds & test concurrency
		MyRunnableTask m1 = new MyRunnableTask();
		Thread t1 = new Thread(m1, "one");//NEW
		t1.start();//RUNNABLE
		Thread t2 = new Thread(m1, "two");
		t2.start();
		Thread t3 = new Thread(m1, "three");
		t3.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Counter " + i + " " + Thread.currentThread().getName());
			Thread.sleep(100);
		}
		System.out.println(t1.isAlive() + " " + t3.isAlive());
		t1.join();
		t2.join();
		t3.join();
		System.out.println("main over....");
	}

}
