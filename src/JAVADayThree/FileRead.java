package JAVADayThree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
	public static void main(String...ar)throws IOException
	{System.out.println("enter file name");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
		int ch=0;
	FileReader fr=null;
	try {
		fr=new FileReader(str);
	}
	catch(FileNotFoundException f)
	{System.out.println("file not found");}
	while((ch=fr.read())!=-1)
	{System.out.println((char)ch);}
	fr.close();
	
	
	}

}
