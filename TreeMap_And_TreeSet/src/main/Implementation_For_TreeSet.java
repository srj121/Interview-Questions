package main;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Implementation_For_TreeSet {
    public static void main(String[] args) {

       //TreeSet, is a sorted set that contains only unique elements
        // It uses a red-black tree data structure for its implementation and only  allow one null elements,
        // but only a single null element.

    TreeSet<Integer> set = new TreeSet<>();

        set.add(6);
        set.add(7);
        set.add(2);
        set.add(4);
        set.add(4);             //It does not allow duplicates
//      set.add(null);        //It is throwing NullPointerException

        for (int i: set){
            System.out.println(i);
        }

        //.....................................String Example..........................

        TreeSet<String> set1 = new TreeSet<>();

        set1.add("suraj");
        set1.add("null");
        set1.add("suraj");

        for (String i: set1){
            System.out.println(i);
        }
    }
}
