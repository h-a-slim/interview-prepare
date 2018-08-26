package org.slim.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    public Graph() {
        vertices = new ArrayList<>();
    }

    public List<GraphNode> getVertices() {
        return vertices;
    }

    private List<GraphNode> vertices;
}
