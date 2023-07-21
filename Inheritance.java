package JavaDay2;

class Parent {
	public void print()

	{System.out.println("parent");}
	
}
 class Child extends Parent{
	  
	 public void print()
	 {System.out.println("child-single inheritence");}}
	 
	class ChildSec extends Child
	{public void print()
		{System.out.println("child2-herarchial");}
	}
	
	class ChildThird extends Parent
	{
		public void print()
		{System.out.println("child3-multileve inheritance parent's child");}
		
	}
	
	 class Child5 extends Child implements ChildFour{
		 
		 public void prints() {
			 System.out.println("I am an example of multiple inheritence ");
		 }
	 }
	 abstract class Bike{
		 abstract void bike() ;
	 }
 
	
 public class Inheritance extends Bike{
	 
	 public static void main(String...ar)
	 {
		 Parent p=new Parent();
		 p.print();
		 Child ch=new Child();
		 ch.print();
		 ChildSec ch1=new ChildSec();
		 ch1.print();
		 ChildThird ch2=new ChildThird();
		 ch2.print();
		 Child5 ch3=new Child5();
		 ch3.prints();
		 Inheritance in=new Inheritance();
		 in.bike();
	 }
	 
	 void bike() {System.out.println(" abstract example");}
	 
	 
	 
 }