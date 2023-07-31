package JavaDay2;
//Nested Inner Class
//Method Local Inner Classes
//Static Nested Classes
//Anonymous Inner Classes
 class Inner {
	
	public  void show() {System.out.println("hello");}
	class OuterClass{
		public void shows()
		{System.out.println("this is an example of nested inner classs");}
	}

}
 class Outer{
	 public  void gratitude() {
		 System.out.println("i am thankful");
 class InnerClass{
			 public static void complete() {
				 System.out.println("for the warm welcome");
			 }
		 }
		 InnerClass ic=new InnerClass();
		 ic.complete();
	 }
 }
  class StaticOuter{
	  public static void example() {
		  System.out.println("hello");
		  
	  }
	  static class InnerStatic{
		  
		  void method() {example();System.out.println("I am an static inner nested class");
		  }
		  
	  }
  }
  class Examp{
	  void shows() {System.out.println("hello");}
  }
  class Anonymous{
	  public static Examp ex =new Examp() {
		  void shows(){super.shows();
		  System.out.println("i am anonymous inner class");}
	  };
  }
 public class InnerClass{
	 
	 public static void main(String...ar)
	 {Inner in=new Inner();
	 in.show();
	Inner.OuterClass oc = new Inner().new OuterClass();
	oc.shows();
	Outer out=new Outer();
	out.gratitude();
	StaticOuter outer=new StaticOuter();
	outer.example();
	StaticOuter.InnerStatic icc=new StaticOuter.InnerStatic();
	icc.method();
	new Anonymous().ex.shows();
	
	
	
 }
}