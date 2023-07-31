package JAVAMultithreading;

class Display extends Thread{
	public void run()
	{try{
		
		new SeriesOverThread().display(10);
	
		
		
	}
	catch(Exception e)
	{System.out.println("exception");}}
	
}

class Reverse extends Thread
{public void run()
{try{
	
	new SeriesOverThread().reverse(10);

	
	
}
catch(Exception e)
{System.out.println("exception");}}

}


class Fibonacci extends Thread
{public void run()
{
	System.out.println("max priority");
	try{
	
	new SeriesOverThread().fibonacci(10);

	
	
}
catch(Exception e)
{System.out.println("exception");}}

}
class Sum extends Thread
{public void run()
{try{
	
	new SeriesOverThread().sum(10);

	
	
}
catch(Exception e)
{System.out.println("exception");}}

}


	

public class SeriesOverThread {
	

	public static void main(String...ar)
	{
		
		Fibonacci f=new Fibonacci();
		f.setPriority(10);
		f.start();
		Sum s=new Sum();
		s.start();
		Display d=new Display();
		d.start();
		Reverse r=new Reverse();
		r.start();
		
		
		}
	
	public void display(int num)
	{
		int i=0;
		while(i<num)
		{System.out.println(i);
		i++;}}
	public void fibonacci(int num)
	{
		int no=0;
		for(int i=0;i<=num;i++)
		{no=no+i;
		System.out.println("fibonacci series"+"  "+no);}}
	
	public void reverse(int num)
	{for(int i=num;i>=0;i--)
		{
		System.out.println("reverse"+i);
		}}
	
	public void sum(int num)
	{int i=0,sum=0;
	while(i<=num)
		{sum=i+sum;
		i++;}
	System.out.println("sum of the numbers"+sum);}
	

}
