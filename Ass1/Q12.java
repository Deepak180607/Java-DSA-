package Ass1;
import java.util.Arrays;
import java.util.Scanner;
public class Q12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter an element(array A): ");
            a[i] = sc.nextInt();
        }
        for(int j = 0; j < n; j++){
            System.out.println("Enter an element(array B): ");
            b[j] =sc.nextInt();
        }

        int c [] = new int[n];
        for(int k = 0; k < n; k++){
            c[k] = a[k]*b[k];
        }
        System.out.println("Dot product of a and b (a.b) : " + Arrays.toString(c));
    }
}
