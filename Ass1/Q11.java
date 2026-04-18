package Ass1;
import java.util.Scanner;
public class Q11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        String [] ele = s.split("");
        String [] rev = new String[ele.length];
        for(int i = 0; i < ele.length; i++){
                rev[i] = ele[ele.length - 1 - i];
        }
        String revs = String.join("", rev);
        System.out.println(revs);
    }
}
