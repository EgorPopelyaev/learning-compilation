package com.epo.learning.codingtasks;

public class OA {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
       System.out.println(isOneAway("abcde", "abcd"));  // should return true
        System.out.println(isOneAway("abde", "abcde"));  // should return true
        System.out.println(isOneAway("a", "a"));  // should return true
        System.out.println(isOneAway("abcdef", "abqdef"));  // should return true
        System.out.println(isOneAway("abcdef", "abccef"));  // should return true
        System.out.println(isOneAway("abcdef", "abcde"));  // should return true
        System.out.println(isOneAway("aaa", "abc"));  // should return false
        System.out.println(isOneAway("abcde", "abc"));  // should return false
        System.out.println(isOneAway("abc", "abcde"));  // should return false
        System.out.println(isOneAway("abc", "bcc"));  // should return false
    }

    // Implement your solution below.
    public static Boolean isOneAway(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 - len2 >= 2 || len2 - len1 >= 2) {
            return false;
        }


        if (len1 == len2) {
            int difCounter = 0;
            int p1 = 0, p2 = 0;
            while (p1 < len1 && p2 < len2) {
                if (s1.charAt(p1) != s2.charAt(p2)) {
                   difCounter ++;
                }
                if (difCounter > 1) {
                    return false;
                }
                p1 ++;
                p2 ++;
            }
        }

        if ( len1 - len2 == 1) {
            int difCounter = 0;
            int p1 = 0, p2 = 0;
            while(p2 < len2) {
                if (s1.charAt(p1) != s2.charAt(p2)) {
                    difCounter ++;
                    p1 ++;
                } else {
                    p1 ++;
                    p2 ++;
                }
                if (difCounter > 1) {
                    return false;
                }
            }
        }

        if ( len2 - len1 == 1) {
            int difCounter = 0;
            int p1 = 0, p2 = 0;
            while(p2 < len1) {
                if (s1.charAt(p1) == s2.charAt(p2)) {
                    p1 ++;
                    p2 ++;
                } else {
                    difCounter ++;
                    p2 ++;
                }
                if (difCounter > 1) {
                    return false;
                }
            }
        }

        return true;
    }

//    public static Boolean isOneAway(String s1, String s2) {
//        if (s1.length() - s2.length() >= 2 || s2.length() - s1.length() >= 2) {
//            return false;
//        } else if (s1.length() == s2.length()) {
//            return isOneAwaySameLength(s1, s2);
//        } else if (s1.length() > s2.length()) {
//            return isOneAwayDiffLengths(s1, s2);
//        } else {
//            return isOneAwayDiffLengths(s2, s1);
//        }
//    }
//
//    public static Boolean isOneAwaySameLength(String s1, String s2) {
//        int countDiff = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) != s2.charAt(i)) {
//                countDiff += 1;
//                if (countDiff > 1) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    // Assumption: s1.length() == s2.length() + 1
//    public static Boolean isOneAwayDiffLengths(String s1, String s2) {
//        int i = 0;
//        int countDiff = 0;
//        while (i < s2.length()) {
//            if (s1.charAt(i + countDiff) == s2.charAt(i)) {
//                i += 1;
//            } else {
//                countDiff += 1;
//            }
//            if (countDiff > 1) {
//                return false;
//            }
//        }
//        return true;
//    }
}