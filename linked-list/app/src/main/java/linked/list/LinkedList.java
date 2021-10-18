package linked.list;

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

    //Append to the end of list
    public void append(T value){
        Node newNode = new Node(value);
        Node current = head;
        while(current != null ){
            if(current.next == null){
                current.next = newNode;
                break;
            }else
                current = current.next;
                   }
    }
    public void insertBefore(T value,T newValue){
        Node newNode = new Node(newValue);
        Node current = head;
        if(current.value.equals(value)){
            newNode.next = head;
            head = newNode;
        }else{
        while(current!= null){
            if(current.next.value.equals(value)){
                newNode.next = current.next;
                current.next = newNode;
                break;
            }else
                current=current.next;
        }
        }

    }
    public void insertAfter(T value,T newValue){
        Node newNode = new Node(newValue);
        Node current = head;
            while(current != null){
                if(current.value.equals(value)){
                    newNode.next = current.next;
                    current.next = newNode;

                    break;
                }else
                    current=current.next;
            }

    }


}
