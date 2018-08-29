package com.epo.learning.algorithms;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {

  private class GraphNode {
    int vertex;
    boolean visited = false;
    LinkedList<GraphNode> adjacent = new LinkedList<>();
    private GraphNode(int vertex) {
      this.vertex = vertex;
    }
  }

}
