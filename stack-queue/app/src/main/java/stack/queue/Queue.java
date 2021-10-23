package stack.queue;

public class Queue <T> {
    Node <T> front;
    Node <T> rear;
    T data ;


    public boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }
    public String peek(){
        if(isEmpty()){
            return "the Queue is empty";
        }
        return front.value.toString();
    }

    public void enqueue(T value){
        Node newNode = new Node(value);

        if(isEmpty())
            front=newNode;
        else
            rear.next = newNode;
        rear =newNode;

    }
    public String dequeue(){
        Node current = front;
        if(isEmpty()){
            return "the Queue is empty";
        }
        front = front.next ;
        current.next = null;
        return current.toString();

    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
