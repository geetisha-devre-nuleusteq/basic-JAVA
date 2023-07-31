package MapsConcepts29july;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StringCollection {
	public static void main(String...ar)
	{//adds 20 elements in the string only if they do not exist in it
		Scanner sc=new Scanner(System.in);
		String str;
		ArrayList <String>string=new ArrayList<>();
		for(int i=0;i<20;i++) {
			
		System.out.println("enter strings to add in list");
		str=sc.next();
		if(!string.contains(str))
		string.add(str);
		else
			{System.out.println("string already exists");
			i--;}
			}
		//different methods of collections
		System.out.println("String list:  "+string);
		System.out.println("prints the size of the string  "+string.size());
		System.out.println("remove hello from list    "+string.remove("hello")+"  "+string);
		System.out.println("enter index to be updated");
		int index=sc.nextInt();
		System.out.println("update the value at given index with ###  "+string.set(index, "####"));
		System.out.println("checks whether the list is empty or not  "+string.isEmpty());
		
		
		
		
	}

}
