class LinkedListQueue {

    class Node {
        Node next;
        int val;
        
        Node (int val) {
            this.val = val;
        }
    }
    Node head;
    Node mover;
    
    LinkedListQueue() {
        head = null;
        mover = null;
    }
    
    void push (int val) {
        Node temp = new Node (val);
        if (head == null) {  /// not head == mover
            mover = temp;
            head = temp;
        } else {
            mover.next = temp;
            mover = mover.next;
        }
    }
    int pop() {
        if (head == null) return -1;
        int val = head.val;
        head = head.next;
        if (head == null) mover = null;
        return val;
    }

    boolean isEmpty() {
        return head == null;
    }
}


