package Ass3;

public class Q18 {
    public static void towerOfHanoi(int n, char from, char to, char aux){
        if(n == 1){
            System.out.println("Move disc 1 from" + from + " to " + to);
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Move disc " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }
    public static void main(String [] args){
        int n = 3;
        System.out.print("Towers of Hanoi for n  = " + n + ":");
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}

