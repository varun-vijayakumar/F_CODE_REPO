package com.javaprep.datastructures.sets;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsDriver {
    public static void javaSets() {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("this");
        hashSet.add("is");
        hashSet.add("a");
        hashSet.add("test");
        System.out.println(hashSet);
        hashSet.add("test2");
        hashSet.add("test");
        hashSet.add(null);
        hashSet.add("");
        System.out.println(hashSet);


        System.out.println("Contains : this -> " + hashSet.contains("this"));
        System.out.println("Contains : set --> " + hashSet.contains("set"));
        System.out.println("Contains : test2 -> " + hashSet.contains("test2"));
        hashSet.remove("test2");
        System.out.println(hashSet);
        System.out.println("Contains : test2 -> " + hashSet.contains("test2"));

        for (String element : hashSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));

        Set<Integer> union = new HashSet<>(a);
        Set<Integer> intersection = new HashSet<>(a);
        Set<Integer> difference = new HashSet<>(a);

        union.addAll(b);
        intersection.retainAll(b);
        difference.removeAll(b);

        System.out.println(" a     : " + a);
        System.out.println(" b     : " + b);
        System.out.println(" a U b : " + union);
        System.out.println(" a n b : " + intersection);
        System.out.println(" a - b : " + difference);

        for (Integer element : union) {
            System.out.print(element + " ");
        }
        System.out.println();




    }
}
