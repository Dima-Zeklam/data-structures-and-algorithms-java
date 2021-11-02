package trees.KaryTree;


import java.util.LinkedList;
import java.util.Queue;

public class KaryTree<T> {

    Node<T> root = null;
    int node = 0 ;
    int k = 0;

    public KaryTree(int k) {
        if(k<=1)
            k=2;
        this.k = k;
    }
    public boolean isEmpty() {

        return root == null;
    }
    public void add(T value){
    Node<T> newNode = new Node<T>(value);
    if(root == null){
        root = newNode;
        return;
    }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {

            Node<T> current = queue.poll();
            if (current.children.size() < k) {
                current.addChildren(newNode);
                return;
            } else {
                queue.addAll(current.children);
            }
        }
    }
    public KaryTree<String> fizzBuzzTree(KaryTree<T> tree) {
        KaryTree<String> newTree = new KaryTree<>(tree.k);
        Queue<Node> queue = new LinkedList<>();

        if (!tree.isEmpty()) {

            queue.add(tree.root);
            while (!queue.isEmpty()) {
                Node<T> current = queue.remove();
                String val;
                if ((int) current.data % 3 == 0 && (int) current.data % 5 == 0)
                    val = "FizzBuzz";

                else if ((int) current.data % 3 == 0)
                    val = "Fizz";
                else    if ((int) current.data % 5 == 0)
                    val = "Buzz";
                else
                    val = current.data.toString();
                newTree.add(val);

                if (!current.children.isEmpty())
                    queue.addAll(current.children);
            }}
        return newTree;
    }

    @Override
    public String toString() {
        return '[' + ""+root+ ']';
    }
}
