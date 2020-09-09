package chapter11;
class Q{
	int n;
	synchronized int  get1() {
		System.out.println("Got: "+n);
		return n;
		
	}
	synchronized void put1(int n) {
		this.n=n;
		System.out.println("put: "+n);
	}
}
class producer implements Runnable{
	Q q;
	Thread x;
	producer(Q q){
		this.q=q;
		x=new Thread(this,"producer");
	}
	public void run() {
		int i=0;
		while(true)
		{
			
			q.put1(i++);
		
	}
}
}
class consumer implements Runnable{
	Q q;
	Thread x;
	consumer(Q q){
		this.q=q;
		x=new Thread(this,"consumer");
	}
	public void run() {
		
		while(true)
		{
			
			q.get1();
			
		}
	}
}
public class pc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Q q=new Q();
				producer p=new producer(q);
				consumer c=new consumer(q);
				
				p.x.start();
				c.x.start();
				System.out.println("Pleas control-c to stop");
	}

}

