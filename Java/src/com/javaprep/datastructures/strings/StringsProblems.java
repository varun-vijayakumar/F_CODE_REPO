package com.javaprep.datastructures.strings;

import utils.CommonUtils;

public class StringsProblems {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
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
        int i = 0, j;
        double result = 0;
        boolean negative = false;

        for (j = size - 1; j >= 0; j--) {
            if (s.charAt(j) == '-') {
                if (j != 0) {
                    return 0;
                }
                negative = true;
                break;
            }

            int c = s.charAt(j) - 48;
            if (c < 0 || c > 9) {
                return 0;
            }
            result = result + (c * CommonUtils.powerOf(10, i));
            i++;
        }

        if (negative) {
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
        while ((num / 10) != 0) {
            result = num % 10;
            num = num / 10;
            finalString.append(result);
        }
        finalString.append(num % 10);
        if (neg) finalString.append("-");
        finalString.reverse();
        return finalString.toString();
    }

    /**
     * Alphabetical encoding of spreadsheets column id to integer ids.
     * Column Ids  - A,B,--,Z,AA, AB, --, AZ, -- ZZ, AAA, ---- ZZZ.
     * A - 1, B - 26
     * AA - 27, ZZ - 702
     *
     * @param col - column id in string
     * @return - column id in int
     */
    public static int columnId(String col) {
        int result = 0;
        for (int i = 0; i < col.length(); i++) {
            result = (result * 26) + (col.charAt(i) - 64) ;
        }
        return result;
    }


    public static int replaceAndRemove(char[] s, int size) {
        int wIdx = 0, aCount = 0;
        for (int i = 0; i< size; i++) {
             if (s[i] != 'b') {
                 s[wIdx++] = s[i];
             }
             if(s[i] == 'a') {
                 aCount++;
             }
        }

        int curIdx = wIdx - 1;
        wIdx = wIdx + aCount - 1;
        int finalSize = wIdx + 1;

        while(curIdx >= 0) {
            if(s[curIdx] == 'a') {
                s[wIdx--] = 'd';
                s[wIdx--] = 'd';
            } else  {
                s[wIdx--] = s[curIdx];
            }
            curIdx--;
        }
        return finalSize;
    }
}
