package com.epo.learning.algorithms;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] unsortedArray = {5,3,8,2,6,4,1};
    int tmp = 0;
    boolean sorted = false;
    while (!sorted) {
      sorted = true;
      for (int i = 1; i < unsortedArray.length; i++) {
        if (unsortedArray[i] < unsortedArray[i - 1]) {
          tmp = unsortedArray[i - 1];
          unsortedArray[i - 1] = unsortedArray[i];
          unsortedArray[i] = tmp;
          sorted = false;
        }
      }
    }

    System.out.println(Arrays.toString(unsortedArray));

  }

}
