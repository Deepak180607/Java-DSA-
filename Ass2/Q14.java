package Ass2;
class Distance{
	int feet,inches;
	
	Distance(int ft, int in){
		feet=ft;
		inches=in;
	}
	void  displayDistance() {
		System.out.println(feet+" ft: "+inches+" inches ");
	}
}
class Measurement extends Distance{
	double  centimetres;
	
	Measurement(int ft, int in,double  cent){
		super(ft,in);
		centimetres=cent;
	}
	void  displayMeasurement() {
		super.displayDistance();
		System.out.println(feet+"ft: "+inches+" inches "+centimetres+" cm ");
	}
}
public class Q14 {

	public static void main(String[] args) {
		Measurement m1=new Measurement(5,9,5.0);
		m1.displayMeasurement();
	}

}

