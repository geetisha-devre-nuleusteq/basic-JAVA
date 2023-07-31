package JAVADayThree;
import java.util.Scanner;

class DimException extends Exception{
	public DimException(String str)
	{super(str);}
}
public class RectangleDimensions {
	public static void main(String...ar)
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter length and breadth of Rectangle ");
	int length=sc.nextInt();
	int breadth=sc.nextInt();
	try {
		invalid(length,breadth);
	}
	catch(DimException ex)
	{System.out.println("Exception"+ex);}
	}
	static void invalid(int length,int breadth)throws DimException {
		if(length<=0||breadth<=0)
		{throw new DimException("invalid dimensions");
		}
		else 
			System.out.println("area of rectangle is"+" "+length*breadth);
	}

}
