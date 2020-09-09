package chapter11;

public class CurrentTreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("current thread: "+t);
		t.setName("Farzaneh");
		System.out.println("After change name: "+t);
		try {
			for(int i=5;i>0;i--)
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
				
		}catch(InterruptedException e) {
			System.out.println("main thread intrrupted");
		}

	}

}
