package Ass2;
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}
class Duck implements Flyable, Swimmable{
    String name;

    Duck(String name) {
        this.name = name;
    }
    public void fly(){
        System.out.println(name+ " is flying");
    }
    public void swim(){
        System.out.println(name + " is swimming");
    }

    void DisplayDetails(){
        System.out.println(name + " is the name of the duck");
        System.out.println("Can Fly:  Yes");
        System.out.println("Can Swim: Yes");
    }
    
}
public class Q8 {
    public static void main(String[] args) {
        Duck d = new Duck("Donald");

        d.fly();
        d.swim();

        d.DisplayDetails();
    }
}
