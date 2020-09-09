package chapter11;
public class Demojoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newthread1 at1=new newthread1("one");
		newthread1 at2=new newthread1("two");
		newthread1 at3=new newthread1("three");
		at1.t.start();
		at2.t.start();
		at3.t.start();
		System.out.println("Thread One is alive: "+at1.t.isAlive());
		System.out.println("Thread Two is alive: "+at2.t.isAlive());
		System.out.println("Thread Three is alive: "+at3.t.isAlive());
		try {
			System.out.println("Wating for Threads to finish.");
			at1.t.join();
			at2.t.join();
			at3.t.join();
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Thread one is alive: "+at1.t.isAlive());
		System.out.println("Thread Two is alive: "+at2.t.isAlive());
		System.out.println("Thread Three is alive: "+at3.t.isAlive());
		System.out.println("Main Thread Exiting");
		
	}

}
