// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LinkedListStack {
     class Node {
        Node next;
        int val;
        
        Node (int val) {
            this.val = val;
        }
    }
    Node head;
    int size ;
    LinkedListStack(){
        head = null;
        size = 0;
    }
    
    void push(int val) {
        Node temp = new Node (val);
        if (head == null) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    
    int pop () {
        if (head == null) return -1;
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }
    
    int sizeVal() {
        return size;
    }
    boolean isEmpty() {
        return size == 0; 
    }
}
