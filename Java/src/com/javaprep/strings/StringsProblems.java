package com.javaprep.strings;

import utils.CommonUtils;

public class StringsProblems {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static double stringToInteger(String s) {
        int size = s.length();
        int i = 0, j = size-1;
        double result = 0;
        boolean neg = false;

        for (i = 0; i < size; i++) {
            if ( s.charAt(i) == '-') {
                if (i != 0) {
                    return 0;
                }
                neg = true;
                j--;
               continue;
            }

            int c = s.charAt(i)-48;
            if (c < 0 || c > 9) {
                return 0;
            }
            result = result + (c * CommonUtils.powerOf(10, j));
            j--;
        }

        if (neg) {
            result = 0 - result;
        }
        return result;
    }

    public static String intToString(int num) {
        StringBuilder finalString = new StringBuilder();
        int result = 0;
        boolean neg = false;
        if (num < 0) {
           neg = true;
           num = -(num);
        }
        while((num / 10) != 0 ) {
            result = num % 10;
            num = num / 10;
            finalString.append(result);
        }
        finalString.append(num % 10);
        if (neg) finalString.append("-");
        finalString.reverse();
        return finalString.toString();
    }
}
