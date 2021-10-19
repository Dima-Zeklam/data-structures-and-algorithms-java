package linked.list;

public class LinkedList<T> {
    Node <T>head;
    int data;
    int size = 0;

    public int getSize()
    {
        return size;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedList(){
        this.head = null;
    }
    // insert  method
    public void insert(T value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size ++;
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
                size ++;
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
            size++;
        }else{
        while(current!= null){
            if(current.next.value.equals(value)){
                newNode.next = current.next;
                current.next = newNode;
                size++;
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
                    size++;
                    break;
                }else
                    current=current.next;
            }

    }



    public String kthFromEnd(int k){
        int index = 0;
        String value =" ";
        Node current = head;
        if(current == null)
         return "The List is Empty";
        else{
                if (getSize() > k && k >=0) {
                        index = (getSize() - 1) - k;
                        for (int i = 0;i<getSize();i++) {
                          if(i == index){
                              value = current.toString();
                          }
                            current = current.next;
                        }
                                }else{
                return "Exception: the value " + k + " is out of the linked list Boundary" ;
            }
        }
        return value ;
    }


}
