package Ass2;
class Employee{
	String Name;
	int Salary;
	Employee(String n, int s){
		Name = n;
		Salary = s;
	}
	void Employeeinfo() {
		System.out.println("Name: " + Name + "\n"
				+ "Salary :" + Salary);
	}
}
class Manager extends Employee{
	String Department;
	Manager(String n, int s, String D){
		super(n,s);
		Department = D;
	}
	void ManagerDetails() {
		System.out.println("Name: " + Name + "\n"
				+ "Salary :" + Salary+ "\n"
				+ "Department: " + Department);
	}
}
public class Q9 {
	public static void main(String [] args) {
		Manager m = new Manager("Deepak", 1000000, "IT Department");
		m.ManagerDetails();
	}
}
