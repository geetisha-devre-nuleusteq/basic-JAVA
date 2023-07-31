package JavaBasicsFirstDay;
import java.util.Scanner;
public class BitwiseUse {
public static void main(String...ar)
{Scanner sc=new Scanner(System.in);

	System.out.println("enter a number to see its left and right shift");
	int a =sc.nextInt();
	System.out.println("enter two nos. to check bitwise results");
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	System.out.println(a>>1 );
	System.out.println(a<<1);
	System.out.println("result of &  "+(b&c));
	System.out.println("result of |  "+(b|c));
	
	
	

}
}
