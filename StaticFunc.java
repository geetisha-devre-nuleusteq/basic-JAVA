package JavaDay2;

public class StaticFunc {
	public static void main(String...ar){new Demo().examp();}
	static{System.out.println("hello,I am static block");}
}
class Demo{
	static String str="i am static variable";
	static void examp()
	{System.out.println("static function"+str);}	
}
