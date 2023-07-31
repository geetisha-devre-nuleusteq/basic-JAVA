package JAVADayThree;

import java.util.ArrayList;
import java.util.Scanner;


public class StringIndex {
	public static void main(String...ar)
	{
		ArrayList li=new ArrayList();
		li.add("hello");
		li.add("the");
		li.add("code");
		li.add("shows ");
		li.add("exception");
		li.add("over");
		li.add("invalid");
		li.add("input");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array index to display");
		int index=sc.nextInt();
		if(li.size()<0||li.size()>7)
		{try {System.out.println("invalid index");}
		catch(IndexOutOfBoundsException ex) 
		{System.out.println("the index is out of bound"+ex);}
		}else if(li.get(index).equals(null))
		{try {System.out.println("invalid index");}
		catch(NullPointerException ex) 
		{System.out.println("the index is out of bound"+ex);}}
		else
			System.out.println("string at index:"+index+"is "+li.get(index));
		
	}

}
