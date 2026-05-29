package Ass3;
import java.util.Scanner;
public class Stack1 {
    public static final int MAX = 10;
    static Scanner sc = new Scanner(System.in);

    public static boolean isFull(int top){
        return top == MAX - 1;
    }

    public static int push(int S[], int top){
        if(isFull(top)){
            System.out.println("Stack Overflow!!, stack is full");
            return top;
        }
        System.out.println("Enter element to push: ");
        int element = sc.nextInt();

        top++;
        S[top] = element;
        return top;
    }

    public static boolean isEmpty(int top){
        return top == -1;
    }

    public static int pop(int S[], int top){
        if(isEmpty(top)){
            System.out.println("Stack is empty");
            return top;
        }
        System.out.println("Popped element: " + S[top]);
        top--;
        return top;
    }
    public static void display(int S[], int top){
        if(isEmpty(top)){
            System.out.println("stack is Empty");
            return;
        }
        System.out.println("Stack elements: ");
        for(int i = top; i >= 0; i-- ){
            System.out.println(S[i]);
        }
    }
    public static void main(String[] args) {
        int stack [] = new int[MAX];
        int top = -1;
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
                    top = push(stack, top);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
