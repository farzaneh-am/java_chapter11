package chapter11;

 class TestdaemonThread extends Thread{
      
        public void run(){  
         System.out.println("Name: "+Thread.currentThread().getName());  
         System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
        }  
         
        public static void main(String[] args){  
        	TestdaemonThread t1=new TestdaemonThread();  
        	TestdaemonThread t2=new TestdaemonThread();  
         t1.start();  
         t1.setDaemon(true);//will throw exception here  
         t2.start();  
        }  
       }  