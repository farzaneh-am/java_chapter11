package chapter11;
class newthread1 implements Runnable{
	String name;
	Thread t;
	newthread1(String threadName){
		name=threadName;
		t=new Thread(this,name);
		System.out.println("New Thread "+t);
		
	}
	public void run() {
		try {
			for(int i=5;i>0;i--)
			{
				System.out.println(name + " : "+ i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println(name+" Interrupted");
		}
		System.out.println(name+" Exiting");
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newthread1 mt=new newthread1("one");
		newthread1 mt1=new newthread1("two");
		newthread1 mt2=new newthread1("three");
		mt.t.start();
		mt1.t.start();
		mt2.t.start();
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
		

	}

}
