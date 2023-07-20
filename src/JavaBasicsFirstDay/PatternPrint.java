package JavaBasicsFirstDay;
import java.util.Scanner;
public class PatternPrint {
	public static void main(String...ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ienter a number for pattern printing");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{  for(int j=1;j<=i;j++)
			System.out.print(i+" ");
		
		  System.out.println();
		}
		
	}

}
