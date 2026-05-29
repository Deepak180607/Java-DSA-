package Ass;

import java.util.Scanner;

class Node {

    Node() {
    }

    protected int regd_no;
    protected float mark;
    protected Node next;
}

public class Ass4 {

    static Scanner sc = new Scanner(System.in);

    public static void create(Node start) {
        System.out.print("Enter registration number: ");
        start.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        start.mark = sc.nextFloat();
        start.next = null;

        System.out.print("Do you want to add another node? (y/n): ");
        char ch = sc.next().charAt(0);
        Node current = start;

        while (ch == 'y' || ch == 'Y') {
            current.next = new Node();
            current = current.next;
            System.out.print("Enter registration number: ");
            current.regd_no = sc.nextInt();
            System.out.print("Enter mark: ");
            current.mark = sc.nextFloat();
            current.next = null;

            System.out.print("Do you want to add another node? (y/n): ");
            ch = sc.next().charAt(0);
        }
    }

    public static void display(Node start) {
        if (start == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Linked List Data:");
        Node temp = start;
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no + " | Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static Node InsBeg(Node start) {
        Node newNode = new Node();
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();

        newNode.next = start;
        return newNode;
    }

    public static Node InsEnd(Node start) {
        Node newNode = new Node();
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();
        newNode.next = null;

        if (start == null) {
            return newNode;
        }

        Node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return start;
    }

    public static Node InsAny(Node start) {
        System.out.print("Enter the position to insert (1 for beginning): ");
        int pos = sc.nextInt();

        if (pos == 1) {
            return InsBeg(start);
        }

        Node newNode = new Node();
        System.out.print("Enter registration number: ");
        newNode.regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        newNode.mark = sc.nextFloat();

        Node temp = start;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return start;
    }

    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }
        System.out.println("Deleted Regd No: " + start.regd_no);
        return start.next;
    }

    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }
        if (start.next == null) {
            System.out.println("Deleted Regd No: " + start.regd_no);
            return null;
        }

        Node temp = start;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Deleted Regd No: " + temp.next.regd_no);
        temp.next = null;
        return start;
    }

    public static Node DelAny(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return null;
        }

        System.out.println("Choose Deletion Method:");
        System.out.println("1: By Position");
        System.out.println("2: By Registration Number");
        int opt = sc.nextInt();

        if (opt == 1) {
            System.out.print("Enter position to delete: ");
            int pos = sc.nextInt();

            if (pos == 1) {
                return DelBeg(start);
            }

            Node temp = start;
            for (int i = 1; i < pos - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
                System.out.println("Position out of bounds.");
            } else {
                System.out.println("Deleted Regd No: " + temp.next.regd_no);
                temp.next = temp.next.next;
            }
        } else if (opt == 2) {
            System.out.print("Enter Registration Number to delete: ");
            int reg = sc.nextInt();

            if (start.regd_no == reg) {
                return DelBeg(start);
            }

            Node temp = start;
            while (temp.next != null && temp.next.regd_no != reg) {
                temp = temp.next;
            }

            if (temp.next == null) {
                System.out.println("Error: Node with Registration Number " + reg + " not present in the list.");
            } else {
                System.out.println("Deleted Regd No: " + temp.next.regd_no);
                temp.next = temp.next.next;
            }
        } else {
            System.out.println("Invalid option.");
        }
        return start;
    }

    public static void search(Node start) {
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

    public static void sort(Node start) {
        if (start == null || start.next == null) {
            return;
        }

        boolean swapped;
        Node current;
        Node ptr = null;

        do {
            swapped = false;
            current = start;

            while (current.next != ptr) {
                if (current.mark < current.next.mark) {
                    // Swap data
                    float tempMark = current.mark;
                    int tempReg = current.regd_no;

                    current.mark = current.next.mark;
                    current.regd_no = current.next.regd_no;

                    current.next.mark = tempMark;
                    current.next.regd_no = tempReg;

                    swapped = true;
                }
                current = current.next;
            }
            ptr = current;
        } while (swapped);
        System.out.println("List sorted by marks (High to Low).");
    }

    public static int count(Node start) {
        int cnt = 0;
        Node temp = start;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static Node reverse(Node start) {
        Node prev = null;
        Node current = start;
        Node nextNode = null;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        System.out.println("List reversed successfully.");
        return prev;
    }

    public static void main(String[] args) {
        Node start = null;
        int choice;

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
            System.out.println("8: Delete from Any Position / By Regd No");
            System.out.println("9: Search and Update Mark");
            System.out.println("10: Sort by Mark");
            System.out.println("11: Count Nodes");
            System.out.println("12: Reverse List");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                case 1:
                    if (start == null) {
                        start = new Node();
                        create(start);
                    } else {
                        System.out.println("List already created. Use insert options to add more.");
                    }
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start = InsBeg(start);
                    break;
                case 4:
                    start = InsEnd(start);
                    break;
                case 5:
                    start = InsAny(start);
                    break;
                case 6:
                    start = DelBeg(start);
                    break;
                case 7:
                    start = DelEnd(start);
                    break;
                case 8:
                    start = DelAny(start);
                    break;
                case 9:
                    search(start);
                    break;
                case 10:
                    sort(start);
                    break;
                case 11:
                    System.out.println("Total nodes in list: " + count(start));
                    break;
                case 12:
                    start = reverse(start);
                    break;
                default:
                    System.out.println("Wrong choice. Please try again.");
            }
        }
    }
}