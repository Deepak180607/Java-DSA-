package Ass3;

public class Q14 {
    public static int product(int a, int b){
        if (b == 0){return 0;}
        if (b < 0){return -product(a, -b);}
        return a + product(a, b - 1);
    }
    public static void main(String[] args) {
        System.out.println(" 6 x 7 is " + product(6, 7));
        System.out.println("10 x 8 is " + product(10, 8));
    }
}
