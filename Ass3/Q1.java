package Ass3;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lucky Number: ");
        int n = sc.nextInt();
        try {
            if (n < 0){
                throw new NumberFormatException("Negative Number");
            }else{
                System.out.println("Lucky number is: "+ n);
            }
        } catch (NumberFormatException e) {
            System.out.println("Numbner can't be negative " + e.getMessage());
        }
    }
}
