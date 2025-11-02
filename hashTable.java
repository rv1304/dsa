class hashTable <K, V>{
    class Node {
        Node next;
        Object key;
        Object val;
        
        Node(Object key ,Object val){
            this.key = key;
            this.val = val;
        }
    }
    
    int m = 32;
    Node nodeArr[] = new Node[m];
    
    public int hash(Object key) {
        return Math.abs(key.hashCode() % m); // it can become negative
    }
    
    public void put (Object key , Object val) {
        int hashCode = hash(key);
        Node temp = nodeArr[hashCode];
        
        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.val = val;
                return ;
            }  
            temp = temp.next;
        }
        Node newTemp = new Node(key,val);
        newTemp.next = nodeArr[hashCode]; 
        nodeArr[hashCode] = newTemp; /// this is line where
        // you can make mistake 
    }
    
    public Object get(Object key) {
        int hashCode = hash(key);
        Node temp = nodeArr[hashCode];
        
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.val;
            }  
            temp = temp.next;
        }
        return null;
    }
    
}
