package MapsConcepts29july;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class EmployeeName {
	public static void main(String... ar) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		// creating map and entering values to the keys
		System.out.println("Enter 5 employee name to the map");
		String name;
		for (int i = 0; i < 5; i++) {
			name = sc.next();
			map.put(i, name);
		}
//retrieving all the values and keys of map on console
		for (Map.Entry<Integer, String> name1 : map.entrySet())
		
		{
			
			System.out.println("key: "+" "+name1.getKey()+"value:"+" "+name1);
			
			
		}
		// to iterate and read the key over the map for the given value
		System.out.println("enter name to get its key");
		String nameEmp = sc.next();
		int count = 0;
		for (Map.Entry<Integer, String> name1 : map.entrySet()) {
			if (name1.getValue().equals(nameEmp))
			// checks whether map contains key or value
			{
			
				System.out.println("key for the name " + nameEmp + "is : " + "  " + name1.getKey());
				break;
			}	count = 1;
			
		}
		
		if (count == 1)
			System.out.println("map doesn't contain  the input name");

		// update the value for the given key
		System.out.println("enter key to update its corresponding record");
		int key = sc.nextInt();
		map.replace(key, "###");
		System.out.println("updated element for the key " + key + "is: " + map);

		// delete the value for the given key
		
		System.out.println("enter value to delete its corresponding record");
		String nameEmpp = sc.next();
		for (Map.Entry<Integer, String> name1 : map.entrySet()) {
			if (name1.getValue().equals(nameEmpp))
		System.out.println("deletes the value if mapped to the key");
		System.out.println("deleted element for the key " + name1.getKey()  + map.remove(name1.getKey()) + " " + map);
		}
	}

}
