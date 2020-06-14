package com.javaprep.datastructures.strings;

import java.util.Scanner;

public class StringsMain {
    public static void palindromeExample() {
        String s;
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Palindrome check, enter the string : ");
            s = in.nextLine();
            if (s.length() == 0) break;
            System.out.println(s + " : " +
                    (StringsProblems.isPalindrome(s) ? "is a palindrome " : "is NOT a palindrome"));
        }
    }

    public static void strToIntExample() {
        String s;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the num string : ");
            s = in.nextLine();
            double value = StringsProblems.stringToInteger(s);
            if (value == 0) {
                System.out.println(s + " is not a valid num string");
                continue;
            }
            System.out.println("Answer : "+ value);
        }
    }

    public static void intToStringExample() {
        int num;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the num  : ");
            num = in.nextInt();
            String value = StringsProblems.intToString(num);
            if (value == null) {
                System.out.println(num + " is not valid to convert to a string");
                continue;
            }
            System.out.println("Answer : " + value);
        }
    }
}
