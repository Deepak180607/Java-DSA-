package Ass;

import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
}

public class Ass5 {
    // Declared statically to safely update both start and end pointers 
    // across all methods without losing reference when the list is empty.
    static Node start = null;
    static Node end = null;
    static Scanner sc = new Scanner(System.in);

    public static Node create(Node startParam, Node endParam) {
        Node newNode = new Node();
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();
        newNode.next = null;
        newNode.prev = null;

        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        return end;
    }

    public static Node insBeg(Node startParam, Node endParam) {
        Node newNode = new Node();
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();
        newNode.prev = null;

        if (start == null) {
            newNode.next = null;
            start = newNode;
            end = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
        return start;
    }

    public static Node insEnd(Node startParam, Node endParam) {
        Node newNode = new Node();
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();
        newNode.next = null;

        if (start == null) {
            newNode.prev = null;
            start = newNode;
            end = newNode;
        } else {
            newNode.prev = end;
            end.next = newNode;
            end = newNode;
        }
        return start;
    }

    public static Node insAny(Node startParam, Node endParam) {
        System.out.print("Enter the position to insert: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            return insBeg(start, end);
        }

        Node temp = start;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
        } else if (temp.next == null) {
            return insEnd(start, end);
        } else {
            Node newNode = new Node();
            System.out.print("Enter registration number: ");
            newNode.regd_no = sc.nextInt();
            System.out.print("Enter mark: ");
            newNode.mark = sc.nextFloat();

            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
        return start;
    }

    public static Node delBeg(Node startParam, Node endParam) {
        if (start == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }
        System.out.println("Deleted Regd No: " + start.regd_no);
        if (start.next == null) { // Only one node in the list
            start = null;
            end = null;
        } else {
            start = start.next;
            start.prev = null;
        }
        return start;
    }

    public static Node delEnd(Node startParam, Node endParam) {
        if (end == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }
        System.out.println("Deleted Regd No: " + end.regd_no);
        if (end.prev == null) { // Only one node in the list
            start = null;
            end = null;
        } else {
            end = end.prev;
            end.next = null;
        }
        return start;
    }

    public static Node delAny(Node startParam, Node endParam) {
        if (start == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            return delBeg(start, end);
        }

        Node temp = start;
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
        } else if (temp.next == null) {
            return delEnd(start, end);
        } else {
            System.out.println("Deleted Regd No: " + temp.regd_no);
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        return start;
    }

    public static void search(Node startParam) {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Enter Registration Number to search and update: ");
        int reg = sc.nextInt();
        Node temp = start;

        while (temp != null) {
            if (temp.regd_no == reg) {
                System.out.println("Student found. Current mark: " + temp.mark);
                System.out.print("Enter new mark: ");
                temp.mark = sc.nextFloat();
                System.out.println("Mark updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Error: Student with Registration Number " + reg + " not found.");
    }

    public static void display(Node startParam, Node endParam) {
        if (start == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Doubly Linked List Data (Start to End):");
        Node temp = start;
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no + " | Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at Beginning");
            System.out.println("4: Insert at End");
            System.out.println("5: Insert at Any Position");
            System.out.println("6: Delete from Beginning");
            System.out.println("7: Delete from End");
            System.out.println("8: Delete from Any Position");
            System.out.println("9: Search and Update Mark");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Do you want to add a node? (y/n): ");
                    char ch = sc.next().charAt(0);
                    while (ch == 'y' || ch == 'Y') {
                        end = create(start, end);
                        System.out.print("Do you want to add another node? (y/n): ");
                        ch = sc.next().charAt(0);
                    }
                    break;
                case 2:
                    display(start, end);
                    break;
                case 3:
                    start = insBeg(start, end);
                    break;
                case 4:
                    start = insEnd(start, end);
                    break;
                case 5:
                    start = insAny(start, end);
                    break;
                case 6:
                    start = delBeg(start, end);
                    break;
                case 7:
                    start = delEnd(start, end);
                    break;
                case 8:
                    start = delAny(start, end);
                    break;
                case 9:
                    search(start);
                    break;
                default:
                    System.out.println("Wrong choice. Please try again.");
            }
        }
    }
}