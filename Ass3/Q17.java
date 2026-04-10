package Ass3;

public class Q17 {
    public static void arrange(int [] ar, int k, int lo, int hi){
        if(lo >= hi){
            return;
        }if(ar[lo] <= k){
            arrange(ar, k, lo + 1, hi);
        }else{
            int temp = ar[lo]; ar[lo] = ar[hi]; ar[hi] = temp;
            arrange(ar, k, lo, hi - 1);
        }
    }
    public static void main(String [] args){
        int [] ar = {2, 9, 8, 5, 3, 6, 7, 10};
        int k = 5;
        arrange(ar, k, 0, ar.length - 1);
        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }
}
