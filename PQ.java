class PQ {
    
    int size;
    int [] arr;
    int currSize;
    
    PQ(int n) {
        this.size = n;
        arr = new int[n+1];
        this.currSize = 0;
    }
    
    void add(int val) {
        if(currSize < size) {
            arr[++currSize] = val;
            swim(currSize);
        } else System.out.println("Overflow");
        
    }
    
    void swap(int a , int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    void swim (int i) {
        while (i > 1 && arr[i/2] < arr[i]) {
            swap(i/2,i);
            i = i/2;
        }
    }
    
    int delMax() {
        if (currSize > 0) {
            int ans = arr[1]; /// will be 1 not 0
            swap(1,currSize);
            currSize --;
            sink(1);
            return ans;
        } else {
            System.out.println("Underflow");
            return -1;
        }
        
    }
    
    void sink (int i) {
        while (2*i <= currSize) {
            int j = i*2;
            if (j + 1 <= currSize && arr[j] < arr[j+1]) j++;
            if (arr[i] < arr[j]) {
                swap(j,i);
                i = j;                
            } else break;
        }
    }
    
}
