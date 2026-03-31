package Ass2;
class Book{
	int BookId, quantity;
	double price;
	static double totalamount = 0;
	Book(int BookId, double price, int quantity){
		this.BookId = BookId;
		this.price = price;
		this.quantity = quantity;
		totalamount += Total();
	}
	void displayDetails() {
		System.out.println("BookId: "+ BookId);
		System.out.println("Price:" + price);
		System.out.println("Quantity: "+ quantity);
		System.out.println("Total: "+ Total());
	}
	double Total() {
		return price * quantity;
	}
}
public class Q3 {
	public static void main(String [] args) {
		Book b1 = new Book(101,250,2);
		Book b2 = new Book(102,220,6);
		Book b3 = new Book(103,160,1);
		b1.displayDetails();
		b2.displayDetails();
		b3.displayDetails();
		System.out.println("Total Amount is: " + Book.totalamount);
	}
}
