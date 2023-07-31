package LambdaConcepts;

import java.util.Arrays;

interface Lambda{
	
	String func(String str);
}
public class LambdaExpression {
public static void main(String...ar)
{
	Lambda ex=(String str)->{
		int n=0;
		char []arr=new char[str.length()];
		while(n<str.length())
		{
			if((str.charAt(n)=='a')||(str.charAt(n)=='e')||(str.charAt(n)=='i')||(str.charAt(n)=='o')||(str.charAt(n)=='u'))
				{arr[n]='#';
				
				}
			
			else
			arr[n]=str.charAt(n);
			n++;
			
			
		}
		return String.valueOf(arr);
	};
	System.out.println("string is"+" "+ex.func("alpha"));}
}
