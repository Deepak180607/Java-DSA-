package Stu;
import java.util.Scanner;
public class Student {
	String name;
	int roll;
	public void inputDetails() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter roll");
		roll = sc.nextInt();
	}
	public void showDetails() {
		System.out.println("Name of Student: " + name);
		System.out.println("Roll number of Student: " + roll);
	}
}
