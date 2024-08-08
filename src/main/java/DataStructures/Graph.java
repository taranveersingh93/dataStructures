package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Graph {
    private  HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public boolean addVertex (String vertex) {
        if (adjList.containsKey(vertex)) {
            return false;
        } else {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
    }

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addEdge (String from, String to) {
        if (!adjList.containsKey(from) || !adjList.containsKey(to)) {
            return false;
        } else {
            adjList.get(from).add(to);
            adjList.get(to).add(from);
            return true;
        }
    }

    public boolean removeEdge (String from, String to) {
        if (!adjList.containsKey(from) || !adjList.containsKey(to)) {
            return false;
        } else {
            adjList.get(from).remove(to);
            adjList.get(to).remove(from);
            return true;
        }
    }

    public boolean removeVertex (String vertex) {
        if (!adjList.containsKey(vertex)) {
            return false;
        } else {
            ArrayList<String> links = adjList.get(vertex); //get all vertices that have an edge with vertex
            for (int i = 0; i < links.size(); i++) { // loop through those vertices
                ArrayList<String> linkedVertices = adjList.get(links.get(i)); //get their corresponding edges
                linkedVertices.remove(vertex); // remove vertex
            }
            adjList.remove(vertex); //finally remove the key/value of the vertex itself
            return true;
        }
    }
}
