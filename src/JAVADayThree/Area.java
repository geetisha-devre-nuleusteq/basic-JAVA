package JAVADayThree;


public class Area {
	
	double area;
	
	public static void main(String...ar)
	{
		System.out.println(new Triangle().arrea()+"is area of trinagle");
		System.out.println(new Rectangle().arrea()+"is area of Rectangle");
		System.out.println(new Circle().arrea()+"is area of Circle"
				+ "circle");
	}
	public double arrea() {
		double a=0.0;
	return a;}

}


class Circle extends Area{
	@Override
	public double arrea() {
		double radius=2;
		area=3.14*radius*radius;
		return area;
	}
}
class Rectangle extends Area{
	@Override
	public double arrea()
	{
		double length=5;
		double breadth=7;
		area=length*breadth;
		return area;
	}
}

class Triangle extends Area{
	@Override
	public double arrea() {
		double base=4;
		double height=9;
		area=0.5*base*height;
		return area;
	}
}
