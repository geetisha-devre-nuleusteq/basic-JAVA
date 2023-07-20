package JavaBasicsFirstDay;
import java.util.Scanner;
public class EqualsConcept {
public static void main(String...ar)
{Scanner sc=new Scanner(System.in);
System.out.println("enter the strings");
	String str=sc.next();
	String str1=sc.next();
	System.out.println("== compares heap and pool address and hence return:"+str==str1);
	System.out.println("compares value of strings"+str.equalsIgnoreCase(str1));
		
}}
