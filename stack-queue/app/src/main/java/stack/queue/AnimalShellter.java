package stack.queue;



public class AnimalShellter {

    Queue<String> animals = new Queue<String>();


    public void enqueueAnimal(Animal animal) {
        if (animal instanceof Cat) {
            animals.enqueue(animal.getName());

        } else if (animal instanceof Dog) {
            animals.enqueue(animal.getName());

        } else {
            System.out.println("It should be dog or cat only");
        }
    }

    public String dequeueAnimal(String pref) {
        if (pref == "cat") {
            if (animals.isEmpty())
                return "queue is empty";
            else {

                return animals.dequeue();
            }
        }else
        if (pref == "dog") {
            if (animals.isEmpty())
                return "queue is empty";
            else {

                return animals.dequeue();
            }
        }else
        {return null;}
    }

    @Override
    public String toString() {
        return "AnimalShellter{" +
                "animals=" + animals +
                '}';
    }
}