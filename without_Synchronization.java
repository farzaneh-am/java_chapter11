package chapter11;
class tab{  
void printTab(int n){ 
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class myThread_1 extends Thread{  
tab t;  
myThread_1(tab t){  
this.t=t;  
}  
public void run(){  
t.printTab(5);  
}  
  
}  
class myThread_2 extends Thread{  
tab t;  
myThread_2(tab t){  
this.t=t;  
}  
public void run(){  
t.printTab(100);  
}  
}  
public class without_Synchronization {
	public static void main(String args[]){  
		tab obj = new tab(); 
		myThread_1 t1=new myThread_1(obj);  
		myThread_2 t2=new myThread_2(obj);  
		t1.start();  
		t2.start();  
		}  

}
