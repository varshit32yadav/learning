class Entry{
    int key;
    public Entry(int key){
        this.key=key;
    }
}
class MyHashSet {
    LinkedList<Entry>[]hs;static int size=769;
    /** Initialize your data structure here. */
    public MyHashSet() {
        hs=new LinkedList[size];
    }
    
    public void add(int key) {
        int bucket=key%size;
        if(hs[bucket]==null){
            hs[bucket]=new LinkedList<>();
           hs[bucket].add(new Entry(key));return;
        }
        else {
            for(Entry entry :hs[bucket]){
                    if(entry.key==key)return;
            }
            hs[bucket].add(new Entry(key));
            }
        }
    
    
    public void remove(int key) {
        int bucket=key%size;
        if(hs[bucket]==null)
            return;
        for(Entry entry :hs[bucket]){
            if(entry.key==key){
                hs[bucket].remove(entry);
                 return;
            }
        }  
    } 
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
       int bucket=key%size;
        if(hs[bucket]==null) return false;
        for(Entry entry :hs[bucket]){
            if(entry.key==key)
                return true;
        } 
        return false; 
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */