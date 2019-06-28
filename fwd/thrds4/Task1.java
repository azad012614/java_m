package thrds4;

public class Task1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thrd "+Thread.currentThread().getName()+" strted");
		try {
			for (int i=0;i<5;i++)
			{
				System.out.println("Enter data");
				System.in.read();
				Thread.sleep(10);
			}
		}catch (Exception e) {
			System.out.println("err in thrd "+Thread.currentThread().getName()+" "+e);
		}
		System.out.println("Thrd "+Thread.currentThread().getName()+" over");
		
	}

}
