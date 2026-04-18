package Ass1;
import java.util.Scanner;
public class Q7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter number of Columns: ");
        int n = sc.nextInt();
        int total = 0;
        int arr[][] = new int[m][n];
        System.out.println("Enter " + m*n + " elements: ");
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array in tabular form ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + "\t");
                total += arr[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total sum of elemnets: "+total);
    }
}
