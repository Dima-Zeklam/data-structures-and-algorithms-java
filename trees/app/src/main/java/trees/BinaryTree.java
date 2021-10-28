package trees;

import java.util.ArrayList;

public class BinaryTree<T> {
    Node root;


    //pre-order
    public ArrayList<T> preOrder(Node root){
        ArrayList<T> tree = new ArrayList<>();
        if(!isEmpty()){
            tree.add((T)root.data);
//            System.out.println(root);
            if(root.left != null)
                tree.addAll(preOrder(root.left));
            if(root.right != null)
                tree.addAll(preOrder(root.right));
        }
return tree;
    }

    //in-order
    public ArrayList<T> inOrder(Node root){
        ArrayList<T> tree = new ArrayList<>();
        if(!isEmpty()){

            if(root.left != null)
                tree.addAll(inOrder(root.left));
            tree.add((T)root.data);
//            System.out.println(root);
            if(root.right != null)
                tree.addAll(inOrder(root.right));
        }
        return tree;
    }

    //post-order
    public ArrayList<T> postOrder(Node root){
        ArrayList<T> tree = new ArrayList<>();
        if(!isEmpty()){
            if(root.left != null)
                tree.addAll(postOrder(root.left));
            if(root.right != null)
                tree.addAll(postOrder(root.right));
//            System.out.println(root);
            tree.add((T)root.data);
        }
        return tree;
    }

    public boolean isEmpty(){
        if(root == null)return true;
        return false;
    }

}
