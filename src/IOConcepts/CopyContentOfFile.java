package IOConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyContentOfFile {
	public static void main(String...ar)throws Exception
	//creates file if file is not found
	{File f=new File("copy.txt");
		FileInputStream in=new FileInputStream("C:\\Users\\geeti\\eclipse-workspace\\JavaBasics\\src\\JavaDay2/helloWorld");
		FileOutputStream out=new FileOutputStream(f);
		int read1;
		while((read1=in.read())!=-1)
		{
			out.write(read1);
			
		}
		in.close();
		out.close();
		
		
		
	}

}
