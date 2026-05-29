
public class DLL {

    Node head;
    Node tail;

    class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public DLL(){
    
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public boolean del(int key){
        Node current = head;
        while (current != null){
            if(current.data == key){
                if (current == head && current == tail){
                    head = tail = null;
                }
                else if(current == head){
                    head = head.next;
                    head.prev = null;
                }
                else if(current == tail){
                    tail = tail.prev;
                    tail.next = null;
                }
                else{
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void displayForward(){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data);
            if(current.next != null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
    public void displayBackward(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node current = tail;
        while(current != null){
            System.out.print(current.data);
            if(current.prev != null){
                System.out.print(" -> ");
            }
            current = current.prev;
        }
        System.out.println();
    }
    public static void main(String[]args){
        DLL list = new DLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.displayForward();
        list.addFirst(0);
        list.displayForward();
        list.del(1);
        list.displayBackward();

    }
}
