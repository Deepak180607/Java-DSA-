package Ass2;
class Shape{
	String color;
	Shape(String c){
		color = c;
	}
}
class Circle extends Shape{
	double radius;
	Circle(String c, double r){
		super(c);
		radius = r;
		
	}
	void Area(){
		System.out.println("Area of Circle: " + Math.PI*radius*radius);
	}
}
class rectangle extends Shape{
	double length, breadth;
	rectangle(String c, double l, double b){
		super(c);
		length = l;
		breadth = b;
	}
	void Area() {
		System.out.println("Area of Rectangle: " + length*breadth);
	}
}

public class Q7 {
	public static void main(String [] args) {
		Circle c = new Circle("Pink", 14);
		rectangle r = new rectangle("Cyan", 10, 12);
		c.Area();
		r.Area();
	}
}
