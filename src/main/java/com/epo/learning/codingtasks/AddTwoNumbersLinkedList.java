package com.epo.learning.codingtasks;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbersLinkedList {

  public static void main(String[] args) {
    AddTwoNumbersLinkedList atnl = new AddTwoNumbersLinkedList();

    int[] array1 = {3, 4, 2};
    ListNode l1 = new ListNode(array1[0]);
    for(int i = 1; i < array1.length; i++) {
      l1 = createLinkedList(array1[i], l1);
    }

    int[] array2 = {4, 6, 5};
    ListNode l2 = new ListNode(array2[0]);
    for(int i = 1; i < array2.length; i++) {
      l2 = createLinkedList(array2[i], l2);
    }

    atnl.addTwoNumbers(l1, l2);
  }

    private static class ListNode {
        int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }

//  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//  Output: 7 -> 0 -> 8
//  Explanation: 342 + 465 = 807.

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //sum each elem and store in the list
    //if sum == 10 store 0 and add 1 to next sum;
    //return a new linkedlist
//    List<Integer> sumStorage = new ArrayList<>();
//    boolean isTen = false;
//    while(l1 != null && l2 != null) {
//      int sum = l1.val + l2.val;
//      if(sum != 10) {
//        if (!isTen) {
//          sumStorage.add(sum);
//        } else {
//          sumStorage.add(sum + 1);
//          isTen = false;
//        }
//      } else {
//        sumStorage.add(0);
//        isTen = true;
//      }
//      l1 = l1.next;
//      l2 = l2.next;
//    }
//
//    int size = sumStorage.size();
//    ListNode head = new ListNode(sumStorage.get(size - 1));
//    for (int i = size - 2; i >= 0; i--) {
//      head = createLinkedList(sumStorage.get(i), head);
//    }
//
//    return head;
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
      int x = (p != null) ? p.val : 0;
      int y = (q != null) ? q.val : 0;
      int sum = carry + x + y;
      carry = sum / 10;
      curr.next = new ListNode(sum % 10);
      curr = curr.next;
      if (p != null) p = p.next;
      if (q != null) q = q.next;
    }
    if (carry > 0) {
      curr.next = new ListNode(carry);
    }
    return dummyHead.next;
  }

  private static ListNode createLinkedList(int val, ListNode head) {
    ListNode newHead = new ListNode(val);
    newHead.next = head;
    head = newHead;
    return head;
  }

}
