package Ass1;

public class Q9 {
    public static double sumColoumn(double[][]m,  int columnIndex){
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String [] args){
        int m = 3, n =4;
        double ar[][] = {
            {1.5, 2, 3, 4},
            {5.5, 6, 7, 8},
            {9.5, 1, 3, 1}
        };
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ar[i][j] + "\t ");
            }
            System.out.println();
        }
        for(int j = 0; j < n; j++){
            System.out.println("Sum of Columns: " + j + ": " + sumColoumn(ar, j));
        }

    }
}
