package trees;

public class BinarySearchTree<T> extends BinaryTree {


    public void add(T value) {
        //Add
        //Arguments: value
        //Return: nothing
        //Adds a new node with that value in the correct location in the binary search tree.

        Node node = new Node(value);

        try{

            if(!isEmpty()){
                Node current = root;
                while(current != null){

                    if((int) value > (int) current.data  ){
                        if(current.right == null){
                            current.right = node;
                            return;
                        }
                        current = current.right;
                    }
                    else{
                        if(current.left == null){
                            current.left = node;
                            return;
                        }
                        current = current.left;
                    }
                }//while
            }else {root = node;}

        } catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean contains(T value) {
        try {
            if (!isEmpty()) {
                Node current = root;
                while (current != null) {
                    if ((int) value == (int) current.data) {
                        return true;
                    }

                    if ((int) value > (int) current.data) {
                        if (current.right == null) {
                            return false;
                        }
                        current = current.right;

                    } else {
                        if (current.left == null) {
                            return false;
                        }
                        current = current.left;
                    }
                }
            } else {
                return false;
            }
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());

        }

        return false;
    }
    }

