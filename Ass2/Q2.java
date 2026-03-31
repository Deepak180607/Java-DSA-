package Ass2;
import java.util.Scanner;
class Complex{
	int real, imag;
	void setData() {
		Scanner sc = new Scanner(System.in);
		 real = sc.nextInt();
		 imag = sc.nextInt();
	}
	void display(){
		System.out.println(real + " + " + imag + " i ");
	}
	public Complex add(Complex c1,Complex c2) {
		Complex t = new Complex();
		t.real = c1.real + c2.real;
		t.imag = c1.imag + c2.imag;
		return t;
	}	
}

public class Q2 {
	public static void main(String [] args) {
		Complex c1 = new Complex();
		c1.real = 5;
		c1.imag = 7;
		Complex c2 = new Complex();
		c2.real = 9;
		c2.imag = 8;
		c1.display();
		c2.display();
		
		Complex c = new Complex();
		c = c1.add(c1, c2);
		c.display();
	}
}
