/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

public class App {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.toString();
        linkedList.insert(10);
        linkedList.insert(9);
        linkedList.insert(8);
        System.out.println(linkedList.toString());
        System.out.println(linkedList.includes(9));

    }
}
