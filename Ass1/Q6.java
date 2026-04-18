package Ass1;
import java.util.Scanner;
public class Q6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int s = sc.nextInt();
        int [] arr = new int[s];
        for (int i = 0; i < s; i++){
            System.out.println("Enter Element: " + (i+1));
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < s; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int countM = 0;
        int countL = 0;
        for(int i = 0; i < s; i++){
            if(arr[i] == max){
                countM++;
            }
            if(arr[i] == min){
                countL++;
            }
        }
        int Mpos = 0;
        int Lpos = 0;
        for(int i = 0; i < s; i++){
            if(arr[i] == max){
                Mpos = i+1;
                break;
            }
        }
        for(int j = (s-1); j >= 0;j--){
            if(arr[j] == min){
                Lpos = j + 1;
                break;
            }
        }
        System.out.println("Max Value: " + max +"\n" + "Min Value: " + min + "\n" + "Max Count: " + countM + "\n" + "Min Count: " + countL + "\n" + "Max First Occurence: " + Mpos +"\n"
        + "Min Last Occurence: " + Lpos);
    }
}
