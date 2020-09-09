package chapter11;

public class JavaSetPriorityExp_3 extends Thread {
	public void run() {
		System.out.println("running......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaSetPriorityExp_3 t=new JavaSetPriorityExp_3();
		t.setPriority(12);//Error IllegalArgumentException because priority is greater than 10 
		t.start();
		System.out.println("pririty of Thread t is: "+ t.getPriority());

	}

}
