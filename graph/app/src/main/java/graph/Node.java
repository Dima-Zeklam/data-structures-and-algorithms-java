package graph;

import java.util.ArrayList;

public class Node <T>{

   private T value ;
    private ArrayList<Neighbor> neighbors = new ArrayList<>();
    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ArrayList<Neighbor> getNeighbors() {
        return neighbors;
    }
    public void addNeighbor(Neighbor neighbor){
        if(! neighbors.contains(neighbor))
            neighbors.add(neighbor);
    }
    public void setNeighbors(ArrayList<Neighbor> neighbors) {
        this.neighbors = neighbors;
    }


}
