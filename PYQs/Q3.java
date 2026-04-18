package PYQs;
abstract class Shape{
    abstract void Area();
}
class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    void Area(){
        System.out.println("Area of Circle: " + Math.PI*radius*radius);
    }
}
class Triangle extends Shape{
    int a, b, c;
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void Area(){
        double s = (a+b+c)/2.0;
        double area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        System.out.println("Area of Triangle: " + area);
    }
}
public class Q3 {
    public static void main(String args[]){
        Shape  s;
        s = new Circle(15);
        s.Area();
        s = new Triangle(3, 4, 5);
        s.Area();

    }
}
