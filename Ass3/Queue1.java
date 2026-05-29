package Ass3;
import java.util.Scanner;
public class Queue1 {
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;
    static Scanner sc = new Scanner(System.in);

    public static boolean isFull(){
        return rear == MAX - 1;
    }
    public static boolean isEmpty(){
        return front == -1||front > rear;
    }
    public static void insert(int Q[]){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        System.out.println("Enter elemnt to insert: ");
        int x = sc.nextInt();
        if(front == -1){
            front = 0;
        }
        rear++;
        Q[rear] = x;
        System.out.println(x + "element inserted in the queue");
    }

    public static void delete(int Q[]){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Deleted Elemenent: " + Q[front]);
        front++;

        if(front > rear){
            front = -1;
            rear = -1;

        }
    }
    public static void display(int Q[]){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Queue elements: ");
        for(int i = front; i <= rear; i++){
            System.out.print(Q[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int queue[] = new int[MAX];
        
        while (true) {
            System.out.println("***MENU***");
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
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
