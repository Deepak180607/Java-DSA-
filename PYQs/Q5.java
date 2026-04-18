package PYQs;

public class Q5 {
    public static <T> int count(T[]array, T item){
        int cnt = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == item){
                cnt++;
            }
        }
        return cnt;
    }
}
