package com.epo.learning.codingtasks;

public class Nth {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        Node current = new Node(1, null);
        for (int i = 2; i < 8; i++) {
            current = new Node(i, current);
        }
        Node head = current;
        // head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)

        Node current2 = new Node(4, null);
        for (int i = 3; i > 0; i--) {
            current2 = new Node(i, current2);
        }
        Node head2 = current2;
        // head2 = 1 -> 2 -> 3 -> 4 -> (null)

        System.out.println(linkedListToString(nthFromLast(head, 1)));// should return 1.
        System.out.println(linkedListToString(nthFromLast(head, 5)));// should return 5.
        System.out.println(linkedListToString(nthFromLast(head2, 2)));// should return 3.
        System.out.println(linkedListToString(nthFromLast(head2, 4)));// should return 1.
        System.out.println(linkedListToString(nthFromLast(head2, 5)));// should return null.
        System.out.println(linkedListToString(nthFromLast(null, 1)));// should return null.
    }


    // Implement your function below.
    public static Node nthFromLast(Node head, int n) {
       int len = 0;
       if (head == null) {
           return null;
       }

       Node tmp = head;
       while (head != null) {
           head = head.child;
           len++;
       }

       int pointer = len - n;
       if(pointer < 0) {
           return null;
       }

       for (int i = 0; i < pointer; i++) {
           tmp = tmp.child;
       }
        return tmp;
    }
    //    // Implement your function below.
//    public static Node nthFromLast(Node head, int n) {
//        Node right = head;
//        Node left = head;
//        for(int i = 0; i < n; i++) {
//            if (right.child == null) {
//                return null;
//            }
//            right = right.child;
//        }
//
//        while (right != null) {
//            right = right.child;
//            left = left.child;
//        }
//        return left;
//    }


    //  NOTE: Feel free to use the following function for testing.
    //  It converts the given linked list into an easy-to-read string format.
    //  Example: 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)
    public static String linkedListToString(Node head) {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(String.valueOf(current.value));
            sb.append(" -> ");
            current = current.child;
        }
        sb.append("(null)");
        return sb.toString();
    }

    private static class Node{
        int value;
        Node child;
        Node(int value, Node child) {
            this.value = value;
            this.child = child;
        }
    }
 }
