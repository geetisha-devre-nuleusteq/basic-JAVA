package JavaBasicsFirstDay;
import java.util.Scanner;
public class StringQue {
	public static void main(String...ar)
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
		String str=sc.next();
		System.out.println("length:"+str.length());
		System.out.println("concat"+str.concat("abc"));
		System.out.println("enter position to get char from string");
		int k=sc.nextInt();
		System.out.println("char at position"+k+str.charAt(k));
		char ch=sc.next().charAt(0);
		System.out.println("index of char"+ch+str.indexOf(ch));
		System.out.println("replace:"+str.replace('k', 'a'));
		System.out.println("blank"+str.isBlank());
		
	

		System.out.println("repeat"+str.repeat(k));
		System.out.println("strip"+str.startsWith("nm"));
	}

}
