package MapsConcepts29july;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Threshold {
	public static void main(String...ar)
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter the threshold capacity");
	int threshold=sc.nextInt();
	new Threshold().deleteIfThreshold(threshold);
		
	}
	
	
	
	//method to app record in map till the threshold capacity of  map
	public Map addInMap(int threshold)
	{Scanner sc=new Scanner(System.in);
	LinkedHashMap <Integer,String>map=new LinkedHashMap<>();
	String name;
	for(int i=1;i<=threshold;i++)
		{System.out.println("enter names for the map records");
		name=sc.next();
		map.put(i, name);
		}
	System.out.println(map);
	return map;}
	
	public void deleteIfThreshold(int threshold)
	{
		Map map=addInMap(threshold);
		System.out.println("delete the map if threshold capacity is reached");
		if(map.size()==threshold)
		map.clear();
		//checks whether map is empty or not
		System.out.println("checks whether map is empty or not"+": "+map.isEmpty());
		System.out.println("after removal map is:  "+map);
	}

}
