package Ass1;
import java.util.Scanner;
public class Q5 {
    public static boolean isOdd(int i){
        return( i & 1) == 1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println( isOdd(n));
    }
}
