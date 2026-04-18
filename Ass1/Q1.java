package Ass1;
import java.util.Scanner;
public class Q1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a height (in cms): ");
        double h = sc.nextDouble();
        System.out.println("Enter a Weight (in kgs): ");
        double w = sc.nextDouble();
        double bmi = (w)/(h*h);
        if (bmi < 18.5){
            System.out.println("You Need to eat bro");
        }else if(bmi < 24.9){
            System.out.println("All good :>");
        }else if(bmi < 29.9){
            System.out.println("Nigga you FAT");
        }else{
            System.out.println("Head to gym right now");
        }
    }
}
