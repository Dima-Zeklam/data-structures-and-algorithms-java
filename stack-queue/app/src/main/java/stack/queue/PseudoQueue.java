package stack.queue;



public class PseudoQueue <T>{
    Stack<T> stack1 = new Stack<T>();
    Stack<T> stack2 = new Stack<T>();

    public void PseudoEnqueue(T value){

      if(!stack2.isEmpty()){
          T data = (T)stack2.pop();
          stack1.push(data);
      }

        stack2.push(value);
        if(!stack1.isEmpty()){
            T data = (T)stack1.pop();
            stack2.push(data);
        }

    }
    public String PseudoDequeue(){

        if(!stack1.isEmpty()){
            T data = (T) stack1.pop();
            stack2.push(data);
        }

        String removedValue = stack2.pop();
        if(!stack2.isEmpty()){
            T data = (T)stack2.pop();
            stack1.push(data);
        }

return removedValue;
    }

    @Override
    public String toString() {
        return "PseudoQueue{" +
                "stack2=" + stack2 +
                '}';
    }
}
