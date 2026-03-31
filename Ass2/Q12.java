package Ass2;
class Person{
    String name;
    int age;
    Person(String n, int a){
        name = n;
        age = a;
    }
}
class Employee extends Person{
    int Eid;
    double salary;

    public Employee(int Eid, double salary, String n, int a) {
        super(n, a);
        this.Eid = Eid;
        this.salary = salary;
    }
    void EmpDetails(){
    System.out.println("Eid: " + Eid);
    System.out.println("Salary: " + salary);
    System.out.println("Name: " + name);
    System.out.println("age: " + age);
}
}

public class Q12 {

}
