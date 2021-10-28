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
        return top+"";
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

    public Node getTop() {
        return top;
    }

    public T getMax(){
        if (isEmpty()){
            System.out.println("the list is empty");
            return null;
        }
        Node num= top;
        Node max= top;
        while (num.getNext()!=null){
            if ((Integer)num.getValue()< Integer.parseInt(num.getNext().getValue()+"")){
                max= num.getNext();
            }
            num= num.getNext();
        }
        return (T) max.getValue();
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }

}