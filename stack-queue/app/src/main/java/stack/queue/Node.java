package stack.queue;

public class Node <T> {
    Node next;
    public T value;


    // constructor
    public Node(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }



    @Override
    public String toString() {
        return value +"";
    }
}

