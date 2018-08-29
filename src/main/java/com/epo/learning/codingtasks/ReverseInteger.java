package com.epo.learning.codingtasks;

public class ReverseInteger {

  public static void main(String[] args) {
    ReverseInteger ri = new ReverseInteger();
    ri.reversInt(-123);
  }

  public int reversInt(int x) {
    int result = 0;

    while(x != 0) {
      int rest = 0;
      rest = x % 10;
      result = result * 10 + rest;
      x = x / 10;
    }
    return result;
  }
}
