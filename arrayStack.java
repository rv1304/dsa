// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Stack {
    int arr[];
    int size ;
    int currSize;
    
    Stack(int n){
        this.arr = new int[n];
        this.size = n;
        this.currSize = 0;
    }
    
    void push(int val) {
        if (currSize < size) {
            arr[currSize++] = val;
        } else System.out.println("Overflow");
        
    }
    
    void resize () {
        int newArr = new int [size*2];
    for (int i;i)
    }
    
    int pop () {
        if (currSize <=0) {
            System.out.println("Underflow");
            return -1;
        }
        int temp = arr[--currSize];
        return temp;
    }
    
    int size() {
        return currSize;
    }
    boolean isEmpty() {
        return currSize == 0;
    }
}
