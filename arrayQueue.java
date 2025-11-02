class arrayQueue {
    int [] arr;
    int start;
    int end;
    int size;
    
    arrayQueue(int size) {
        this.size = size; 
        arr = new int [size];
        this.start = -1;
        this.end = -1;
    }
    
    void push (int val) {
        if ((end + 1) % size == start) {
            System.out.println("Overflow");
        } else {
            if (start == -1){
                start = 0;
                end = 0;
            } else end = (end + 1) % size;
            arr[end] = val;
        }
    }
    int pop() {
        if (start == -1) {
             return -1;
        } else {
            int ans = arr[start];
            if (start == end) {
                start = -1 ; 
                end = -1;
            } else start = (start + 1) % size;
            return ans;
        }
        
    }

    boolean isEmpty() {
        return start == -1;
    }
}
