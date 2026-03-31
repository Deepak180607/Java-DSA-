package Ass2;
class Deposit{
	long Principal;
	int Time;
	double Rate, Total_amt;
	
	Deposit() {}
	Deposit(long p, int T, double R) {
		Principal = p;
		Time = T;
		Rate = R;
	}
	Deposit(long p, int t) {
		Principal = p;
		Time = t;
	}
	Deposit(long p, double r ) {
		Principal = p;
		Rate = r;
	}
	void display() {
		System.out.println("Principal: " + Principal);
		System.out.println("Time: " + Time);
		System.out.println("Rate: " + Rate);
		System.out.println("Total Amount: " + calc_amt());
	}
	double calc_amt() {
		return Total_amt = (Principal + (Principal *  Rate * Time)/100);
	}
}
public class Q4 {
	public static void main(String [] args) {
		Deposit d = new Deposit();
		d.display();
		Deposit d1 = new Deposit(10000, 2, 8.0);
		d1.display();
		Deposit d2 = new Deposit(100000, 2);
		d2.display();
		Deposit d3 = new Deposit(1000000, 7.8);
		d3.display();
	}
}
