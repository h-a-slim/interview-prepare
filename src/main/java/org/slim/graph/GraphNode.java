package org.slim.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    public GraphNode(Integer id) {
        this.neighbors = new ArrayList<>();
        this.id = id;
    }

    public List<GraphNode> getNeighbors() {
        return neighbors;
    }

    public Integer getId() {
        return id;
    }

    private List<GraphNode> neighbors;

    private Integer id;
}
