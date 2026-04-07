package Ass3;

public class Q9 {
    public static  int rev(int n, int x){
        if(n == 0){
            return x;
        }
        x = x*10 + (n % 10);

        return rev(n/10, x);
    }
    public static void main(String[] args) {
        System.out.println(rev(4567,0));
        System.out.println( rev(-4325,0));
    }
}
