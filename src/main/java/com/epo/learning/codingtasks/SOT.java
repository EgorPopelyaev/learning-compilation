package com.epo.learning.codingtasks;

import java.util.*;

public class SOT {
  public static void main(String[] args) {
    int[] input = {2,1,4,5,7,9};
    int target = 6;

    SOT sot = new SOT();
    int[] result = sot.sumOfTwo(input, target);
    System.out.println("result array: " + Arrays.toString(result));
  }

  public int[] sumOfTwo(int[] array, int target) {

    List<Integer> resultIndexes = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();

    int diff;
    for (int i = 0; i < array.length - 1; i++){

      //i = 0 / 6-2 = 4 dif / difference(4,0)
      //i = 1 / 6-1=5 dif / differnece(5,1)
      //i=2 / if differencecontains(a[i])
                  //resultIndexes.add(dif)
      diff = target - array[i];
      if (map.containsKey(diff)) {
        return new int[] {map.get(diff), i};
      }
      map.put(array[i], i);
    }
//
//    for (int i = 0; i < array.length - 1; i++) {
//      if (array[i] + array[i+1] == target) {
//        resultIndexes.add(i);
//        resultIndexes.add(i+1);
//      }
//
//    }
//
    int[] arrayOfIndexes = new int[resultIndexes.size()];
    int i = 0;
    for (Integer integ : resultIndexes) {
      arrayOfIndexes[i] = integ;
      i++;
    }



    return arrayOfIndexes;
  }
}
