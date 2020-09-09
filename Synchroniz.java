package chapter11;
class callme{
	synchronized void call(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}
 class caller implements Runnable{
	String msg;
	callme target;
	Thread z;
	public caller(callme targ,String s) {
		msg=s;
		target=targ;
		z=new Thread(this);
	}
	public void run() {
		target.call(msg);
	}
}
public class Synchroniz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callme target=new callme();
		caller ob1=new caller(target,"Hello");
		caller ob2=new caller(target,"synchronized");
		caller ob3=new caller(target,"world");
		ob1.z.start();
		ob2.z.start();
		ob3.z.start();
		try {
			ob1.z.join();
			ob2.z.join();
			ob3.z.join();
			
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

}
