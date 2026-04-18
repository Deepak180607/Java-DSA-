package Ass1;
import java.util.Scanner;
public class Q4 {
    public static void main(String [] artgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int m = n;
        int res = 0;
        while(n/10 != 0){
            int sum = 0;
            while (n > 0){
                sum += n % 10;
                n = n/10;
                //System.out.println(sum);
                //System.out.println(n);
            }
            n = sum;
            res = sum;
        }
        System.out.println("Sum of digits of " + m + " until the number is single digit is "+ res);
    }
}
