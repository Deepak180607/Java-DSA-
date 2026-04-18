package PYQs;
class MarksOutOfBondException extends Exception{
    public MarksOutOfBondException(String s){
        super(s);
    }
}
class student{
    int marks;
    String name;
    student(String name, int marks){
        try{
            if( marks > 100){
            throw new MarksOutOfBondException("Marks over 100");
            }else{
                this.name = name;
                this.marks = marks;
            }
        }catch(MarksOutOfBondException e){
            System.out.println("Out of Range"+ e.getMessage());
            }
        }void Display(){
            System.out.println("Name of the student: " + name);
            System.out.println("Marks of the student: " + name);
    }
}
public class Q4 {
    public static void main(String [] args){
        student s = new student("Deepak", 109);
    }
}
