package Ass3;

public class Q11 {
    public static int GCD(int m, int n){
        if (n == 0){
            return m;
        }
        return GCD(n, m % n);
    }
    public static void main(String [] args){
        System.out.println("GCD of 48 and 12: "+ GCD(48, 12));
    }
}
