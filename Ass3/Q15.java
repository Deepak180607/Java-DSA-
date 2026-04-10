package Ass3;

public class Q15 {
    public static String Reverse(String s){
        if (s.isEmpty()){
            return s;
        }
        return Reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String [] args){
        System.out.println( Reverse("pans&pots"));

    }
}
