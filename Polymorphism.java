package JavaDay2;

class PolymorphismM {
	
	//overloading
	public int add(int a,int b)
	{int c;
	c=a+b;
	return c;}
	
	public int add(int a,int b,int c)
	{int d;
	d=a+b+c;
	return d;}
	
	//overriding
	
	public void multiply(int a,int b)
	{int c;
	c=a*b;
	System.out.println("multiplication:"+a+"*"+b+"="+c);
}

}
public class Polymorphism extends PolymorphismM{
	public static void main(String...ar)
	{
		int b;
		Polymorphism poly=new Polymorphism();
	b=	poly.add(2, 3);
	System.out.println("overloading"+b);
		b=poly.add(1, 2, 3);
		System.out.println(b);
		poly.multiply(4,5);
		Polymorphism a;
		a=new Polymorphism();
		a.multiply(7,8);
	}

	public void multiply(int a,int b)
	{for(int i=0;i<b;i++)
		{a=a+a;}
	System.out.println("multiplication result:"+a);}
	
}