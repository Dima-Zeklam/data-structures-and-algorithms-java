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
    //ALGORITHM BreadthFirst(vertex)
    //    DECLARE nodes <-- new List()
    //    DECLARE breadth <-- new Queue()
    //    DECLARE visited <-- new Set()
    //
    //    breadth.Enqueue(vertex)
    //    visited.Add(vertex)
    //
    //    while (breadth is not empty)
    //        DECLARE front <-- breadth.Dequeue()
    //        nodes.Add(front)
    //
    //        for each child in front.Children
    //            if(child is not visited)
    //                visited.Add(child)
    //                breadth.Enqueue(child)
    //
    //    return nodes;


    public ArrayList<String> BreadthFirst(T vertex) {
        if(vertex == null ){
            return null;
        }
        ArrayList<String> nodes = new ArrayList<>();
        Queue<Node> breadth = new LinkedList<>();
        Set<T> visited = new HashSet<>();
        int index = adjacencyMap.get(vertex);
        Node rootNode = vertices.get(index);
        if(rootNode == null){
            return null;
        }

        breadth.add(rootNode);
        visited.add((T)rootNode.getValue());
        while (!breadth.isEmpty()) {
            Node node = breadth.poll();
            nodes.add(node.getValue().toString());
            ArrayList<Neighbor> neighbors = node.getNeighbors();
            Iterator<Neighbor> child = neighbors.iterator();

            while(child.hasNext()){
                Node childNode = child.next().getNode();
                if(visited.contains(childNode.getValue())){
                    continue;
                }
                visited.add((T)childNode.getValue());
                breadth.add(childNode);
            }
        }
        return nodes;
    }

//Write a function called business trip
//Arguments: graph, array of city names
//Return: cost or null
//Determine whether the trip is possible with direct flights, and how much it would cost.
    public String businessTrip(Graph graph , ArrayList<String> cityNames ){
        int cost = 0;
        int weight = 0;
        if (cityNames.size() <= 1)
            return "null";

        for (int i = 0; i < cityNames.size() - 1;i++) {
            for (Neighbor item : getNeighbors((T) cityNames.get(i))) {
//                System.out.println(cityNames.get(i + 1));
                if (cityNames.get(i + 1) == item.getNode().getValue()) {

                    weight = item.getWeight();
                }
            }
                if (weight == 0)
                    return "False, $0";

                cost += weight;

        }
        return "True, $" + cost;
    }
}

