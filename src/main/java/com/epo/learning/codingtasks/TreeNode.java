package com.epo.learning.codingtasks;

import java.util.Random;

class TreeNode {
  int value;
  TreeNode left;
  TreeNode right;

  TreeNode(int value) {
    this.value = value;
  }

  void insert(int data) {
    if (value > data) {
      if (left == null) {
        left = new TreeNode(data);
      }
      left.insert(data);
    } else {
      if (right == null) {
        right = new TreeNode(data);
      }
      right.insert(data);
    }
  }

  boolean contains(int data) {
    if (data == value) {
      return true;
    } else if (data < value) {
      if (left != null) {
        return left.contains(data);
      }
    } else {
      if (right != null) {
        return right.contains(data);
      }
    }
    return false;
  }

  void printInOrder() {
    if (left != null) {
      left.printInOrder();
    }

    System.out.println(value);

    if (right != null) {
      right.printInOrder();
    }

  }

  void printPreOrder() {
    System.out.println(value);

    if (left != null) {
      left.printInOrder();
    }

    if (right != null) {
      right.printInOrder();
    }
  }

  void printPostOrder() {
    if (left != null) {
      left.printInOrder();
    }
    if (right != null) {
      right.printInOrder();
    }

    System.out.println(value);
  }


  public static void main(String[] args) {
    TreeNode tree = new TreeNode(2);

    Random value = new Random();
    for (int i = 0; i < 10; i++) {
      tree.insert(value.nextInt(10));
    }
  }


}
