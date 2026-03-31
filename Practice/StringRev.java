package Practice;

public class StringRev {
    public static String rev(String s){
        if(s.isEmpty()){
            return " ";
        }else{
            return rev(s.substring(1) + s.charAt(0)).toString();
        }
    }
    public static void main(String[] args) {
        rev("pots");
    }
}
