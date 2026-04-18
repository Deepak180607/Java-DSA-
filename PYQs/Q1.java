package PYQs;

public class Q1 {
    public static double sumMajorDiagonal(double [][] m){
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < 4; j++){
                if(i == j){
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String [] args){
        double [][]ar = {
            {1, 2.3, 4.5},
            {2, 3.7, 9},
            {3, 5, 18}
        };
        System.out.println("Sum of Major Diagonal: " + sumMajorDiagonal(ar));
    }
}
