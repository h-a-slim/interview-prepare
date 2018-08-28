package org.slim.graph;

import java.util.*;
import java.util.function.Consumer;

public class GraphBFS {

    public  static class Input {
        public Graph graph;
        public int startFrom;
    }

    public static Consumer<GraphBFS.Input> getAlgorithm() {
        return (input) -> {

            HashSet<GraphNode> visited = new HashSet<>();

            LinkedList<GraphNode> nodes = new LinkedList<>();
            ArrayList<Integer> visitedNodes = new ArrayList<>();

            nodes.add(input.graph.getVertices().get(input.startFrom));

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
