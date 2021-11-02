package trees.KaryTree;

import java.util.ArrayList;
import java.util.List;

public class Node <T>{
    T data;
    List<Node> children = new ArrayList<>();

    public Node(T data) {
        this.data = data;
    }

    public void addChildren(Node <T>value) {
        this.children.add(value);
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
       // The StringBuilder in Java represents a mutable sequence of characters.
        StringBuilder karyTree = new StringBuilder(" ");
        karyTree.append(data);
        for (Node<T> values : children) {
            karyTree.append(",");
            karyTree.append(values);
        }
        return karyTree.toString();
    }

}
