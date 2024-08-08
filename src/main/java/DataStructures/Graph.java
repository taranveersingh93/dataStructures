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
}
