package chapter11;

public class JavaSetPriorityExp_1 extends Thread{
	public void run() {
		System.out.println("priority of Thread is: "+ Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaSetPriorityExp_1 t=new JavaSetPriorityExp_1();
		JavaSetPriorityExp_1 t1=new JavaSetPriorityExp_1();
		JavaSetPriorityExp_1 t2=new JavaSetPriorityExp_1();
		
		t.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		
		t.start();
		t1.start();
		t2.start();
	}

}
