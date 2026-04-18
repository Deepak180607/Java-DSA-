package PYQs;

public class Q5c {
    public static int product(int a, int b){
        if (a < 0 && b < 0){
            return product(-a, -b);
        }
        if( a < 0){
            return -product(-a, b);
        }
        if(b > 0){
            return -product(a, -b);
        }
        if(a == 0 || b == 0){
            return 0;
        }
        return a + product(a, b - 1);
    }
    public static void main(String [] args){
        System.out.println( product(4, 10));
    }
}
