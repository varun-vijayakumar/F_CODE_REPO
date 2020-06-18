package com.javaprep;

import com.javaprep.datastructures.arrays.ArrayListProblems;
import com.javaprep.datastructures.arrays.ArraysMain;
import com.javaprep.datastructures.hash.HashBasic;
import com.javaprep.datastructures.hash.HashMain;
import com.javaprep.datastructures.queue.QueueMain;
import com.javaprep.datastructures.stacks.StackMain;
import com.javaprep.datastructures.strings.StringsMain;
import com.javaprep.datastructures.trees.BinaryTreesMain;

import java.util.HashMap;

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
        //ArraysMain.sortingExample();
       // ArraysMain.binarySearchExample();
       // ArraysMain.dutchFlagExample();
        //ArraysMain.incrementAribitatryPrecisionIntegerExample();
       // StringsMain.palindromeExample();

        //StringsMain.strToIntExample();
        //StringsMain.intToStringExample();

        //ArraysMain.rotateArrayExample();
        //ListMain.linkedListBasicExample();
        //ListMain.javaLinkedListExample();®R
        //StackMain.stackBasicExample();
        //StackMain.javaStackExample();

        //QueueMain.queueBasicExample();
        //QueueMain.javaQueueExample();

        //HashMain.hashBasicExample();
        //HashMain.javaHashExample();

        BinaryTreesMain.binaryTreeBasicExample();

    }


}
