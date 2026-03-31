package Ass2;
class Book1 {
 int bookId;
 double price;
 int quantity;
 static double totalAmount = 0; 


 Book1(int bookId, double price, int quantity) {
     this.bookId = bookId;
     this.price = price;
     this.quantity = quantity;
 }

 void displayDetails() {
     System.out.println("Book ID: " + bookId);
     System.out.println("Price: " + price);
     System.out.println("Quantity: " + quantity);
 }


 double calculateCost() {
     double cost = price * quantity;
     totalAmount += cost; 
     return cost;
 }
}

//Main class
public class Q5 {
 public static void main(String[] args) {

     Book1[] books = new Book1[5];

     books[0] = new Book1(101, 250.50, 2);
     books[1] = new Book1(102, 150.00, 3);
     books[2] = new Book1(103, 300.75, 1);
     books[3] = new Book1(104, 120.00, 4);
     books[4] = new Book1(105, 500.00, 1);

     for (int i = 0; i < books.length; i++) {
         System.out.println("\nDetails of Book " + (i + 1) + ":");
         books[i].displayDetails();
         double cost = books[i].calculateCost();
         System.out.println("Total Cost for this Book: " + cost);
     }

     System.out.println("\nTotal Amount Spent on All Books: " + Book1.totalAmount);
 }
}
