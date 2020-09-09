package chapter11;
class callme1{
	 void call1(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}
 class caller1 implements Runnable{
	String msg;
	callme1 target;
	Thread z1;
	public caller1(callme1 targ,String s) {
		msg=s;
		target=targ;
		z1=new Thread(this);
	}
	public void run() {
		synchronized(target) {
		target.call1(msg);
	}
}
 }
public class Synchroniz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callme1 target=new callme1();
		caller1 ob1=new caller1(target,"Hello");
		caller1 ob2=new caller1(target,"synchronized");
		caller1 ob3=new caller1(target,"world");
		ob1.z1.start();
		ob2.z1.start();
		ob3.z1.start();
		try {
			ob1.z1.join();
			ob2.z1.join();
			ob3.z1.join();
			
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

	}


