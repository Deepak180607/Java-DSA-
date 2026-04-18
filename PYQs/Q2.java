package PYQs;
import java.util.Scanner;
interface Drivable{
    void drive();
}
interface Chargeable{
    void charge();
}

class ElectricCar implements Drivable, Chargeable{
    private String model;

    public ElectricCar(String model) {
        this.model = model;
    }
    public void drive(){
        System.out.println(model + " is Driving");
    }
    public void charge(){
        System.out.println(model + " is Charging");
    }
    public void displayinfo(){
        System.out.println("Car model: " + model);
        System.out.println("Car can charge");
        System.out.println("Car can be driven");
    }
}
public class Q2 {
    public static void main(String [] args){
        ElectricCar [] cars = new ElectricCar[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            System.out.print("Enter a Car model: " );
            cars[i] = new ElectricCar(sc.nextLine());
        }
        for(int j = 0; j < 4; j++){
            System.out.println("Car " + (j + 1) + " Details: ");
            cars[j].displayinfo();
            cars[j].drive();
            cars[j].charge();
            System.out.println();
        }
    }
}
