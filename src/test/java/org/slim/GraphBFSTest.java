package org.slim;

import org.junit.Test;
import org.slim.graph.Graph;
import org.slim.graph.GraphBFS;
import org.slim.graph.GraphNode;

public class GraphBFSTest {

    @Test
    public void runAlgorithm() throws Exception {

        Graph graph = new Graph();
        GraphBFS.getAlgorithm().accept(graph);
    }
}