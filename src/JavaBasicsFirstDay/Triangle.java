package JavaBasicsFirstDay;
import java.util.Scanner;
public class Triangle {
	public static void main(String...ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("input height and base");
		float height=sc.nextFloat();
		float base=sc.nextFloat();
		double area;
		area=0.5*height*base;
		System.out.println("area of triangle is:"+area);
		
		//roots of  quadratic equation
		System.out.println("enter values for b a and c for quadratic equation");
		int b=sc.nextInt();
		height=b*b;
		int a=sc.nextInt();
		int c=sc.nextInt();
		c=(int) (height-(4*a*c));
		if(c>=0)
		{area=Math.sqrt(c);
		area=(-b+area)/2*a;
		c=(int) ((-b-area)/2*a);}
		else 
			System.out.println("imaginary roots");
				
	}

}
