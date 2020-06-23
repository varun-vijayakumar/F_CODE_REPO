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
     * Source :  Element of Prgramming Interview - Strings
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

    /**
     * Source :  Element of Prgramming Interview - Strings
     * Given an char array, replace all occurance of 'a' with 'dd' and
     * remove all occurance of 'bb'
     * @param s
     * @param size
     * @return
     */
    public static int replaceAndRemove(char[] s, int size) {
        System.out.println("Array Length start : " + s.length);
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
        System.out.println("Array Length end : " + s.length);
        return finalSize;
    }

    /**
     * Source :  Leetcode.
     *
     * Implement atoi which converts a string to an integer.
     *
     * The function first discards as many whitespace characters as necessary until the first non-whitespace
     * character is found. Then, starting from this character, takes an optional initial plus or minus sign followed
     * by as many numerical digits as possible, and interprets them as a numerical value.
     *
     * The string can contain additional characters after those that form the integral number, which are ignored and
     * have no effect on the behavior of this function.
     *
     * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence
     * exists because either str is empty or it contains only whitespace characters, no conversion is performed.
     *
     * If no valid conversion could be performed, a zero value is returned.
     *
     * Note:
     *
     * Only the space character ' ' is considered as whitespace character.
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed
     * integer range: [−231,  231 − 1].
     * If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or
     * INT_MIN (−231) is returned.
     * Example 1:
     *
     * Input: "42"
     * Output: 42
     * Example 2:
     *
     * Input: "   -42"
     * Output: -42
     * Explanation: The first non-whitespace character is '-', which is the minus sign.
     *              Then take as many numerical digits as possible, which gets 42.
     * Example 3:
     *
     * Input: "4193 with words"
     * Output: 4193
     * Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
     * Example 4:
     *
     * Input: "words and 987"
     * Output: 0
     * Explanation: The first non-whitespace character is 'w', which is not a numerical
     *              digit or a +/- sign. Therefore no valid conversion could be performed.
     * Example 5:
     *
     * Input: "-91283472332"
     * Output: -2147483648
     * Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
     *              Thefore INT_MIN (−231) is returned.
     * @param str string to convert
     * @return integer.
     */
    public static int myAtoi(String str) {
        int len;
        double result = 0;
        boolean negative = false;
        boolean positive = false;
        int count = 0;

        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }



        if (str.charAt(0) == '-') {
            negative = true;
        } else if(str.charAt(0) == '+') {
            positive = true;
        }

        StringBuffer strNum = new StringBuffer();
        len = str.length();
        for (int i = ((negative || positive) ? 1 : 0); i < len; i++) {
            int c = str.charAt(i) - 48;
            if (c < 0 || c > 9) {
                break;
            }
            strNum.append(c);
        }

        String numString = strNum.toString();
        System.out.println(numString);
        for(int i = 0; i < numString.length(); i++) {
            int c = numString.charAt(i) - '0';
            double power = Math.pow(10, numString.length() - (i+1));
            result = result + c * power ;
            if (result > Integer.MAX_VALUE) {
                if (negative) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }

        }

        if (negative) {
            result = 0 - result;
        }
        return (int)result;
    }
}
