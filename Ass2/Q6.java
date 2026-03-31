package Ass2;
class Vehicle{
	String model;
	int year;
	Vehicle(String m,int y){
		model = m;
		year = y;
	}
}
class Car1 extends Vehicle{
	int CarID;
	double price;
	Car1(String m, int y, int c, double p){
		super(m,y);
		CarID = c;
		price = p;
	}
	
	void carDisplay(){
		System.out.println("Model: "+ model +"\n"
				+ "Year: " + year +"\n"
				+ "CarID: " + CarID + "\n"
				+ "Price: " + price );
	}

}
public class Q6 {
	public static void main(String [] args) {
		Car1 c = new Car1("Lamburgumber", 2022,1234,129084.098);
		c.carDisplay();
	}
}
