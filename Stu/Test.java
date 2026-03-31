package Stu;
import java.util.Scanner;
public class Test extends Student {
	public int mark1, mark2;
	
	
	public void inputDetails() {
		super.inputDetails();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter mark1");
		mark1 = s.nextInt();
		System.out.println("Enter mark2");
		mark2 = s.nextInt();
		
	}
	public void showDetails() {
		super.showDetails();
		System.out.println("Mark1: " + mark1);
		System.out.println("Mark2: " + mark2);
	}
}
