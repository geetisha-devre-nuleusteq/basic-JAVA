package JavaBasicsFirstDay;
import java.util.Scanner;
public class LoopsArmstrong {
	public static void main(String...ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num to check whether its an armstrong and reverse the  number");
		int num=sc.nextInt();
		int rem=0,num1=num,rev=0;
		for(;num>0;)
		{rem=num%10;
		num=num/10;
		rev=rev*10+rem;

		rem=rem+(rem*rem*rem);}
		System.out.println("reverse of the number is:"+rev);
		if(rem==num1)
			System.out.println(num1+" is armstrong");
		else
			System.out.println("not a armstrong num");
		if(rev==num1)
		{System.out.println("number is a pallindrome");}
		else
			System.out.println("the entered number is not a pallindrome");
	}

}
