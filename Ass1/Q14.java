package Ass1;
import java.util.Random;
public class Q14 {
    public static void main(String [] args){
        int ar[][] = new int[4][4];
        Random random = new Random();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                ar[i][j] = random.nextInt(2);
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        int row = -1;
        int hrow = 0;
        for(int i = 0; i < 4; i++){
            int count = 0;
            for(int j = 0; j < 4; j++){
                count += ar[i][j];
                if (count > row){
                    row = count;
                    hrow = i + 1;
                }
            }
        }System.out.println("Row with Most 1's: " + hrow);
        int col = -1;
        int hcol = 0;
        for(int j = 0; j < 4; j++){
            int count = 0;
            for(int i = 0; i < 4; i++){
                count += ar[i][j];
                if(count > col){
                    count = col;
                    hcol = j + 1;
                }
            }
        }System.out.println("Column with Most 1's: " + hcol);
    }
}
