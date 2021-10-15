/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App test = new App();

    //Can successfully instantiate an empty linked list
    @Test void InstantiateEmptyLinkedList(){
LinkedList <Integer> List = new LinkedList<Integer>();
assertNull(List.head);
    }

    //Can properly insert into the linked list
    @Test void CanInsertIntoLinkedList() {
        LinkedList <Integer> List = new LinkedList<Integer>();
        List.insert(3);
        List.insert(2);
        List.insert(1);
        String expect = "{ 1 } -> { 2 } -> { 3 } -> NULL";
        assertEquals(expect,List.toString());

    }

    //The head property will properly point to the first node in the linked list
    @Test void HeadPointFirstNode() {
        LinkedList <Integer> List = new LinkedList<Integer>();
        List.insert(3);
        List.insert(2);
        List.insert(1);
        assertEquals(1,List.head.value);
    }

    //Can properly insert multiple nodes into the linked list
    @Test void CanInsertmultipleNodes() {
        LinkedList <Integer> List = new LinkedList<Integer>();
        List.insert(5);
        List.insert(4);
        List.insert(3);
        List.insert(2);
        List.insert(1);
        String expect = "{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> NULL";
        assertEquals(expect,List.toString());
    }

//Will return true when finding a value within the linked list that exists
@Test void IncludesValueTest() {
    LinkedList <Integer> List = new LinkedList<Integer>();
    List.insert(5);
    List.insert(4);
    List.insert(3);
    List.insert(2);
    List.insert(1);
    assertTrue(List.includes(3));
}

//Will return false when searching for a value in the linked list that does not exist
@Test void NotIncludesValueTest() {
    LinkedList <Integer> List = new LinkedList<Integer>();
    List.insert(5);
    List.insert(4);
    List.insert(3);
    List.insert(2);
    List.insert(1);
    assertFalse(List.includes(10));
}

//Can properly return a collection of all the values that exist in the linked list
@Test void TestLinkedListCollection() {
    LinkedList <Integer> List = new LinkedList<Integer>();
    List.insert(100);
    List.insert(99);
    List.insert(98);
    List.insert(97);
    List.insert(96);
    String expect = "{ 96 } -> { 97 } -> { 98 } -> { 99 } -> { 100 } -> NULL";
    assertEquals(expect,List.toString());
}
}
