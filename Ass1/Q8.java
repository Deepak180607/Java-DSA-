package Ass1;
import java.util.Scanner;
public class Q8 {
    public static double SumMajorDiagonal(double [][]m){
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][i];
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n = sc.nextInt();
        double ar[][] = new double[n][n];
        System.out.println("Enter " + n*n + " elements: ");
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                ar[i][j] = sc.nextDouble();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(ar[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum of Major Diagonals of " + n*n + "is : " + SumMajorDiagonal(ar));
    }
}