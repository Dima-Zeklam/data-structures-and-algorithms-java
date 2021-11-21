package hashtable;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class HashTable<K,V> {

    private ArrayList<Node<K, V>> bucketArray;

    private int numBuckets;

    private int size;

    //Initializes capacity, size and empty chains.
    public HashTable() {

        bucketArray = new ArrayList<>();
        numBuckets = 10;

        for (int i = 0; i < numBuckets; i++)
            bucketArray.add(null);
    }
    public int size() { return size; }

    public boolean isEmpty() { return size() == 0; }

    private final int hashCode (K key) {
        return Objects.hashCode(key);
    }
    //hash
    //Arguments: key
    //Returns: Index in the collection for that key
    public int hash(K key)
    {
        int hashCode = hashCode(key);

        int index = hashCode % numBuckets;
        // this is to ensure the index is with in the bounds of the bucket array
        if(index <0 ){
            index = index * -1;
        }
        return index;
    }

    //add method
    //Have an Arguments: key, value
    //Returns: nothing
    //This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
    public void add(K key , V value) {
        int bucketIndex = hash(key);
        int hashCode = hashCode(key);
        Node<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;

        // Insert key in chain
        head = bucketArray.get(bucketIndex);
        Node<K, V> newNode = new Node<K, V>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<Node<K, V> > temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;
            for (int i = 0; i < numBuckets; i++)
                bucketArray.add(null);

            for (Node<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

//get
//Arguments: key
//Returns: Value associated with that key in the table
    // will return the value based on the key
public V get(K key)
{
    int bucketIndex = hash(key);
    int hashCode = hashCode(key);

    Node<K, V> head = bucketArray.get(bucketIndex);

    // Search key in chain
    while (head != null) {
        if (head.key.equals(key) && head.hashCode == hashCode)
            return head.value;
        head = head.next;
    }

    return null;
}

//    contains
//    Arguments: key
//    Returns: Boolean, indicating if the key exists in the table already.
public V contains(K key)
{
    int bucketIndex = hash(key);
    int hashCode = hashCode(key);

    Node<K, V> head = bucketArray.get(bucketIndex);

    // Search key in chain
    while (head != null) {
        if (head.key.equals(key) && head.hashCode == hashCode)
            return head.value;
        head = head.next;
    }

    return null;
}
    public String repeatedWord(String string){

     HashTable<String,Integer> hashTable = new HashTable<String,Integer>();
     String[] statment = string.toLowerCase().split(" ");
for(String word:statment){
    if (word.contains(",") || word.contains(".") ||word.contains(":")) {
        word = word.substring(0, word.length() - 1);}
    int count = hashTable.get(word) != null ? hashTable.get(word) : 0;
    if (count ==1) {
        return word;
    }
    hashTable.add(word, count + 1);
}

        return "There is no any duplicated word";
    }

}
