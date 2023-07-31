package JAVADayThree;

import java.util.Scanner;
public class ArrayIndex {



	
		public static void main(String...ar)
		{
			String[] li=new String[10];
			li[0]="hello";
			li[1]="the";
			li[2]="code";
			li[3]="shows";
			li[4]="exception";
			li[5]="over";
			li[6]="invalid";
			li[7]="input";
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter array index to display");
			int index=sc.nextInt();
			if(li.length<0||li.length>7)
			{try {System.out.println("invalid index");}
			catch(IndexOutOfBoundsException ex) 
			{System.out.println("the index is out of bound"+ex);}
			}else if(li[index].equals(null))
			{try {System.out.println("invalid index");}
			catch(NullPointerException ex) 
			{System.out.println("the index is out of bound"+ex);}}
			else
				System.out.println("string at index:"+index+"is "+li[index]);
			
		}
}
