package chapter11;

public class TestMultiPriority extends Thread{
public void  run() {
	System.out.println("running thread name is: "+Thread.currentThread().getName());
	System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultiPriority i1=new TestMultiPriority();
		TestMultiPriority i2=new TestMultiPriority();
		i1.setPriority(Thread.MIN_PRIORITY);
		i2.setPriority(Thread.MAX_PRIORITY);
		i1.start();
		i2.start();

	}

}
