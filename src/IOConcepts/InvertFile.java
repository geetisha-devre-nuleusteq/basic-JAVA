package IOConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Stack;

public class InvertFile {
public static void main(String...ar) throws Exception
{
	Stack<String> stack=new Stack<String>();
	File f=new File("invert.txt");
	FileInputStream in=new FileInputStream("C:\\Users\\geeti\\eclipse-workspace\\JavaBasics\\src\\JavaDay2/helloWorld");
FileOutputStream out=new FileOutputStream(f);
int readf;
while((readf=in.read())!=-1)
{stack.push(String.valueOf(readf));}
String str;
while(!stack.empty())
{str=stack.pop();
out.write((Integer.valueOf(str)));}
out.close();
in.close();
//reverse the string characters as in.readf fetch characters not string and hence stores in stack






}
}
