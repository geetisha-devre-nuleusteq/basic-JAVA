package JavaDay2;
import java.util.*;
import java.io.*;
public class Property {
	public static void main(String...ar)throws Exception
	{
		FileReader reader= new FileReader("C:\\Users\\geeti\\eclipse-workspace\\JavaBasics\\src\\JavaDay2/helloWorld");
	Properties p=new Properties();
	p.load(reader);
	System.out.println(p.getProperty("user"));}
	

}
