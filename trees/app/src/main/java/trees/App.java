/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class App {

    public static void main(String[] args) {
 BinarySearchTree<Integer>tree = new BinarySearchTree<>();
        tree.add(10);
        tree.add(5);
        tree.add(30);
        tree.add(7);
        tree.add(9);
        tree.add(11);
        System.out.println(tree.root);
        System.out.println(tree.contains(10));
        System.out.println(tree.preOrder(tree.root));
        System.out.println(tree.inOrder(tree.root));
        System.out.println(tree.postOrder(tree.root));
        System.out.println("The max number in the tree is: " + tree.treeMax());
        System.out.println(tree.breadthFirst(tree));
    }
}
