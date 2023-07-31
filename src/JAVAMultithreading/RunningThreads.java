package JAVAMultithreading;

class MultiThreads extends Thread{
public void run()
{
	try {
		System.out.println("current thread:"+Thread.currentThread().getName()+"is running");
		
	}
	catch(Exception e)
	{System.out.println("exception");}
}
}

public class RunningThreads {
	public static void main(String...ar)
	{int i=0;
		while(i<3)
		{MultiThreads mt=new MultiThreads();
		mt.start();
		i++;}
	}	
	
	

}
