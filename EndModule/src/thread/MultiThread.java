package thread;

import java.util.LinkedList;
import java.util.List;

public class MultiThread{
	LinkedList<Integer> ls=new LinkedList<Integer>();
	int capacity=1;
	public void producer() throws InterruptedException{
		int value=0;
	while(true) {	
		synchronized (this) {
			while(ls.size()==capacity)
				wait();
			System.out.println("producer produce "+value);
			ls.add(value++);
			notify();
			Thread.sleep(1000);
		}
	}
	}
public void consume() throws InterruptedException{
	while(true) {
	synchronized (this) {
		while(ls.size()==0)
			wait();
		int val=ls.removeFirst();
		System.out.println("Consumer consumes "+val);
		notify();
		Thread.sleep(1000);
	}
	}
}
}
