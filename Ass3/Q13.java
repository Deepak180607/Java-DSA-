package Ass3;

public class Q13 {
public static void toBinary(int n) {
        if (n == 0)  return;
        toBinary(n / 2);
        System.out.print(n % 2);
    }
    public static void main(String[] args) {
        int[] tests = {10, 25, 255, 1};
            for (int i = 0; i < tests.length; i++){
                System.out.print( tests[i] + " in binary = ");
                toBinary(tests[i]);
                System.out.println();
            }
        }
    }
