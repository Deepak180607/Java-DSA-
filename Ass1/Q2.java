package Ass1;
import java.util.Scanner;
public class Q2 {
    public static void main(String [] artgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        int m = n;
        int k = m;
        while(n > 0){
            sum += n % 10;
            prod *= m % 10;
            m = m/10;
            n = n/10;
        }
        if ( sum == prod){
            System.out.println(k + " is a spy number");
        }
        else{
            System.out.println(k + " is not a spy number");
        }
    }
}
