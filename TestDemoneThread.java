package chapter11;
public class TestDemoneThread extends Thread{  
    public void run(){  
     if(Thread.currentThread().isDaemon()){//checking for daemon thread  
      System.out.println("daemon thread work");  
     }  
     else{  
     System.out.println("user thread work");  
    }  
    }  
    public static void main(String[] args){  
    	TestDemoneThread t1=new TestDemoneThread();//creating thread  
    	TestDemoneThread t2=new TestDemoneThread();  
    	TestDemoneThread t3=new TestDemoneThread();  
     
     t1.setDaemon(true);//now t1 is daemon thread  
       
     t1.start();//starting threads  
     t2.start();  
     t3.start();  
    }  
   }  