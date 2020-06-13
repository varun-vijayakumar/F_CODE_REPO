package com.javaprep.arraylist;

import utils.CommonUtils;

import java.util.ArrayList;

public class ArrayListProblems {
    /**
     * Given an arrayList and an index, sort elements such that element < element at index is left,
     * greater to the right.
     * Example :
          Enter arrayList : 0 1 2 0 2 1 1
          Enter partition index : 2
          [0, 1, 0, 1, 1, 2, 2]
          Enter partition index : 3
          [0, 0, 1, 2, 2, 1, 1]
          Enter partition index : 1
          [0, 0, 1, 1, 1, 2, 2]
     * @param arrayList
     * @param index
     */
    public static void dutchFlagProblem(ArrayList<Integer> arrayList, int index) {

        /*
        int pivot = arrayList.get(index);
        int size = arrayList.size();
        int pIndex = 0;
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) < pivot) {
                CommonUtils.swapArrayListElements(arrayList, i, pIndex);
                pIndex++;
            }
        }
        pIndex = size - 1;
        for (int i = size - 1; i >= 0; i--) {
            if (arrayList.get(i) > pivot) {
                CommonUtils.swapArrayListElements(arrayList, i, pIndex);
                pIndex--;
            }
        }*/
        int size = arrayList.size();
        int pivot = arrayList.get(index);

        int smaller = 0, equal = 0, larger = size - 1;
        while(equal <= larger) {
            //System.out.println("start e = " + equal + " s = " + smaller + " l = " + larger + " array = " + arrayList);
            if (arrayList.get(equal) < pivot) {
                CommonUtils.swapArrayListElements(arrayList, equal, smaller);
                smaller++;
                equal++;
            } else if(arrayList.get(equal) > pivot) {
                CommonUtils.swapArrayListElements(arrayList, equal, larger);
                larger--;
            } else {
                equal++;
            }
            //System.out.println(" end  e = " + equal + " s = " + smaller + " l = " + larger + " array = " + arrayList);
            //System.out.println();
        }


    }
}

