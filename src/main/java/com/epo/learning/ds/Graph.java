package com.epo.learning.ds;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
private HashMap<Integer, Node> nodeLookUp = new HashMap<>();

  private static class Node {
    int id;
    LinkedList<Node> adjacent = new LinkedList<>();
    private Node(int id) {
      this.id = id;
    }
  }

  public Node getNode(int id) {return nodeLookUp.get(id);}
  public void addEdge(int source, int dest) {
    Node s = getNode(source);
    Node d = getNode(dest);
    s.adjacent.add(d);
  }

  public boolean hasPathDFS(int source, int dest) {
    Node s = getNode(source);
    Node d = getNode(dest);
    HashSet<Integer> visited = new HashSet<>();
    return hasPathDFS(s, d, visited);
  }

  private boolean hasPathDFS(Node src, Node dest, HashSet<Integer> visited) {
    if (src == dest) {
      return true;
    }
    if (visited.contains(src.id)) {
      return false;
    }
    visited.add(src.id);
    for (Node child: src.adjacent) {
      if(hasPathDFS(child,dest,visited)) {
        return true;
      }
    }
    return false;
  }

  public boolean hasPathBFS(int src, int dest) {
    return hasPathBFS(getNode(src), getNode(dest));
  }

  private boolean hasPathBFS(Node src, Node dest) {
    LinkedList<Node> nextNodeToVisit = new LinkedList<>();
    HashSet<Integer> visited = new HashSet<>();

    nextNodeToVisit.add(src);
    while(!nextNodeToVisit.isEmpty()) {
      Node node = nextNodeToVisit.remove();
      if (node == dest) {
        return true;
      }

      if (visited.contains(node.id)) {
        continue;
      }

      visited.add(node.id);

      nextNodeToVisit.addAll(node.adjacent);
    }
    return false;
  }
}
