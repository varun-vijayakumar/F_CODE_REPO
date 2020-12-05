package com.javaprep;


import com.javaprep.algorithms.dynamicProgramming.DpDriver;
import com.javaprep.concurrency.ThreadsDriver;
import com.javaprep.concurrency.udemy.ThreadCreation;
import com.javaprep.concurrency.udemy.vault.CrackTheVault;

import com.javaprep.algorithms.recursion.RecursionDriver;
import com.javaprep.concurrency.ThreadsDriver;
import com.javaprep.datastructures.arrays.ArraysDriver;
import com.javaprep.datastructures.hash.HashDriver;
import com.javaprep.datastructures.lists.ListDriver;
import com.javaprep.datastructures.queue.QueueDriver;
import com.javaprep.datastructures.sets.SetsDriver;

import com.javaprep.datastructures.strings.StringsDriver;
import com.javaprep.datastructures.trees.BinaryTreesDriver;

import java.util.ArrayList;
import java.util.List;

public class Main {
 

    public static void main(String[] args) {
        
        /*
        ArraysDriver.sortingDriver();
        ArraysDriver.binarySearchDriver();
        ArraysDriver.dutchFlagDriver();
        ArraysDriver.incrementAribitatryPrecisionIntegerDriver();
        ArraysDriver.rotateArrayDriver();
        ArraysDriver.twoSumDriver();
        */
        //ArraysDriver.combDriver();
         

        /*
        StringsDriver.palindromeDriver();
        StringsDriver.strToIntDriver();
        StringsDriver.intToStringDriver();
        StringsDriver.columnIdDriver();
        StringsDriver.replaceAndRemoveDriver();
        StringsDriver.atoiDriver();
        StringsDriver.uniqueSubStringLengthDriver();

        StringsDriver.stringExtractDriver();
        StringsDriver.stringCompareDriver();

        */
        //StringsDriver.stringExtractDriver();
        /*
        ListDriver.linkedListBasicDriver();
        ListDriver.javaLinkedListDriver();
        */
        //ListDriver.linkedListBasicDriver();

        /*
        StackDriver.stackBasicExample();
        StackDriver.javaStackExample();
        */

        /*
        QueueDriver.queueBasicDriver();
        QueueDriver.javaQueueDriver();
        */
        //QueueDriver.javaQueueDriver();
        /*
        HashDriver.hashBasicDriver();
        HashDriver.javaHashDriver();
        */

        //BinaryTreesDriver.binaryTreeBasicDriver();



        /*
        SetsDriver.javaSets();
        */
        //RecursionDriver.recrursionDriver();
        /*
        List<Integer> nums = new ArrayList<>();
        int[] numsList = {1,2,3,1,2};
        for (int i = 0 ; i < numsList.length; i++) {
            nums.add(numsList[i]);
        }
        int x = 4;
        /*
        int len = nums.size();
        int window = x;
        int curMax = Integer.MIN_VALUE;
        int curMin = Integer.MAX_VALUE;

        for (int i = 0; i < len ; i++) {
            System.out.println("curMax : " + curMax + " curMin : "+ curMin + " window :" + window);
            if (window > 0) {

                if (nums.get(i) < curMin) {
                    curMin = nums.get(i);
                }
            }
            if (window - 1 == 0) {
                window = x;
                if (curMin > curMax) {
                    curMax = curMin;
                }
                if (i != (len - 1)) {
                    curMin =  nums.get(i + 1);
                }
                if (window != 1) {
                    i--;
                }

            } else {
                window--;
            }
        }

        x  = 0;
        System.out.println("list : " + nums + ", window : " + x);
        System.out.println(" max : "+ segment(x, nums));

        */

        //SetsDriver.javaSets();
        // DpDriver.execute();
            /*
        ThreadsDriver.threadsRunnableDriver();
        ThreadsDriver.threadsThreadDriver();
        */

        try {
            ThreadCreation threadCreation = new ThreadCreation();
            threadCreation.createThreadUsingRunnable();
            threadCreation.createUsingThread();
        } catch (Exception e) {
            System.out.println("exception : "+ e.getClass());
        }

        new CrackTheVault().start();
    }

    public static int segment(int x, List<Integer> space) {
        if (space.size() == 0 || space == null) {
            return 0;
        }
        int len = space.size();
        int window = x;
        int curMax = Integer.MIN_VALUE;
        int curMin = Integer.MAX_VALUE;

        for (int i = 0; i < len ; i++) {
            if (window > 0) {
                // get the min of current window
                if (space.get(i) < curMin) {
                    curMin = space.get(i);
                }
            }
            if (window - 1 == 0) {
                // find the curMax of minimum of every window
                if (curMin > curMax) {
                    curMax = curMin;
                }

                // next window setting
                window = x;

                // new curMin is start of next window
                if (i != (len - 1)) {
                    curMin =  space.get(i + 1);
                }
                /**
                 * reset index as for [1,2,3] of x = 2,
                 *      [1,2] is one window, [2,3] is another
                 *  reset index as for [1,2,3] of x = 2,
                 *      [1], is one window and so is [2] and [3]
                 *  need to find minimum of all these windows.
                 */
                if (window != 1) {
                    i--;
                }

            } else {
                window--;
            }
        }
        return curMax;
    }


}
