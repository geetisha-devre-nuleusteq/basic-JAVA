package IOConcepts;

import java.io.File;

public class FilesInDirectory {
public static void main(String...ar)throws Exception
{
	File path=new File("C:\\");
String fileNames[]= path.list();
System.out.println("files in c directory:");
for(int i=0;i<fileNames.length;i++)
{System.out.println(fileNames[i]);}
}
}
