package Ass2;
import Stu.*;
import sports.*;
public class Q10 {
	public static void main(String args[]) {
		Test t = new Test();
		t.inputDetails();
		t.showDetails();
		int s = Sports.score1;
		int s2 = Sports.score2;
		System.out.println("Total Score: "+ (s+s2));
		System.out.println("Total Marks: "+(t.mark1 + t.mark2));
	}
}
