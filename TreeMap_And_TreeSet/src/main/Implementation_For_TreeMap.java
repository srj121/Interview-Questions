package main;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Implementation_For_TreeMap {
    public static void main(String[] args) {

        //TreeMap is a key-value mapping collection that is sorted based on the natural ordering of its keys,
        // or by a Comparator provided at the time of TreeMap creation.
        // TreeMap uses a red-black tree data structure for its implementation, and allows null values but not null keys.

    TreeMap<Integer,String> map = new TreeMap<>(Collections.reverseOrder()); //just Reversing for fun

    map.put(1,"suraj");
    map.put(2,"rahul");
    map.put(2,"suchit");
    map.put(4,"");
    map.put(5,"");
//  map.put(null,"dummy");  //It will throw NullPointerException
    map.put(3,"asif");

    for(Map.Entry<Integer,String> entry : map.entrySet()){
        System.out.println(entry.getKey()+ " : "+entry.getValue());
    }
    }


}
