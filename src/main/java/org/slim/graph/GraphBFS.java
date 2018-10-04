package org.slim.graph;

import java.util.*;
import java.util.function.Consumer;

public class GraphBFS {

    public  static class Input {
        public Graph graph;
        public int startFrom;
    }

    private static Consumer<GraphBFS.Input> getAlgorithm() {
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

    public static void applyAlgorithm(GraphBFS.Input input) {
        //GraphBFS.getAlgorithm().accept(input);
        Consumer<GraphBFS.Input> algorithm = (in) -> {
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
        algorithm.accept(input);
    }


}
