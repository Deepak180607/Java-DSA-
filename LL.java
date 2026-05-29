public class LL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //insertion - first, last
    //first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    //last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
        head = newNode;
        return;
    }
    //traversing linked list
    Node curNode = head;
    while(curNode.next !=  null){
        curNode = curNode.next;
    }
    curNode.next = newNode;
}
    public void display(){
        if(head == null){
            System.out.println("List is enmpty");
            return;
        }
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    //Deletion - first, last
    //First
    public void delFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void delLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == null){
            head = null;//for single node
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addLast("alphabet");
        list.addFirst("is");
        list.addFirst("This");
        list.display();

        list.delFirst();
        list.delLast();
        list.display();
    }
}
