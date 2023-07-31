package JAVAMultithreading;

public class ThreadState extends Thread {
public void run() {
	ThreadState tm2=new ThreadState();
	tm2.start();
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("hello I am Thread 2 !!"+"I am in "+tm2.getState()+"State");

	try {System.out.println("hello I am Thread !!"+Thread.currentThread().getName()+"I am in "+Thread.currentThread().getState()+"State");}
	catch(Exception e)
	{System.out.println("Exception");}
}
public static void main(String...ar) throws Exception
{ThreadState tm1=new ThreadState();
System.out.println("hello I am Thread 1 !!"+"I am in "+tm1.getState()+"State");


ThreadState tm3=new ThreadState();

//ThreadState tm4=new ThreadState();
tm1.setName("first");


tm3.setName("three");


tm1.start();
tm3.start();

}
}
