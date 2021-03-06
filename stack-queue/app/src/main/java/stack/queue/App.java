/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue;



public class App {

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
        stack.push(10);
        stack.push(30);
        stack.push(45);
        System.out.println(stack.pop());
        System.out.println(stack.toString());


        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(3);
        System.out.println(queue.isEmpty());
        queue.enqueue(7);
        queue.enqueue(8);
        System.out.println(queue.toString());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println("*****************");
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
        pseudoQueue.PseudoEnqueue(5);// first in first out, will be the front
        pseudoQueue.PseudoEnqueue(10);
        pseudoQueue.PseudoEnqueue(20);// will be the rear
        System.out.println(pseudoQueue.toString());

        System.out.println(pseudoQueue.PseudoDequeue());// will delete front which is 5
        System.out.println(pseudoQueue.toString()); // the front become 10

        System.out.println("*****************");
        Animal cat1 = new Cat("kitty");
        Animal cat2 = new Cat("jeje");
        Animal cat3 = new Cat("katy");
        Animal dog1 = new Dog("jak");
        Animal dog2 = new Dog("husky");
        Animal dog3 = new Dog("polty");
      AnimalShellter animalShellter = new AnimalShellter();
        System.out.println(animalShellter.dequeueAnimal("cat"));
      animalShellter.enqueueAnimal(cat1);
      animalShellter.enqueueAnimal(cat2);
      animalShellter.enqueueAnimal(dog1);
      animalShellter.enqueueAnimal(dog2);
      animalShellter.enqueueAnimal(cat3);
      animalShellter.enqueueAnimal(dog3);
      System.out.println(animalShellter.toString());
        System.out.println(animalShellter.dequeueAnimal("cat"));
        System.out.println(animalShellter.dequeueAnimal("dog"));
        System.out.println(animalShellter.toString());
        ValidateBrackets bracket = new ValidateBrackets();
        System.out.println( bracket.validateBrackets("{}{Code}[Fellows](())")); // return true
        System.out.println( bracket.validateBrackets("[({}]")); // return false
        System.out.println( bracket.validateBrackets("}")); // return false
        Stack<Integer> stack5 = new Stack<Integer>();
        stack5.push(6);
       stack5.push(7);
        stack5.push(8);
        System.out.println(stack5.getMax());
    }

}
