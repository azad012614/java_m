package thread;

public class MThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for(int i=0;i<10;i++) {
		//Thread t=new Thread(new MultiThread());
		//t.start();
	MultiThread mt = new MultiThread();
	Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
		try {
			mt.producer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	});
	
		Thread t2 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					mt.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
			t1.start();
			t2.start();
			try {
				t1.join();t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
}
	}
