package Ass3;
public class Q5 {
    public static <E> void printArray(E[] inputArray){
        for (int i = 0; i < inputArray.length; i++){
            System.out.println(inputArray[i] +  " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"abc", "def", "ghi", "jkl", "mno"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
        
    }
}
