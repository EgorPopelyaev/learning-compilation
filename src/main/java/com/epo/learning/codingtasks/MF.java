/*
 * Copyright 2018. All rights reserved. All rights, titles and interest in and to this software are
 * owned by Market Logic Software AG, Berlin, Germany. Permission to use, copy, modify, distribute
 * or otherwise make this software available to any third party and for any purpose requires a
 * signed licensing agreement. Visit us at www.MarketLogicSoftware.com for commercial licensing
 * opportunities.
 */
package com.epo.learning.codingtasks;

import com.epo.learning.algorithms.MergeSort;

import java.util.ArrayList;
import java.util.List;

public class MF {
  public static void main(String[] args) {

    // NOTE: The following input values are used for testing your solution.

    int[] array1A = {1, 3, 4, 6, 7, 9};
    int[] array2A = {1, 2, 4, 5, 9, 10};
    // commonElements(array1A, array2A) should return [1, 4, 9] (an array).
    System.out.print(commonElements(array1A, array2A));

    int[] array1B = {1, 2, 9, 10, 11, 12};
    int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
    // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).
    System.out.print(commonElements(array1B, array2B));

    int[] array1C = {0, 1, 2, 3, 4, 5};
    int[] array2C = {6, 7, 8, 9, 10, 11};
    System.out.print(commonElements(array1C, array2C)); // should return [] (an empty array).
  }

  // Implement your solution below.
  // NOTE: Remember to return an Integer array, not an int array.
  public static Integer[] commonElements(int[] array1, int[] array2) {
    Integer[] resultInArray = new Integer[0];
    List<Integer> resultInArrayList = new ArrayList<>();

    if (array1.length >= array2.length) {
      for (int elem_a1 : array1) {
        for (int elem_a2 : array2) {
          if (elem_a1 == elem_a2) {
            resultInArrayList.add(elem_a1);
            break;
          }
        }
      }
    } else {
      for (int elem_a2 : array2) {
        for (int elem_a1 : array1) {
          if (elem_a2 == elem_a1) {
            resultInArrayList.add(elem_a2);
          }
        }
      }
    }

    return resultInArrayList.toArray(resultInArray);
  }
}
