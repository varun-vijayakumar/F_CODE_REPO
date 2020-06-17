package com.javaprep.datastructures.trees;

public class BinaryTreesMain {
    public static void binaryTreeBasicExample() {
        BinaryTreeBasic binaryTreeBasic = new BinaryTreeBasic();
        System.out.println("++++++++ BINARY TREE BASIC TEST +++++++++++++++++");
        System.out.println("ADD TEST");
        System.out.println("Initial Size : " + binaryTreeBasic.getSize());

        binaryTreeBasic.add(15);
        binaryTreeBasic.add(3);
        binaryTreeBasic.add(2);
        binaryTreeBasic.add(1);
        binaryTreeBasic.add(5);
        binaryTreeBasic.add(4);
        binaryTreeBasic.add(6);
        binaryTreeBasic.add(16);
        binaryTreeBasic.add(19);

        System.out.println("Final Size : " + binaryTreeBasic.getSize());
        System.out.println("------------------------");
        System.out.println("CONTAINS TEST");
        int[] nums = {15, 120, 3, 0, 5, 6, 19, 100};
        for (int number : nums) {
            System.out.println("Contains : " + number + " ==>  "  + binaryTreeBasic.contains(number));
        }

        System.out.println("------------------------");
        System.out.println("PRINT TEST");
        System.out.println(binaryTreeBasic.inOrderToString());
        System.out.println(binaryTreeBasic.preOrderToString());
        System.out.println(binaryTreeBasic.postOrderToString());

        System.out.println("------------------------");
        System.out.println("DELETE TEST");
        //binaryTreeBasic.delete(3);
        //System.out.println(binaryTreeBasic.inOrderToString());
    }
}
