package stack.queue;

public class Stack<T> {
    Node <T> top;
    T data ;

    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }
    public String peek(){
        if(isEmpty()){
            return "the stack is empty";
        }
        return top.toString();
    }

    public void push(T value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public String pop()  {

        if(isEmpty()){
            return "the stack is empty";
        }
        Node current = top;
        top = top.next;
        current.next = null;
        return current.toString();

    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}