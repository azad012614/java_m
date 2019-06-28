package thrds3;

public class Tester {

	public static void main(String[] args) throws Exception {
		System.out.println(Thread.currentThread());
		// create child thrds
		Thread t1 = new Thread(new Task1(), "t1");
		Thread t2 = new Thread(new Task2(t1), "t2");
		t1.start();
		t2.start();
		System.out.println("main waiting for child thrds to finish");
		t1.join();
		t2.join();
		System.out.println("main over....");
	}

}
