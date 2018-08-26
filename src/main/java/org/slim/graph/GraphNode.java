package org.slim.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    public GraphNode() {
        neighbors = new ArrayList<>();
    }

    public List<GraphNode> getNeighbors() {
        return neighbors;
    }

    private List<GraphNode> neighbors;
}
