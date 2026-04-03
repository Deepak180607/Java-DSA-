package Ass3;
public class Q2 {
    public static void main(String[] args){
        String color[] = {"Black", "White", null, "Gray"};
        try{
            System.out.println("Color at 10: "+ color[9]);
        }
        catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Array out of range");
        }
        try {
            System.out.println("Color at 3: "+ color[2]);
        } catch (NullPointerException e) {
            System.out.println("No Color found");
        }
        for (int i = 0; i<color.length; i++){
            if (color[i] != null){
                System.out.println("Color: " + color[i]);
            }
        }
    }
}
