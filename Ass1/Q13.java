package Ass1;
import java.util.Arrays;
import java.util.Scanner;
public class Q13 {
    public static double[][] addMatrix(double[][] a, double [][] b){
        double c[][] = new double[a.length][a[0].length];
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
            c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int n = sc.nextInt();
        double a[][] = new double[n][n];
        double [][]b = new double[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Enter an Element(Array a): ");
                a[i][j] = sc.nextDouble();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Enter an Element(Array B): ");
                b[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Sum of MAtrices(a and b): " + Arrays.deepToString(addMatrix(a, b)));
    }
}
