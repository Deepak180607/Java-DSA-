package Ass3;
import java.util.Scanner;
class Node {
    Node next;
    int data;
}
public class Queue2 {
    static Scanner sc = new Scanner(System.in);

    public static Node insert(Node rear, Node front){
        Node newNode = new Node();
        System.out.println("Enter the element to inserted: ");
        newNode.data = sc.nextInt();
        newNode.next = null;

        if(front == null){
            System.out.println( newNode.data+ "inserted");
            return newNode;
        }
        Node temp = front;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println(newNode.data + "inserted");
        return front;
    }
    public static Node delete(Node rear, Node front){
        if(front == null){
            System.out.println("Queue UnderFlow");
            return null;
        }
        System.out.println("deleted element: " + front.data);
        front = front.next;
        return front;
    }
    public static void display(Node rear, Node front){
        if (front == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements: ");
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
        temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node rear = null, front = null;
        
        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                case 1:
                    front = insert(rear, front);
                    break;
                case 2:
                    front = delete(rear, front);
                    break;
                case 3:
                    display(rear, front);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
