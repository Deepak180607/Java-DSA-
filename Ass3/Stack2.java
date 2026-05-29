package Ass3;
import java.util.Scanner;
class Node{
    Node next;
    int data;
}
public class Stack2 {
    static Scanner sc = new Scanner(System.in);

    public static Node push(Node top){
        Node newNode = new Node();
        System.out.println("Enter element to push");
        newNode.data = sc.nextInt();
        newNode.next = top;
        top = newNode;
        return top;
    }
    public static Node pop(Node top){
        if(top == null){
            System.out.println("Stack UnderFlow!!, Stack is empty");
            return top;
        }
        System.out.println("Element Popped: " + top.data);
        top = top.next;
        return top;
    }
    public static void display(Node top){
        if (top == null){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("stack elements");
        Node current = top;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Node top = null;
        while(true){
            System.out.println("----Menu----");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("0.Exit");
            System.out.println("Enter a Choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }
}

