package org.slim.graph;

import java.util.*;
import java.util.function.Consumer;

public class GraphBFS {


    public static Consumer<Graph> getAlgorithm() {
        return (graph) -> {

            HashSet<GraphNode> visited = new HashSet<>();

            LinkedList<GraphNode> nodes = new LinkedList<>();
            ArrayList<Integer> visitedNodes = new ArrayList<>();

            nodes.add(graph.getVertices().get(3));

            GraphNode currentNode = null;

            while (!nodes.isEmpty()) {
                currentNode = nodes.poll();

                if(!visitedNodes.contains(currentNode.getId())){
                    visitedNodes.add(currentNode.getId());

                    nodes.addAll(currentNode.getNeighbors());

                    System.out.println("Visit Node: " + currentNode.getId());
                }
            }
        };
    }


}
