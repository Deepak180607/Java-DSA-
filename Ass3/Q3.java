package Ass3;
class MarksOutOfBoundException extends Exception{
    public MarksOutOfBoundException(String s){
        super(s);
    }
}
class student{
    String name;
    int marks;

    public student(String name, int marks) {
        try {
            if(marks > 100){
                throw new MarksOutOfBoundException("Marks more than 100");
            }
            else{
                this.name = name;
                this.marks = marks;
            }
        } catch (MarksOutOfBoundException e) {
            System.out.println("Out of Range: " + e.getMessage());
        }
    }
    void display(){
        System.out.println("Name: " + name +"\t"+"Marks: " + marks);
    }
}
public class Q3 {
    public static void main(String[] args) {
        student s = new student("Deepak", 120);
        s.display();
    }
}
