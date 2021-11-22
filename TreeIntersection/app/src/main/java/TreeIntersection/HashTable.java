package TreeIntersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class HashTable <K,V>{
    private ArrayList<HashNode<K,V>> bucketArray;

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
        HashNode<K, V> head = bucketArray.get(bucketIndex);

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
        HashNode<K, V> newNode = new HashNode<K, V>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V> > temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;
            for (int i = 0; i < numBuckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
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

        HashNode<K, V> head = bucketArray.get(bucketIndex);

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
    public boolean contains(K key)
    {
        int bucketIndex = hash(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // Search key in chain
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode)
                return true;
            head = head.next;
        }

        return false;
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

    public ArrayList<String> tree_intersection (BinarySearchTree TreeOne, BinarySearchTree TreeTwo ){

        ArrayList<Integer> TreeOneArray= TreeOne.inOrder(TreeOne.root);
        ArrayList<Integer> TreeTwoArray= TreeTwo.inOrder(TreeTwo.root);

        HashTable<String,Integer> HashMap= new HashTable<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i =0;i<TreeOneArray.size();i++){
            if (!HashMap.contains(TreeOneArray.get(i).toString())){
                HashMap.add(TreeOneArray.get(i).toString(),1);
            }else{
                HashMap.add(TreeOneArray.get(i).toString(),HashMap.get(TreeOneArray.get(i).toString())+1);

            }
        }
        for ( int i =0 ;i< TreeTwoArray.size();i++){
            if (!HashMap.contains(TreeTwoArray.get(i).toString())){
                HashMap.add(TreeTwoArray.get(i).toString(),1);

            }else{
                HashMap.add(TreeTwoArray.get(i).toString(),HashMap.get(TreeTwoArray.get(i).toString())+1);
                arrayList.add(TreeTwoArray.get(i).toString());
            }
        }
        return  arrayList;


    }
}
