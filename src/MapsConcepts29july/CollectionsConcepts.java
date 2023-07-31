package MapsConcepts29july;

import java.util.ArrayList;


import java.util.Collections;
import java.util.List;
public class CollectionsConcepts {
	
	public static void main(String...ar)
	{ArrayList<Integer> list=new ArrayList();
	//creating a collection and storing 20 elements in the list
	for(int i=0;i<20;i++)
	{
		list.add(i+1);
	}
	System.out.println(list);
	//reversing the list without the loop
	Collections.reverse(list);
	//update list elements by 5 whenever a number <10 is found
	for (int i=0;i<20;i++)
	{if(list.get(i)<10)
		{list.add(i, 5);}}
	
	//display elements les then 15
	for(int i=0;i<20;i++)
	{if(list.get(i)<15)
		System.out.println("number less than 15 encountered:  "+list.get(i));
	}
	
	}
	

}
