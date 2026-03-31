package Ass2;

import java.util.Scanner;
class Car {
	int year;
	String model;
	void setDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Car Model and Year: ");
	    model = sc.nextLine();
		year = sc.nextInt();
	}void display(){
		System.out.println("Model is: " + model);
		System.out.println("Year is: " + year);
	}
}
public class Q1 { 
	public static void main(String [] args) {
		
		Car c1 = new Car();	
		c1.model = "Toyota";
		c1.year = 2020;
		
		Car c2 = new Car();
		c2.setDetails();
		c2.display();
		c1.display();
		
		if(c1.year > c2.year) {
			System.out.println(c1.model + " is newer" );
		}else {
			System.out.print(c2.model + "is newer");
		}
	}
}
