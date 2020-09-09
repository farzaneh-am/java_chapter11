package chapter11;
class newthread extends Thread{
	newthread(){
		super("Demo Thread");
		System.out.println(" child Thread"+this);
	}
		public void run() {
			try {
				for(int i=5;i>0;i--) {
						System.out.println("child Thread: "+i);
						Thread.sleep(500);
				}
			}catch(InterruptedException e) {
				System.out.println("child Interrupted.");
				
			}
			System.out.println("Exiting child thread");
			
		}
	
}

public class ExtendThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newthread nt=new newthread();
		nt.start();
		try {
			for(int i=5;i>0;i--) {
					System.out.println("Main Thread: "+i);
					Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Main Interrupted.");
			
		}
		System.out.println("Exiting Main thread");
		
	}

	}



