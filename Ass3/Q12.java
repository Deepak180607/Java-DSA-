package Ass3;

public class Q12 {
    public static int binarySearch(int ar[], int target, int lo, int hi){
        if (lo > hi){
            return -1;
        }
        int mid = (lo + hi)/2;
        if (ar[mid] == target){
            return mid;
        }if (ar[mid] < target){
            return binarySearch(ar, target, mid + 1, hi);
        }
        return binarySearch(ar, target, mid - 1, hi);
    }
    public static void main(String [] args){
        int ar [] = {3, 4, 5, 6, 7, 8, 9, 10 ,11, 12, 13, 14};
        System.out.println( binarySearch(ar, 12, 0, ar.length));
    }
}
