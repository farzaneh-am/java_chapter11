package chapter11;
class newThread_1 implements Runnable{
	Thread t;
	 newThread_1() {
		t=new Thread(this,"Demo Thread");
		System.out.println("Child Thread "+t);
	}
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child Thread "+i);
				Thread.sleep(500);
				
			}
			
		}catch(InterruptedException e) {
			System.out.println("Child Interrupted");
			
		}
		System.out.println("Exiting Child Thread ");
		
	}
}
public class TreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		newThread_1 nt=new newThread_1();
		nt.t.start();
		
			try {
				for(int i=5;i>0;i--) {
					System.out.println("Main Thread "+i);
					Thread.sleep(1000);
					
				}
				
			}catch(InterruptedException e) {
				System.out.println("Main Thread Interrupted");
				
			}
			System.out.println("Main Thread Exiting ");
			
		
	}

}
