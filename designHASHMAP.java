class Entry{
    public int key,value;
    public Entry(int key,int value){
        this.key=key;
        this.value=value;
    }
}
class MyHashMap {
    LinkedList<Entry>[]mp;static int size=769;
    /** Initialize your data structure here. */
    public MyHashMap() {
        mp=new LinkedList[size];//mp is now an array of Linked list just like we have arr of intgers.
  
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
         int bucket=key%size;
        if(mp[bucket]==null) { 
           mp[bucket]=new LinkedList<Entry>();
            mp[bucket].add(new Entry(key,value));
        }
        else{
            LinkedList<Entry> ll=mp[bucket];
        for(Entry entry:ll){
            if(entry.key==key) { //if key is there then simply increment its value;
                entry.value=value;
                return ;
            }
        }
        mp[bucket].add(new Entry(key,value)); //if key was not there then put new entry of it
        
        }
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int bucket=key%size;
        if(mp[bucket]==null) return -1;
               for(Entry entry : mp[bucket]){ //iterating in ll list;
           if(entry.key==key) return entry.value;
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
          int bucket=key%size;
        if(mp[bucket]==null) return;
        Entry p=null;
        
        for(Entry entry:mp[bucket]){
            if(entry.key==key){
                mp[bucket].remove(entry);
                return;
            }
        }
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */