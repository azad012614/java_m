package thrds1;

public class Tester {

	public static void main(String[] args) throws Exception{
		System.out.println(Thread.currentThread());
		//create child thrds & test concurrency
		MyThread m1=new MyThread("one");
		MyThread m2=new MyThread("two");
		MyThread m3=new MyThread("three");
		for (int i = 0; i < 10; i++) {
			System.out.println("Counter " + i + " " + Thread.currentThread().getName());
			Thread.sleep(1000);
		}
		System.out.println(m1.isAlive()+" "+m3.isAlive());
		System.out.println("main over....");
	}

}
