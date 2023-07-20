package JavaBasicsFirstDay;
import java.util.Scanner;

public class Loops {
	public static void main(String...ar)
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter no.for table,sum and factorial");
	int num=sc.nextInt();
	int res,sum=0,fact=1, i=1;
	for(;i<=10;i++)
	{
		res=i*num;
		System.out.println(num+"*"+i+"="+res);
		sum=sum+i;
		System.out.println("sum of n numbers:"+sum);
	}
	//Factorial
	for(i=1;i>=num;i++)
	{
		fact=fact*i;
		System.out.println("factorial of the number"+fact);
	}

}
}