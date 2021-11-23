/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TreeIntersection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void tree_intersectionTest() {
        HashTable<String,Integer> hashTable=new HashTable<>();
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(10);
        tree.add(7);
        tree.add(8);
        tree.add(3);
        tree.add(9);
        BinarySearchTree<Integer> tree2 = new BinarySearchTree<>();
        tree2.add(5);
        tree2.add(10);
        tree2.add(7);
        tree2.add(88);
        tree2.add(32);
        tree2.add(99);
        assertEquals("[5, 7, 10]",hashTable.tree_intersection(tree,tree2));
    }
}