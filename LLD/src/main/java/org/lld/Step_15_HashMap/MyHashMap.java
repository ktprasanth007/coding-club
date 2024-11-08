package main.java.org.lld.Step_15_HashMap;

// Here we are using Generics as in the HashMap we can store the data of any data type
public class MyHashMap<K, V> {

    // This is the default size -> 16 -> 10000 (bit representation - same as 1<<4)
    private static final int INITIAL_SIZE = 1 << 4; //16

    // Why the maximum capacity is 2^30
    // We knw Integer size is 4 bytes that is the values can go from -2^31 to 2^31-1 (1 bit is signed bit and 0 will be included, so we go till 2^^31-1 only)
    // The HashMap must have size in the power of 2, so the maximum we can go for is 2^30 or 2^31, we cannot use 2^31 because the value of integer can have only unto 2^31-1
    // That's why we use 2^30 as the maximum capacity

    private static final int MAXIMUM_CAPACITY = 1 << 30;
    Entry[] hashTable; // This is where we save the data -> just an array of type Entry

    MyHashMap() {
        hashTable = new Entry[INITIAL_SIZE]; // If the default constructor is called without any size given then it will initialize the HashMap with size 16
    }

    MyHashMap(int capacity) {
        // If the capacity is given then we need to find the closest power of 2 which is just greater than this capacity
        // And this tableSizeFor method is for that
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }

    final int tableSizeFor(int cap) {

        // >>> is unsigned right shift operator -> unlike normal right shift operator, this will consider msb (left 1st bit/signed bit) for the shifting
        // Let's say cap = 12 (1100)
        // n = 11 (1011)
        // n = 1011 | 0111 = 1111 -> 15
        // n = 1111 | 1111 = 1111 -> 15
        // .
        // .
        // .
        // n = 15 ->
        // we are doing this to get the closest large number to the given capacity
        // now if this n>Max capacity then we will return max capacity
        // else we will return n+1 as the maximum because this algo makes the Most Significant Bit as 0 and all others as 1 by the end of it
        // so by just adding 1 we can get our desired result

        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }


    class Entry<K, V> {

        K key;
        V value;
        // This will save the next node in case it is not null
        Entry next;

        Entry(K k, V v) {
            key = k;
            value = v;
        }


        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }


    public void put(K key, V value) {

        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        if (node == null) {
            Entry newNode = new Entry(key, value);
            hashTable[hashCode] = newNode;
        } else {
            Entry previousNode = node;
            while (node != null) {

                if (node.key == key) {
                    // If the same key is already presenting then we just replace it
                    node.value = value;
                    return;
                }
                // else we will create a new Entry at the end of the list
                previousNode = node;
                node = node.next;
            }
            Entry newNode = new Entry(key, value);
            previousNode.next = newNode;
        }
    }


    public V get(K key) {

        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        while (node != null) {
            if (node.key.equals(key)) {
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }

    public static void main(String args[]) {

        MyHashMap<Integer, String> map = new MyHashMap<>(7);
        map.put(1, "hi");
        map.put(2, "my");
        map.put(3, "name");
        map.put(4, "is");
        map.put(5, "Prasanth");
        map.put(6, "how");
        map.put(7, "are");
        map.put(8, "you");
        map.put(9, "friends");
        map.put(10, "?");

        String value = map.get(8);
        System.out.println(value);


    }
}
