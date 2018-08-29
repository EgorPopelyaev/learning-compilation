package com.epo.learning.ds;

public class Queue {
  private static class Node {
    int data;
    Node next;
    private Node(int data) {
      this.data = data;
    }
  }

  Node head;
  Node tail;

  public boolean isEmpty() {
    return head == null;
  }

  public int peek() {
    return head.data;
  }

  public void add(int value) {
    if(head == null) {
      head = new Node(value);
    }

    Node node = new Node(value);
    if (tail != null) {
      tail.next = node;
    }
    tail = node;
  }

  public int remove() {
    int data = head.data;
    head = head.next;

    if (head == null) {
      tail = null;
    }
    return data;
  }
}
