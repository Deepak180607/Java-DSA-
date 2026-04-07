package Ass3;

public class Q6 {
    public static <T> int count(T[] array, T item){
        int cnt = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] == item){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String [] args){
        Integer[] nums = {1,2,4,5,3,2,7,8,2};
        System.out.println("Count of 2 in array: " + count(nums, 2));

        String[] words = {"cat", "bat", "cat", "rat", "cat"};
        System.out.println("Count of {cat}: " + count(words, "cat"));
    }
}
