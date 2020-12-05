package com.javaprep;

import com.javaprep.algorithms.dynamicProgramming.DpDriver;
import com.javaprep.concurrency.ThreadsDriver;
import com.javaprep.concurrency.udemy.ThreadCreation;
import com.javaprep.concurrency.udemy.vault.CrackTheVault;
import com.javaprep.datastructures.strings.StringsDriver;

public class Main {
 

    public static void main(String[] args) {
        
        /*
        ArraysDriver.sortingDriver();
        ArraysDriver.binarySearchDriver();
        ArraysDriver.dutchFlagDriver();
        ArraysDriver.incrementAribitatryPrecisionIntegerDriver();
        ArraysDriver.rotateArrayDriver();
        ArraysMain.twoSumDriver();
        */
         

        /*
        StringsDriver.palindromeDriver();
        StringsDriver.strToIntDriver();
        StringsDriver.intToStringDriver();
        StringsDriver.columnIdDriver();
        StringsDriver.replaceAndRemoveDriver();
        StringsDriver.atoiDriver();
        StringsDriver.uniqueSubStringLengthDriver();
        */
        //StringsDriver.stringExtractDriver();
        /*
        ListDriver.linkedListBasicDriver();
        ListDriver.javaLinkedListDriver();
        */

        /*
        StackDriver.stackBasicExample();
        StackDriver.javaStackExample();
        */

        /*
        QueueDriver.queueBasicDriver();
        QueueDriver.javaQueueDriver();
        */

        /*
        HashDriver.hashBasicDriver();
        HashDriver.javaHashDriver();
        */

        /*
        BinaryTreesDriver.binaryTreeBasicDriver();
        */

        /*
        ThreadsDriver.threadsRunnableDriver();
        ThreadsDriver.threadsThreadDriver();
        */

        //SetsDriver.javaSets();
       // DpDriver.execute();
        try {
            ThreadCreation threadCreation = new ThreadCreation();
            threadCreation.createThreadUsingRunnable();
            threadCreation.createUsingThread();
        } catch (Exception e) {
            System.out.println("exception : "+ e.getClass());
        }

        new CrackTheVault().start();

    }


}
