package Ass2;

abstract class Shape {
    void Area(){}
}
class Circle extends Shape{
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void Area() {
        System.out.println("Area of circle: " + Math.PI * radius * radius);
    }
}
class Square extends Shape {
    int side;

    Square(int side) {
     this.side = side;
    }
    void Area(){
        System.out.println("Area of Sqaure: " + side*side);
    }
}
class triangle extends Shape{
    int a,b,c;
    triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void Area(){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s * ((s-a)*(s-b)*(s-c)));
        System.out.println("Area of Triangle: " + area);
    }
}
public class Q5a {
    public static void main(String [] args){
        Shape s1;
        s1 = new Circle(5);
        s1.Area();
        s1 = new Square(6);
        s1.Area();
        s1 = new triangle(1,2,3);
        s1.Area();
    }

}
