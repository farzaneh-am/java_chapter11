package chapter11;

public class JavaSetPriorityExp_2 extends Thread{
	public void run() {
		System.out.println("running.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaSetPriorityExp_2 t=new JavaSetPriorityExp_2();
		JavaSetPriorityExp_2 t1=new JavaSetPriorityExp_2();
		t.setPriority(4);
		t1.setPriority(7);
		System.out.println("priority of Thread t is:"+t.getPriority()+"  "+t.getState());
		System.out.println("priority of Thread t1 is:"+t1.getPriority()+t1.toString());
		
		t.start();
		
		

	}

}
