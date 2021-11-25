package graph;

import java.util.*;

public class Graph <T> {

    private List <Node> vertices  = new ArrayList<>();
    private HashMap<T,Integer> adjacencyMap = new HashMap<>();
    private int size = 0 ;

    public boolean isNodeExist(T value){
        return adjacencyMap.containsKey(value);
    }

    //    add node //    Arguments: value //    Returns: The added node //    Add a node to the graph
    public Node addNode (T value){
        int index;
        if (isNodeExist(value)){
            index = adjacencyMap.get(value);
        } else {
            adjacencyMap.put(value, size());
            Node newNode = new Node(value);
            vertices.add(newNode);
            index = size;
            size++;
        }
        return vertices.get(index);
    }


//    add edge //    Arguments: 2 nodes to be connected by the edge, weight (optional) //    Returns: nothing
//    Adds a new edge between two nodes in the graph //    If specified, assign a weight to the edge
//    Both nodes should already be in the Graph
    public void addEdge(T fromValue,T destinationValue, int weight)  {

        //   check if Both nodes already be in the Graph
        if( isNodeExist(fromValue) && isNodeExist(destinationValue)) {
            int FirstIndex = adjacencyMap.get(fromValue);
            int SecIndex = adjacencyMap.get(destinationValue);

            Node nodeOne = vertices.get(FirstIndex);
            Node nodeTwo = vertices.get(SecIndex);
      // Add Neighbor
            Neighbor neighborNodeOne = new Neighbor(nodeTwo,weight);
            Neighbor neighborNodeTwo = new Neighbor(nodeOne,weight);
            nodeOne.addNeighbor(neighborNodeOne);
            nodeTwo.addNeighbor(neighborNodeTwo);
        }

    }

//    get nodes
//    Arguments: none
//    Returns all of the nodes in the graph as a collection (set, list, or similar)

    public Set<T> getNodes(){
        return adjacencyMap.keySet();
    }

//    get neighbors //    Arguments: node //    Returns a collection of edges connected to the given node
public ArrayList<Neighbor> getNeighbors(T value ) {
    if (isNodeExist(value)){
        int index = adjacencyMap.get(value);
        Node current = vertices.get(index);
        return current.getNeighbors();

    }
     System.out.println("Node not found");
     return null;

}

//    size //    Arguments: none //    Returns the total number of nodes in the graph
    public int size() {
        return adjacencyMap.size();
    }

    private boolean IsEmpty() {
        return this.size ==0;
    }

    @Override
    public String toString() {
        if(vertices.isEmpty()){
            return null;
        }else
        return "Graph{" +
                "vertices=" + vertices +
                '}';
    }
}

