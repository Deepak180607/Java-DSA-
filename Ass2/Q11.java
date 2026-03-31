package Ass2;
import java.util.Scanner;
class Student {
    int roll, DSA_marks;
    String name;
    void getdata(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = s.next();
        System.out.println("Enter marks: ");
        this.DSA_marks = s.nextInt();
        System.out.println("Enter Roll number: ");
        this.roll = s.nextInt();
    }
    void showDetails(){
        System.out.println("Name of Student: " + name +"\n"
        + "Roll no: " + roll +"\n"
        + "DSA_marks: " + DSA_marks);
    }
}
public class Q11 {
    public static void main(String [] args){
       Student[] s = new Student[5];

       for (int i = 0; i < s.length;i++){
        System.out.println("Enter Detail of Student: ");
        s[i] = new Student();
        s[i].getdata();
       }
       int maxIndex = 0;
       for (int i = 0; i < s.length; i++){
        if (s[i].DSA_marks > s[maxIndex].DSA_marks){
            maxIndex = i;
        }
       }
       s[maxIndex].showDetails();
    }
}
