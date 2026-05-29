package Ass3;

public class InsertAnyPOsi {
    public void(int pos, int data){
        Node NewNode = new Node();
        if(pos == 1){
            newNode.next = head;
            if(head != null){
                head.prev =newNode;
            }
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i = 1; i < pos - 1 && temp != null; i++ ){
            temp = temp.next;
        }
        if (temp == null){
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if(temp.next != null){
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }
}
