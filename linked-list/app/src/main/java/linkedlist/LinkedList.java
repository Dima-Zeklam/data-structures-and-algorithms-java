package linkedlist;

public class LinkedList<T> {
    Node <T>head;
    public LinkedList(){
        this.head = null;
    }
    // insert  method
    public void insert(T value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

    }
    //includes
    public boolean includes(T value){
        Node current = head;
        while(current!= null){
            if(current.value.equals(value)){
                return true;
            }else
                current=current.next;
        }
        return false;
    }

    // toString
    @Override
    public String toString(){
        String output= "";
        Node current = head;
        while(current != null) {
            output += "{ " + current.value + " } -> ";
            current = current.next;
        }
        output +="NULL";
        return output;
    }

}
