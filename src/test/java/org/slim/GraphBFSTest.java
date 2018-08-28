package org.slim;

import org.junit.Test;
import org.slim.graph.Graph;
import org.slim.graph.GraphBFS;
import org.slim.graph.GraphNode;

public class GraphBFSTest {

    @Test
    public void runAlgorithm() throws Exception {

        Graph graph = new Graph();

        //The nodes
        GraphNode node0 = new GraphNode(0);
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);

        //Setup the Graph
        node0.getNeighbors().add(node1);
        node0.getNeighbors().add(node2);

        node2.getNeighbors().add(node0);
        node2.getNeighbors().add(node3);

        node1.getNeighbors().add(node2);

        node3.getNeighbors().add(node3);

        graph.getVertices().add(node0);
        graph.getVertices().add(node1);
        graph.getVertices().add(node2);
        graph.getVertices().add(node3);

        GraphBFS.Input input = new GraphBFS.Input();
        input.graph = graph;
        input.startFrom = 2;

        GraphBFS.getAlgorithm().accept(input);
    }
}