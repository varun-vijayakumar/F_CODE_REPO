package com.javaprep;

import com.javaprep.datastructures.lists.ListMain;
import com.javaprep.datastructures.stacks.StacksMain;

public class Main {
    public static void main(String[] args) {

/*
        for(int i = 0; i < 5; ++i) {
            System.out.println("MAIN i : " + i);
            for (int j = i + 1; j < 5; ++j) {
                System.out.print(" i : " + i + " j : " + j);
            }
            System.out.println();
        }

        int num = 0;
        int exp = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number : ");
            num = in.nextInt();
            System.out.print("Enter exp : ");
            exp = in.nextInt();
            System.out.println("Output of " + num + "^"+exp+ "  : "+ CommonUtils.powerOf(num, exp));
        }
*/
        //ArrayListMain.sortingExample();
       // ArrayListMain.binarySearchExample();
       // ArrayListMain.dutchFlagExample();
       // StringsMain.palindromeExample();

        //StringsMain.strToIntExample();
        //StringsMain.intToStringExample();

        //ArraysMain.rotateArrayExample();
        //ListMain.linkedListBasicExample();
        //ListMain.javaLinkedListExample();

        //StacksMain.stackBasicExample();
        StacksMain.javaStackExample();
    }
}
