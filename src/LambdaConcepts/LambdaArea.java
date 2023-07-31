package LambdaConcepts;

interface Shape{
void area(int n);
}
public class LambdaArea {
public static void main(String...ar)
{
	Shape s=(int n)->{
		
		System.out.println("area of circle:"+3.14*n*n+" unit sq");
		System.out.println("area of square:"+n*n+" unit sq");
		System.out.println("area of cube:"+6*n*n+" unit sq");
		System.out.println("area of sphere:"+4*3.14*n*n+" unit sq");
	};
	s.area(10);}
}
